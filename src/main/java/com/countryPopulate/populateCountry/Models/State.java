package com.countryPopulate.populateCountry.Models;



import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "state")
public class State implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	
	private String name;
	private Country countryId;
	private Set<City> cities = new HashSet<City>(0);

	public State() {
	}

	public State(Country country, String name) {
		this.countryId = country;
		this.name = name;
	}

	public State(Country country, String name, Set<City> cities) {
		this.countryId = country;
		this.name = name;
		this.cities = cities;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "countryId", nullable = false)
	public Country getCountry() {
		return this.countryId;
	}

	public void setCountry(Country country) {
		this.countryId = country;
	}

	@Column(name = "name", nullable = false, length = 250)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "state")
	public Set<City> getCities() {
		return this.cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}
}
package co.simplon.poleEmploi.patrimoine.modele;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;


/**
 * The persistent class for the MONUMENTS database table.
 * 
 */
@Entity
@Table(name="MONUMENTS")
@NamedQuery(name="Monument.findAll", query="SELECT m FROM Monument m")
public class Monument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CITIES_ID")
	private int citiesId;
	@Id
	private Long id;

	private String name;

	public Monument() {
	}

	public int getCitiesId() {
		return this.citiesId;
	}

	public void setCitiesId(int citiesId) {
		this.citiesId = citiesId;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 @OneToMany()

		@JoinColumn(name="CITIES_ID")

		private Set<Monument> monuments;
		public Set<Monument>GetMonuments(){
			return monuments;

}}
package co.simplon.poleEmploi.patrimoine.modele;
import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name="CITIES")

public class Ville {
	 
@Id	@Column(name="ID")

	private Long id;

@Column(name="NAME") 
private String nom;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
		public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Column(name="LONGITUDE")
	public Double longitude;

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	@Column(name="LATITUDE")
	public Double latitude;

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	@OneToMany()

	@JoinColumn(name="CITIES_ID")

	private Set<Monument> monuments;
	public Set<Monument>GetMonuments(){
		return monuments;
	}
	
	
}

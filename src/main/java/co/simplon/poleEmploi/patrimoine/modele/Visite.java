package co.simplon.poleEmploi.patrimoine.modele;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="VISITS")
@NamedQuery(name="visits.findAll", query="SELECT m FROM Visite m")
public class Visite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	@Column(name="ID")
	private Long ID;
	

	@Column(name="DATE_VISITE") 
	private Date Datevisite;
	
	@Column(name="MONUMENT_ID") 
	private Long Monumentid;


		
	
}


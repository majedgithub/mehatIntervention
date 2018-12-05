package org.sid.mehatIntervention.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Intervention implements Serializable{

	@Id @GeneratedValue
	private Long id;
	private String libelle;
	private String description;
	private Date dateIntervention;
	private String bureau;
	private String etat;
	private String demandeur2;
	@ManyToOne
	@JoinColumn(name="code_personne")
	private Personne personne;
	
	@OneToOne(mappedBy="intervention")
	private Diagnostic diagnostic;

	
	
	public Intervention() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Intervention(String libelle, String description, Date dateIntervention, String bureau, String etat,
			String demandeur2, Personne personne) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.dateIntervention = dateIntervention;
		this.bureau = bureau;
		this.etat = etat;
		this.demandeur2 = demandeur2;
		this.personne = personne;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateIntervention() {
		return dateIntervention;
	}

	public void setDateIntervention(Date dateIntervention) {
		this.dateIntervention = dateIntervention;
	}

	public String getBureau() {
		return bureau;
	}

	public void setBureau(String bureau) {
		this.bureau = bureau;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getDemandeur2() {
		return demandeur2;
	}

	public void setDemandeur2(String demandeur2) {
		this.demandeur2 = demandeur2;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Diagnostic getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(Diagnostic diagnostic) {
		this.diagnostic = diagnostic;
	}
	
	
	
}

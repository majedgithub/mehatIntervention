package org.sid.mehatIntervention.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PERSONNE", discriminatorType=DiscriminatorType.STRING, length=4)
public abstract class Personne implements Serializable{
	
	@Id @GeneratedValue
	private Long id;
	private String ip;
	private String nom;
	private String direction;
	private String bureau;
	private int tel;
	
	@OneToMany(mappedBy="personne",fetch=FetchType.LAZY)
	List<Intervention> listInterventions;
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(String ip, String nom, String direction, String bureau, int tel) {
		super();
		this.ip = ip;
		this.nom = nom;
		this.direction = direction;
		this.bureau = bureau;
		this.tel = tel;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getBureau() {
		return bureau;
	}
	public void setBureau(String bureau) {
		this.bureau = bureau;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public List<Intervention> getListInterventions() {
		return listInterventions;
	}
	public void setListInterventions(List<Intervention> listInterventions) {
		this.listInterventions = listInterventions;
	}
	
	

}

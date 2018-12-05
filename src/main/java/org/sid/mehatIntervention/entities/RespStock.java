package org.sid.mehatIntervention.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("resp")
public class RespStock extends Personne{

	private List<Materiel> listMateriels;
	
	public RespStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RespStock(String ip, String nom, String direction, String bureau, int tel) {
		super(ip, nom, direction, bureau, tel);
		// TODO Auto-generated constructor stub
	}

	public List<Materiel> getListMateriels() {
		return listMateriels;
	}

	public void setListMateriels(List<Materiel> listMateriels) {
		this.listMateriels = listMateriels;
	}

	
}

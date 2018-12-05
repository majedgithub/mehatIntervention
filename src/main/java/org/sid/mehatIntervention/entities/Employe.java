package org.sid.mehatIntervention.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("empl")
public class Employe extends Personne{

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(String ip, String nom, String direction, String bureau, int tel) {
		super(ip, nom, direction, bureau, tel);
		// TODO Auto-generated constructor stub
	}

	
}

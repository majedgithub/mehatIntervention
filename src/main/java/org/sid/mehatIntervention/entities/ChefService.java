package org.sid.mehatIntervention.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("chef")
public class ChefService extends Personne{

	public ChefService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChefService(String ip, String nom, String direction, String bureau, int tel) {
		super(ip, nom, direction, bureau, tel);
		// TODO Auto-generated constructor stub
	}

	
}

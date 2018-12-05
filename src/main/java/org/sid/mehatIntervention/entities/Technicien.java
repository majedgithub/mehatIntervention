package org.sid.mehatIntervention.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("tech")
public class Technicien extends Personne{

	private List<Diagnostic> listDiagnostics;
	
	public Technicien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technicien(String ip, String nom, String direction, String bureau, int tel) {
		super(ip, nom, direction, bureau, tel);
		// TODO Auto-generated constructor stub
	}

	public List<Diagnostic> getListDiagnostics() {
		return listDiagnostics;
	}

	public void setListDiagnostics(List<Diagnostic> listDiagnostics) {
		this.listDiagnostics = listDiagnostics;
	}

	
}

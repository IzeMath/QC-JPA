package org.quizcon;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reponse
 *
 */
@Entity

public class Reponse implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String libelle;

	public Reponse() {
		super();
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
   
}

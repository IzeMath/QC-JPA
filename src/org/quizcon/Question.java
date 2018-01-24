package org.quizcon;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Questions
 *
 */
@Entity
public class Question implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	private int ID;
	private String theme;
	private String libelle;
	@OneToMany(fetch=FetchType.EAGER)
	private List<Reponse> listReponse;
	@OneToOne(fetch=FetchType.EAGER)
	private Reponse laReponse;
	
	
	public Question() {
		super();
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getTheme() {
		return theme;
	}


	public void setTheme(String theme) {
		this.theme = theme;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public List<Reponse> getListReponse() {
		return listReponse;
	}


	public void setListReponse(List<Reponse> listReponse) {
		this.listReponse = listReponse;
	}


	public Reponse getLaReponse() {
		return laReponse;
	}


	public void setLaReponse(Reponse laReponse) {
		this.laReponse = laReponse;
	}
   
	
	
}

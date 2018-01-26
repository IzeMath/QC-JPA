package org.quizcon;

import java.io.Serializable;
import java.net.URL;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Questions
 *
 */
@Entity
public abstract class Question implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int ID;
	private String theme;
	private String difficulte;
	private String libelle;
	private String explications;
	private URL contenuURL;
	private boolean isVal = false;

	public Question() {
		super();
	}

	public Question(final String theme, final String difficulte, final String libelle, final String explications) {
		super();
		this.theme = theme;
		this.difficulte = difficulte;
		this.libelle = libelle;
		this.explications = explications;
	}



	public int getID() {
		return ID;
	}

	public void setID(final int iD) {
		ID = iD;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(final String theme) {
		this.theme = theme;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(final String libelle) {
		this.libelle = libelle;
	}

	public String getExplications() {
		return explications;
	}

	public void setExplications(final String explications) {
		this.explications = explications;
	}

	public URL getContenuURL() {
		return contenuURL;
	}

	public void setContenuURL(final URL contenuURL) {
		this.contenuURL = contenuURL;
	}

	public void setVal(final boolean isVal) {
		this.isVal = isVal;
	}

	public boolean isVal() {
		return isVal;
	}

	public String getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(final String difficulte) {
		this.difficulte = difficulte;
	}
	
	

}

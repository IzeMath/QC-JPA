package org.quizcon;

import java.io.Serializable;
import java.net.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Entity implementation class for Entity: Questions
 *
 */

@NamedQueries({ @NamedQuery(name = "getRandomQuestion", query = "SELECT q FROM Question q ORDER BY RAND()"),
		@NamedQuery(name = "getAllTheme", query = "SELECT DISTINCT q.theme FROM Question q"),
		@NamedQuery(name = "getAllDifficulties", query = "SELECT DISTINCT q.difficulte FROM Question q"),
		@NamedQuery(name = "getNbQuestionInWhere", query = "SELECT COUNT(q) FROM Question q WHERE q.difficulte IN :listDifficulties AND q.theme IN :listThemes")
})

@Entity
public abstract class Question implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
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
		return id;
	}

	public void setID(final int iD) {
		id = iD;
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

	@Override
	public String toString() {
		return "Question [id=" + id + ", theme=" + theme + ", difficulte=" + difficulte + ", libelle=" + libelle
				+ ", explications=" + explications + ", contenuURL=" + contenuURL + ", isVal=" + isVal + "]";
	}

}

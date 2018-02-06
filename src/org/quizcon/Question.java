package org.quizcon;

import java.io.Serializable;
import java.net.URL;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Questions
 *
 */

@NamedQueries({ @NamedQuery(name = "getRandomQuestion", query = "SELECT q FROM Question q ORDER BY RAND()"),
		@NamedQuery(name = "getAllThemes", query = "SELECT DISTINCT q.theme FROM Question q"),
		@NamedQuery(name = "getAllDifficulties", query = "SELECT DISTINCT q.difficulte FROM Question q"),
		@NamedQuery(name = "getAllLangs", query = "SELECT DISTINCT q.lang FROM Question q"),
		@NamedQuery(name = "getNbQuestionsInWhere", query = "SELECT COUNT(q) FROM Question q WHERE q.difficulte IN :listDifficulties AND q.theme IN :listThemes AND q.lang IN :listLangs"),
		@NamedQuery(name = "getQuestionsInWhere", query = "SELECT q FROM Question q WHERE q.difficulte IN :listDifficulties AND q.theme IN :listThemes AND q.lang IN :listLangs ORDER BY RAND()")
})

@Entity
public class Question implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String theme;
	private String difficulte;
	private String libelle;
	private String explications;
	private URL contenuURL;
	private String lang;
	private boolean isVal = false;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Reponse> listRep;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Reponse laReponse;

	public Question() {
		super();
	}	

	public Question(final String theme, final String difficulte, final String libelle, final String lang, final List<Reponse> listRep,
			final Reponse laReponse) {
		super();
		this.theme = theme;
		this.difficulte = difficulte;
		this.libelle = libelle;
		this.lang = lang;
		this.listRep = listRep;
		this.laReponse = laReponse;
	}

	public Question(final String theme, final String difficulte, final String libelle, final String explications, final URL contenuURL, final String lang,
			final boolean isVal, final List<Reponse> listRep, final Reponse laReponse) {
		super();
		this.theme = theme;
		this.difficulte = difficulte;
		this.libelle = libelle;
		this.explications = explications;
		this.contenuURL = contenuURL;
		this.lang = lang;
		this.isVal = isVal;
		this.listRep = listRep;
		this.laReponse = laReponse;
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

	public String getLang() {
		return lang;
	}

	public void setLang(final String lang) {
		this.lang = lang;
	}
	

	public List<Reponse> getListRep() {
		return listRep;
	}
	
	public String[] getListRepInString() {
		final String[] listR = new String[listRep.size()];
		for(int i = 0 ; i<listRep.size();i++) {
			listR[i] = listRep.get(i).getLibelle();
		}
		return listR;
	}

	public void setListRep(final List<Reponse> listRep) {
		this.listRep = listRep;
	}

	public Reponse getLaReponse() {
		return laReponse;
	}

	public void setLaReponse(final Reponse laReponse) {
		this.laReponse = laReponse;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", theme=" + theme + ", difficulte=" + difficulte + ", libelle=" + libelle
				+ ", explications=" + explications + ", contenuURL=" + contenuURL + ", lang=" + lang + ", isVal="
				+ isVal + ", listRep=" + listRep + ", laReponse=" + laReponse + "]";
	}

	

}

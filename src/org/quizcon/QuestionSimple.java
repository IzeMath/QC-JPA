package org.quizcon;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: QuestionSimple
 *
 */
@Entity
public class QuestionSimple extends Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Reponse> listRep;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Reponse laReponse;

	public QuestionSimple() {
		super();
	}

	public QuestionSimple(final String theme, final String difficulte, final String libelle, final String explications,
			final List<Reponse> listRep, final Reponse laReponse, final String lang) {
		super(theme, difficulte, libelle, explications, lang);
		this.listRep = listRep;
		this.laReponse = laReponse;
		// TODO Auto-generated constructor stub
	}

	public List<Reponse> getListRep() {
		return listRep;
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
		return super.toString() + " QuestionSimple [listRep=" + listRep + ", laReponse=" + laReponse + "]";
	}
	
	

}

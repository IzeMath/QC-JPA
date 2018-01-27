package org.quizcon;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: QuestionVF
 *
 */
@Entity
public class QuestionVF extends Question implements Serializable {
	private static final long serialVersionUID = 1L;

	public boolean reponse;

	public QuestionVF() {
		super();
	}

	public QuestionVF(final String theme, final String difficulte, final String libelle, final String explications,
			final boolean reponse) {
		super(theme, difficulte, libelle, explications);
		this.reponse = reponse;
	}

	public boolean isReponse() {
		return reponse;
	}

	public void setReponse(final boolean reponse) {
		this.reponse = reponse;
	}

	@Override
	public String toString() {
		return super.toString() + " QuestionVF [reponse=" + reponse + "]";
	}

}

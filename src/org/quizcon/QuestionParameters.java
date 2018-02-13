package org.quizcon;

import java.io.Serializable;
import java.util.ArrayList;

public class QuestionParameters implements Serializable {
	private static final long serialVersionUID = 1L;
	private ArrayList<String> arlg = new ArrayList<>();
	private ArrayList<String> arth = new ArrayList<>();
	private ArrayList<String> ardf = new ArrayList<>();
	private int nbQuestion = 0;

	public QuestionParameters() {
	}

	public void addLang(final String lang) {
		arlg.add(lang);
	}

	public void addTheme(final String theme) {
		arth.add(theme);
	}

	public void addDifficulty(final String df) {
		ardf.add(df);
	}

	public int getNbQuestion() {
		return nbQuestion;
	}

	public void setNbQuestion(final int nbQuestion) {
		this.nbQuestion = nbQuestion;
	}

	public ArrayList<String> getArlg() {
		return arlg;
	}

	public ArrayList<String> getArth() {
		return arth;
	}

	public ArrayList<String> getArdf() {
		return ardf;
	}

	public void setArlg(final ArrayList<String> arlg) {
		this.arlg = arlg;
	}

	public void setArth(final ArrayList<String> arth) {
		this.arth = arth;
	}

	public void setArdf(final ArrayList<String> ardf) {
		this.ardf = ardf;
	}

	@Override
	public String toString() {
		return "QuestionParameters [arlg=" + arlg + ", arth=" + arth + ", ardf=" + ardf + ", nbQuestion=" + nbQuestion
				+ "]";
	}

}

package org.user;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Statistique
 *
 */
@Entity

public class Statistique implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String theme;
	private int nbQuestions;
	private int nbReponse;
	

	public Statistique() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(final int id) {
		this.id = id;
	}


	public String getTheme() {
		return theme;
	}


	public void setTheme(final String theme) {
		this.theme = theme;
	}


	public int getNbQuestions() {
		return nbQuestions;
	}


	public void setNbQuestions(final int nbQuestions) {
		this.nbQuestions = nbQuestions;
	}


	public int getNbReponse() {
		return nbReponse;
	}


	public void setNbReponse(final int nbReponse) {
		this.nbReponse = nbReponse;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((theme == null) ? 0 : theme.hashCode());
		return result;
	}


	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Statistique other = (Statistique) obj;
		if (theme == null) {
			if (other.theme != null)
				return false;
		} else if (!theme.equals(other.theme))
			return false;
		return true;
	}
	
	
}

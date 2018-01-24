package org.quizcon;

import java.io.Serializable;
import java.net.URL;

import javax.persistence.*;

import org.quizcon.Question;

/**
 * Entity implementation class for Entity: QuestionImg
 *
 */
@Entity

public class QuestionImg extends Question implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private URL image;
	
	public QuestionImg() {
		super();
	}

	public URL getImage() {
		return image;
	}

	public void setImage(URL image) {
		this.image = image;
	}
	
	
   
}

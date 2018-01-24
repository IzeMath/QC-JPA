package org.quizcon;

import java.io.Serializable;
import java.net.URL;

import javax.persistence.*;

import org.quizcon.Question;

/**
 * Entity implementation class for Entity: QuestionVideo
 *
 */
@Entity

public class QuestionVideo extends Question implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private URL video;

	public QuestionVideo() {
		super();
	}

	public URL getVideo() {
		return video;
	}

	public void setVideo(URL video) {
		this.video = video;
	}
	
	
   
}

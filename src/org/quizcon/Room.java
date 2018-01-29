package org.quizcon;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Salon
 *
 */
@Entity

public class Room implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String roomName;
	private int nbPlayers;
	
	
	public Room() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(final int id) {
		this.id = id;
	}


	public String getRoomName() {
		return roomName;
	}


	public void setRoomName(final String roomName) {
		this.roomName = roomName;
	}


	public int getNbPlayers() {
		return nbPlayers;
	}


	public void setNbPlayers(final int nbPlayers) {
		this.nbPlayers = nbPlayers;
	}
	
	
   
}

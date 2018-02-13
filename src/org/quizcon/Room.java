package org.quizcon;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Entity implementation class for Entity: Salon
 *
 */

@NamedQueries({ @NamedQuery(name = "getListRoom", query = "SELECT r FROM Room r"),
		@NamedQuery(name = "canAccess", query = "SELECT r FROM Room r WHERE r.id = :id AND r.password = :password") })

@Entity

public class Room implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String name;
	private int nbPlayers;
	private String password;

	public Room() {
		super();
	}

	public Room(final int id, final String name, final String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getNbPlayers() {
		return nbPlayers;
	}

	public void setNbPlayers(final int nbPlayers) {
		this.nbPlayers = nbPlayers;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public boolean isPrivate() {
		return (this.password != null);
	}

}

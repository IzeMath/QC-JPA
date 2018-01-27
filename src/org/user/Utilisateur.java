package org.user;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Entity implementation class for Entity: Utilisateur
 *
 */
@NamedQueries({
		@NamedQuery(name = "UtilisateurFindByLogin", query = "SELECT u FROM Utilisateur u where u.email = :email AND u.password = :password") })

@Entity
public class Utilisateur implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String fname;
	private String username;
	private String email;
	private String password;

	private static final long serialVersionUID = 1L;

	public Utilisateur() {
		super();
	}

	public Utilisateur(final String name, final String fname, final String username, final String email,
			final String password) {
		super();
		this.name = name;
		this.fname = fname;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(final String fname) {
		this.fname = fname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", email=" + email + ", fname=" + fname + ", username=" + username + ", name="
				+ name + ", password=" + password + "";
	}

}

package org.user;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

/**
 * Entity implementation class for Entity: Utilisateur
 *
 */
@NamedQueries({
		@NamedQuery(name = "UtilisateurFindByLogin", query = "SELECT u FROM Utilisateur u where u.email = :email AND u.password = :password") })

@Entity
public class Utilisateur implements Serializable {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(columnDefinition = "BINARY(16)")
	private UUID id;
	@Column(unique = true)
	private String username;
	@Column(unique = true)
	private String email;
	private String password;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Statistique> lStat;

	private static final long serialVersionUID = 1L;

	public Utilisateur() {
		super();
	}

	public Utilisateur(final String username, final String email, final String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public UUID getId() {
		return id;
	}

	public void setId(final UUID id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public List<Statistique> getlStat() {
		return lStat;
	}

	public void setlStat(final List<Statistique> lStat) {
		this.lStat = lStat;
	}

}

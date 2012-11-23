package com.seostella.spring.domain.user;

import javax.persistence.*;

import com.seostella.spring.domain.Country;

/**
 * 
 * @author seostella.com
 */
@NamedQueries({
		@NamedQuery(name = User.NamedQuery.USER_FIND_ALL, query = "from User"),
		@NamedQuery(name = User.NamedQuery.USER_FIND_BY_ID, query = "from User where id = :id") })
@NamedNativeQueries({ 
	@NamedNativeQuery(name = User.NamedQuery.USER_FIND_BY_NAME, query = "select * from hb_user where name like :name", resultClass = User.class) })
@Entity
@Table(name = "hb_user")
public class User {
	@Id
	@GeneratedValue
	private long id;

	@Column(name = "name", unique = true, nullable = false)
	private String name;

	@Column(nullable = false)
	private String password;

	@Column(columnDefinition = "enum('male','female')")
	@Enumerated(EnumType.STRING)
	private Gender gender = Gender.male;

	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	private Boolean subscribed;

	public User() {
	}

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public Gender getGender() {
		return gender;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Boolean getSubscribed() {
		return subscribed;
	}

	public void setSubscribed(Boolean subscribed) {
		this.subscribed = subscribed;
	}

	public static class NamedQuery {
		public static final String USER_FIND_ALL = "User.findAll";
		public static final String USER_FIND_BY_ID = "User.findById";
		public static final String USER_FIND_BY_NAME = "User.findByName";
	}

}
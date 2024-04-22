package com.ynovApp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Client {
	private int id;
	private String firstname;
	private String lastname;
	private String mail;
	private String tel;
	//Constructor empty
	public Client () {
		
	}
	//Constructor with initialize attribute
	public Client(int id, String firstname, String lastname, String mail, String tel) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail = mail;
		this.tel = tel;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	
}

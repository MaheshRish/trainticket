package com.trainticket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue
	private int userid;
	private String firstrname;
	private String lastrname;
    private String password;
    private String address;
    private String email;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstrname() {
		return firstrname;
	}
	public void setFirstrname(String firstrname) {
		this.firstrname = firstrname;
	}
	public String getLastrname() {
		return lastrname;
	}
	public void setLastrname(String lastrname) {
		this.lastrname = lastrname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param userid
	 * @param firstrname
	 * @param lastrname
	 * @param password
	 * @param address
	 * @param email
	 */
	public User(int userid, String firstrname, String lastrname, String password, String address, String email) {
		super();
		this.userid = userid;
		this.firstrname = firstrname;
		this.lastrname = lastrname;
		this.password = password;
		this.address = address;
		this.email = email;
	}
	
    

}

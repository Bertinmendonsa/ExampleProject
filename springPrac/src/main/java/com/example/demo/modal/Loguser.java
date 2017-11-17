package com.example.demo.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="logindetails")
public class Loguser {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="username")
	private String logusername;
	@Column(name="password")
	private String logpassword;
	@Column(name="date")
	private Date date;
	
	public Loguser() {
		
	}
	
	public Loguser(Integer id, String username, String password, Date date) {
		super();
		this.id = id;
		this.logusername = username;
		this.logpassword = password;
		this.date = date;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((logpassword == null) ? 0 : logpassword.hashCode());
		result = prime * result + ((logusername == null) ? 0 : logusername.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loguser other = (Loguser) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (logpassword == null) {
			if (other.logpassword != null)
				return false;
		} else if (!logpassword.equals(other.logpassword))
			return false;
		if (logusername == null) {
			if (other.logusername != null)
				return false;
		} else if (!logusername.equals(other.logusername))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Loguser [id=" + id + ", username=" + logusername + ", password=" + logpassword + ", date=" + date + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return logusername;
	}
	public void setUsername(String username) {
		this.logusername = username;
	}
	public String getPassword() {
		return logpassword;
	}
	public void setPassword(String password) {
		this.logpassword = password;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}

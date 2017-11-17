package com.project.demo;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Feedback {
@Id
@GeneratedValue
private int fid;

private int user_id;
private int numerial_abilty;
private int verbal_abilty;
private int soft_skills;
private int corporate_connect;
private String facilitator1;
private String facilitator2;
private String facilitator3;
private String facilitator4;
private String que1;
private String que2;
private String que3;


public int getNumerial_abilty() {
	return numerial_abilty;
}


public void setNumerial_abilty(int numerial_abilty) {
	this.numerial_abilty = numerial_abilty;
}


public int getVerbal_abilty() {
	return verbal_abilty;
}


public void setVerbal_abilty(int verbal_abilty) {
	this.verbal_abilty = verbal_abilty;
}


public int getSoft_skills() {
	return soft_skills;
}


public void setSoft_skills(int soft_skills) {
	this.soft_skills = soft_skills;
}


public int getCorporate_connect() {
	return corporate_connect;
}


public void setCorporate_connect(int corporate_connect) {
	this.corporate_connect = corporate_connect;
}


public String getFacilitator1() {
	return facilitator1;
}


public void setFacilitator1(String facilitator1) {
	this.facilitator1 = facilitator1;
}


public String getFacilitator2() {
	return facilitator2;
}


public void setFacilitator2(String facilitator2) {
	this.facilitator2 = facilitator2;
}


public String getFacilitator3() {
	return facilitator3;
}


public void setFacilitator3(String facilitator3) {
	this.facilitator3 = facilitator3;
}


public String getFacilitator4() {
	return facilitator4;
}


public void setFacilitator4(String facilitator4) {
	this.facilitator4 = facilitator4;
}


public String getQue1() {
	return que1;
}


public void setQue1(String que1) {
	this.que1 = que1;
}


public String getQue2() {
	return que2;
}


public void setQue2(String que2) {
	this.que2 = que2;
}


public String getQue3() {
	return que3;
}


public void setQue3(String que3) {
	this.que3 = que3;
}


public void setFid(int fid) {
	this.fid = fid;
}


public int getFid() {
	return fid;
}


@Override
public String toString() {
	return "Feedback [fid=" + fid + ", numerial_abilty=" + numerial_abilty + ", verbal_abilty=" + verbal_abilty
			+ ", soft_skills=" + soft_skills + ", corporate_connect=" + corporate_connect + ", facilitator1="
			+ facilitator1 + ", facilitator2=" + facilitator2 + ", facilitator3=" + facilitator3 + ", facilitator4="
			+ facilitator4 + ", que1=" + que1 + ", que2=" + que2 + ", que3=" + que3 + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + corporate_connect;
	result = prime * result + ((facilitator1 == null) ? 0 : facilitator1.hashCode());
	result = prime * result + ((facilitator2 == null) ? 0 : facilitator2.hashCode());
	result = prime * result + ((facilitator3 == null) ? 0 : facilitator3.hashCode());
	result = prime * result + ((facilitator4 == null) ? 0 : facilitator4.hashCode());
	result = prime * result + fid;
	result = prime * result + numerial_abilty;
	result = prime * result + ((que1 == null) ? 0 : que1.hashCode());
	result = prime * result + ((que2 == null) ? 0 : que2.hashCode());
	result = prime * result + ((que3 == null) ? 0 : que3.hashCode());
	result = prime * result + soft_skills;
	result = prime * result + verbal_abilty;
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
	Feedback other = (Feedback) obj;
	if (corporate_connect != other.corporate_connect)
		return false;
	if (facilitator1 == null) {
		if (other.facilitator1 != null)
			return false;
	} else if (!facilitator1.equals(other.facilitator1))
		return false;
	if (facilitator2 == null) {
		if (other.facilitator2 != null)
			return false;
	} else if (!facilitator2.equals(other.facilitator2))
		return false;
	if (facilitator3 == null) {
		if (other.facilitator3 != null)
			return false;
	} else if (!facilitator3.equals(other.facilitator3))
		return false;
	if (facilitator4 == null) {
		if (other.facilitator4 != null)
			return false;
	} else if (!facilitator4.equals(other.facilitator4))
		return false;
	if (fid != other.fid)
		return false;
	if (numerial_abilty != other.numerial_abilty)
		return false;
	if (que1 == null) {
		if (other.que1 != null)
			return false;
	} else if (!que1.equals(other.que1))
		return false;
	if (que2 == null) {
		if (other.que2 != null)
			return false;
	} else if (!que2.equals(other.que2))
		return false;
	if (que3 == null) {
		if (other.que3 != null)
			return false;
	} else if (!que3.equals(other.que3))
		return false;
	if (soft_skills != other.soft_skills)
		return false;
	if (verbal_abilty != other.verbal_abilty)
		return false;
	return true;
}


public Feedback() {
	super();
	// TODO Auto-generated constructor stub
}


public int getUser_id() {
	return user_id;
}


public void setUser_id(int user_id) {
	this.user_id = user_id;
}


}




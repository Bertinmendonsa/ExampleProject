package form.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Area_of_practices {
@Id
@GeneratedValue
private Integer pID;
private String Area_of_practice;
private String Description;

@OneToMany(mappedBy="area_of_practices")
private List<Info>info;

@Override
public String toString() {
	return "Area_of_practices [pID=" + pID + ", Area_of_practice=" + Area_of_practice + ", Description=" + Description
			+ ", info=" + info + "]";
}

public Area_of_practices(String area_of_practice, String description) {
	this.Area_of_practice = area_of_practice;
	this.Description = description;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Area_of_practice == null) ? 0 : Area_of_practice.hashCode());
	result = prime * result + ((Description == null) ? 0 : Description.hashCode());
	result = prime * result + ((info == null) ? 0 : info.hashCode());
	result = prime * result + ((pID == null) ? 0 : pID.hashCode());
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
	Area_of_practices other = (Area_of_practices) obj;
	if (Area_of_practice == null) {
		if (other.Area_of_practice != null)
			return false;
	} else if (!Area_of_practice.equals(other.Area_of_practice))
		return false;
	if (Description == null) {
		if (other.Description != null)
			return false;
	} else if (!Description.equals(other.Description))
		return false;
	if (info == null) {
		if (other.info != null)
			return false;
	} else if (!info.equals(other.info))
		return false;
	if (pID == null) {
		if (other.pID != null)
			return false;
	} else if (!pID.equals(other.pID))
		return false;
	return true;
}

public Integer getpID() {
	return pID;
}

public void setpID(Integer pID) {
	this.pID = pID;
}

public String getArea_of_practice() {
	return Area_of_practice;
}

public void setArea_of_practice(String area_of_practice) {
	Area_of_practice = area_of_practice;
}

public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}

public List<Info> getInfo() {
	return info;
}

public void setInfo(List<Info> info) {
	this.info = info;
}

public Area_of_practices(){
	
}

}

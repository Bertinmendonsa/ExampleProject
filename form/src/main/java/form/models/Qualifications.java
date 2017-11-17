package form.models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Qualifications {
@Id
@GeneratedValue
private Integer qID;
private String Qualification;
private String Description;
@OneToMany(mappedBy="qualifications")
private List<Info>info;

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Description == null) ? 0 : Description.hashCode());
	result = prime * result + ((Qualification == null) ? 0 : Qualification.hashCode());
	result = prime * result + ((info == null) ? 0 : info.hashCode());
	result = prime * result + ((qID == null) ? 0 : qID.hashCode());
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
	Qualifications other = (Qualifications) obj;
	if (Description == null) {
		if (other.Description != null)
			return false;
	} else if (!Description.equals(other.Description))
		return false;
	if (Qualification == null) {
		if (other.Qualification != null)
			return false;
	} else if (!Qualification.equals(other.Qualification))
		return false;
	if (info == null) {
		if (other.info != null)
			return false;
	} else if (!info.equals(other.info))
		return false;
	if (qID == null) {
		if (other.qID != null)
			return false;
	} else if (!qID.equals(other.qID))
		return false;
	return true;
}


@Override
public String toString() {
	return "Qualifications [qID=" + qID + ", Qualification=" + Qualification + ", Description=" + Description
			+ ", info=" + info + "]";
}





public Qualifications(String qualification, String description) {
	this.Qualification = qualification;
	this.Description = description;
}




Qualifications(){
	
}

public Integer getqID() {
	return qID;
}
public void setqID(Integer qID) {
	this.qID = qID;
}
public String getQualification() {
	return Qualification;
}
public void setQualification(String qualification) {
	Qualification = qualification;
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

}

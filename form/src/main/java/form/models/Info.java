package form.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Info {
	@Id
	@GeneratedValue
	private Integer ID;
	private Long Telephone;
	private Long Mobile_number;
	private String Clinic;
	
	@ManyToOne
	@JoinColumn(name="qid", referencedColumnName="qID")
	public Qualifications qualifications;
	
	@ManyToOne
	@JoinColumn(name="pid", referencedColumnName="pID")
	public Area_of_practices area_of_practices;
	
	public Info(Long telephone, Long mobile_number, String clinic, Qualifications qualifications,
			Area_of_practices area_of_practices) {
		Telephone = telephone;
		Mobile_number = mobile_number;
		Clinic = clinic;
		this.qualifications = qualifications;
		this.area_of_practices = area_of_practices;
	}

@Override
	public String toString() {
		return "Info [ID=" + ID + ", Telephone=" + Telephone + ", Mobile_number=" + Mobile_number + ", Clinic=" + Clinic
				+ ", qualifications=" + qualifications + ", area_of_practices=" + area_of_practices + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Clinic == null) ? 0 : Clinic.hashCode());
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((Mobile_number == null) ? 0 : Mobile_number.hashCode());
		result = prime * result + ((Telephone == null) ? 0 : Telephone.hashCode());
		result = prime * result + ((area_of_practices == null) ? 0 : area_of_practices.hashCode());
		result = prime * result + ((qualifications == null) ? 0 : qualifications.hashCode());
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
		Info other = (Info) obj;
		if (Clinic == null) {
			if (other.Clinic != null)
				return false;
		} else if (!Clinic.equals(other.Clinic))
			return false;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (Mobile_number == null) {
			if (other.Mobile_number != null)
				return false;
		} else if (!Mobile_number.equals(other.Mobile_number))
			return false;
		if (Telephone == null) {
			if (other.Telephone != null)
				return false;
		} else if (!Telephone.equals(other.Telephone))
			return false;
		if (area_of_practices == null) {
			if (other.area_of_practices != null)
				return false;
		} else if (!area_of_practices.equals(other.area_of_practices))
			return false;
		if (qualifications == null) {
			if (other.qualifications != null)
				return false;
		} else if (!qualifications.equals(other.qualifications))
			return false;
		return true;
	}
	
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Long getTelephone() {
		return Telephone;
	}

	public void setTelephone(Long telephone) {
		Telephone = telephone;
	}

	public Long getMobile_number() {
		return Mobile_number;
	}

	public void setMobile_number(Long mobile_number) {
		Mobile_number = mobile_number;
	}

	public String getClinic() {
		return Clinic;
	}

	public void setClinic(String clinic) {
		Clinic = clinic;
	}

	public Qualifications getQualifications() {
		return qualifications;
	}

	public void setQualifications(Qualifications qualifications) {
		this.qualifications = qualifications;
	}

	public Area_of_practices getArea_of_practices() {
		return area_of_practices;
	}

	public void setArea_of_practices(Area_of_practices area_of_practices) {
		this.area_of_practices = area_of_practices;
	}

	
	
	Info(){
		
	}

	public void setDeletedRecord(boolean b) {
		// TODO Auto-generated method stub
		
	}

}

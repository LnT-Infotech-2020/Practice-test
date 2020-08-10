package com.spring.joy.mvc.entity;

import java.util.Date;

public class EmployeeEntity {
	
	private long id;
	private String fName;
	private String lName;
	private Date dateOfBirth;
	
	
	
	
	public EmployeeEntity(long id, String fName, String lName, Date dateOfBirth) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
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
		EmployeeEntity other = (EmployeeEntity) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (id != other.id)
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", fName=" + fName + ", lName=" + lName + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	
	

}

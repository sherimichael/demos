package com.revature.models;

import org.springframework.stereotype.Component;

@Component
public class Avenger {
	
	private int supID;
	private String supName;
	private String supPower;
	private String firstName;
	private String lastName;
	private int powerLevel;
	
	public Avenger() {
		super();
	}
	public Avenger(int supID, String supName, String supPower, String firstName, String lastName, int powerLevel) {
		super();
		this.supID = supID;
		this.supName = supName;
		this.supPower = supPower;
		this.firstName = firstName;
		this.lastName = lastName;
		this.powerLevel = powerLevel;
	}
	@Override
	public String toString() {
		return "Avenger [supID=" + supID + ", supName=" + supName + ", supPower=" + supPower + ", firstName="
				+ firstName + ", lastName=" + lastName + ", powerLevel=" + powerLevel + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + powerLevel;
		result = prime * result + supID;
		result = prime * result + ((supName == null) ? 0 : supName.hashCode());
		result = prime * result + ((supPower == null) ? 0 : supPower.hashCode());
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
		Avenger other = (Avenger) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (powerLevel != other.powerLevel)
			return false;
		if (supID != other.supID)
			return false;
		if (supName == null) {
			if (other.supName != null)
				return false;
		} else if (!supName.equals(other.supName))
			return false;
		if (supPower == null) {
			if (other.supPower != null)
				return false;
		} else if (!supPower.equals(other.supPower))
			return false;
		return true;
	}
	public int getSupID() {
		return supID;
	}
	public void setSupID(int supID) {
		this.supID = supID;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public String getSupPower() {
		return supPower;
	}
	public void setSupPower(String supPower) {
		this.supPower = supPower;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPowerLevel() {
		return powerLevel;
	}
	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}
	
	

}

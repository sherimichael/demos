package com.revature.models;

import org.springframework.stereotype.Controller;

//This is not a controller, but since the functionality of stereotype annotations is the same it doesn't matter to Spring. 
@Controller
public class Account {
	
	private double amount;

	public Account(double amount) {
		super();
		this.amount = amount;
	}

	public Account() {
		super();
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Account other = (Account) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [amount=" + amount + "]";
	}
	
	
	

}

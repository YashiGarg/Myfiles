package com.cg.mra.beans;

public class Account {
	private String mobileNo;
	private String accountType;
	private String customerName;
	private double accountBalance;

	// Getter and Setter
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	// constructor use for initialization
	public Account(String mobileNo, String accountType, String customerName, double accountBalance) {
		super();
		this.mobileNo = mobileNo;
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}

	// Default constructor
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	// HashCode and equals method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
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
		if (Double.doubleToLongBits(accountBalance) != Double.doubleToLongBits(other.accountBalance))
			return false;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		return true;
	}

	// toString method that returns value
	@Override
	public String toString() {
		return "Account [ accountType=" + accountType + ", customerName=" + customerName + ", accountBalance="
				+ accountBalance + "]";
	}

	public Account(String accountType, String customerName, double accountBalance) {
		super();
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}

}

package com.cg.wallet.bean;

public class Customer{
	private String cusNAme;
	private String cusPhone;
	private Wallet wallet;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cusNAme, String cusPhone, Wallet wallet) {
		super();
		this.cusNAme = cusNAme;
		this.cusPhone = cusPhone;
		this.wallet = wallet;
	}
	public String getCusNAme() {
		return cusNAme;
	}
	public void setCusNAme(String cusNAme) {
		this.cusNAme = cusNAme;
	}
	public String getCusPhone() {
		return cusPhone;
	}
	public void setCusPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cusNAme == null) ? 0 : cusNAme.hashCode());
		result = prime * result + ((cusPhone == null) ? 0 : cusPhone.hashCode());
		result = prime * result + ((wallet == null) ? 0 : wallet.hashCode());
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
		Customer other = (Customer) obj;
		if (cusNAme == null) {
			if (other.cusNAme != null)
				return false;
		} else if (!cusNAme.equals(other.cusNAme))
			return false;
		if (cusPhone == null) {
			if (other.cusPhone != null)
				return false;
		} else if (!cusPhone.equals(other.cusPhone))
			return false;
		if (wallet == null) {
			if (other.wallet != null)
				return false;
		} else if (!wallet.equals(other.wallet))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [cusNAme=" + cusNAme + ", cusPhone=" + cusPhone + ", wallet=" + wallet + "]";
	}
	
}

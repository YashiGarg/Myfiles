package com.cg.mp.bean;

public class Mobile {

	private int mobileId;
	private String mobileName;
	private int stock;
	private double mobilePrice;
	
	public Mobile() {
		super();
	}
	

	public Mobile(int x, String mobileName, int stock, int i) {
		super();
		this.mobileId = x;
		this.mobileName = mobileName;
		this.stock = stock;
		this.mobilePrice = i;
	}


	public int getMobileId() {
		return mobileId;
	}


	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}


	public String getMobileName() {
		return mobileName;
	}


	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public double getMobilePrice() {
		return mobilePrice;
	}


	public void setMobilePrice(double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}


	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", stock=" + stock + ", mobilePrice="
				+ mobilePrice + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mobileId;
		result = prime * result + ((mobileName == null) ? 0 : mobileName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(mobilePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + stock;
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
		Mobile other = (Mobile) obj;
		if (mobileId != other.mobileId)
			return false;
		if (mobileName == null) {
			if (other.mobileName != null)
				return false;
		} else if (!mobileName.equals(other.mobileName))
			return false;
		if (Double.doubleToLongBits(mobilePrice) != Double.doubleToLongBits(other.mobilePrice))
			return false;
		if (stock != other.stock)
			return false;
		return true;
	}
}

	
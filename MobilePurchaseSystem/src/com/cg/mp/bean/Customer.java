package com.cg.mp.bean;

import java.time.LocalDateTime;

public class Customer {
 private String cusname;
 private String cusmailid;
 private String  cusphoneno;
 private int cusmobileid;
 private int cuspurchaseid;
 private LocalDateTime purchaseDate;
 
 
public String getCusname() {
	return cusname;
}
public void setCusname(String cusname) {
	this.cusname = cusname;
}
public String getCusmailid() {
	return cusmailid;
}
public void setCusmailid(String cusmailid) {
	this.cusmailid = cusmailid;
}
public String getCusphoneno() {
	return cusphoneno;
}
public void setCusphoneno(String cusphoneno) {
	this.cusphoneno = cusphoneno;
}
public int getCusmobileid() {
	return cusmobileid;
}
public void setCusmobileid(int cusmobileid) {
	this.cusmobileid = cusmobileid;
}
public int getCuspurchaseid() {
	return cuspurchaseid;
}
public void setCuspurchaseid(int cuspurchaseid) {
	this.cuspurchaseid = cuspurchaseid;
}
public LocalDateTime getPurchaseDate() {
	return purchaseDate;
}
public void setPurchaseTime(LocalDateTime purchaseDate) {
	this.purchaseDate = purchaseDate;
}

public Customer() {
	super();
	
}

public Customer(String cusname, String cusmailid, String cusphoneno, int cusmobileid, int cuspurchaseid,
		LocalDateTime purchaseDate) {
	super();
	this.cusname = cusname;
	this.cusmailid = cusmailid;
	this.cusphoneno = cusphoneno;
	this.cusmobileid = cusmobileid;
	this.cuspurchaseid = cuspurchaseid;
	this.purchaseDate = purchaseDate;
}

@Override
public String toString() {
	return "Customer [cusname=" + cusname + ", cusmailid=" + cusmailid + ", cusphoneno=" + cusphoneno + ", cusmobileid="
			+ cusmobileid + ", cuspurchaseid=" + cuspurchaseid + ", purchaseDate=" + purchaseDate + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cusmailid == null) ? 0 : cusmailid.hashCode());
	result = prime * result + cusmobileid;
	result = prime * result + ((cusname == null) ? 0 : cusname.hashCode());
	result = prime * result + ((cusphoneno == null) ? 0 : cusphoneno.hashCode());
	result = prime * result + cuspurchaseid;
	result = prime * result + ((purchaseDate == null) ? 0 : purchaseDate.hashCode());
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
	if (cusmailid == null) {
		if (other.cusmailid != null)
			return false;
	} else if (!cusmailid.equals(other.cusmailid))
		return false;
	if (cusmobileid != other.cusmobileid)
		return false;
	if (cusname == null) {
		if (other.cusname != null)
			return false;
	} else if (!cusname.equals(other.cusname))
		return false;
	if (cusphoneno == null) {
		if (other.cusphoneno != null)
			return false;
	} else if (!cusphoneno.equals(other.cusphoneno))
		return false;
	if (cuspurchaseid != other.cuspurchaseid)
		return false;
	if (purchaseDate == null) {
		if (other.purchaseDate != null)
			return false;
	} else if (!purchaseDate.equals(other.purchaseDate))
		return false;
	return true;
}
 
 
}

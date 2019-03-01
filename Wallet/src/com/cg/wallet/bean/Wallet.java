package com.cg.wallet.bean;

public class Wallet {
private int walBAlance;

public Wallet() {
	super();
	// TODO Auto-generated constructor stub
}

public Wallet(int walBAlance) {
	super();
	this.walBAlance = walBAlance;
}

public int getWalBAlance() {
	return walBAlance;
}

public void setWalBAlance(int walBAlance) {
	this.walBAlance = walBAlance;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + walBAlance;
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
	Wallet other = (Wallet) obj;
	if (walBAlance != other.walBAlance)
		return false;
	return true;
}

@Override
public String toString() {
	return "Wallet [walBAlance=" + walBAlance + "]";
}

}

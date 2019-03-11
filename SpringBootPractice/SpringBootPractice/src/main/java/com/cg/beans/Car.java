package com.cg.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private int carNo;
	private String carBrand;
	private String modelNo;
	private double carPrice;
	// private LocalDate carIssueDate;

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	/*
	 * public LocalDate getCarIssueDate() { return carIssueDate; }
	 * 
	 * public void setCarIssueDate(LocalDate carIssueDate) { this.carIssueDate =
	 * carIssueDate; }
	 */

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", carBrand=" + carBrand + ", modelNo=" + modelNo + ", carPrice=" + carPrice
				+ "]";
	}

	public Car(int carNo, String carBrand, String modelNo, double carPrice) {
		super();
		this.carNo = carNo;
		this.carBrand = carBrand;
		this.modelNo = modelNo;
		this.carPrice = carPrice;
	}

}

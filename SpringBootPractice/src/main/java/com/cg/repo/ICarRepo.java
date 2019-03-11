package com.cg.repo;


import com.cg.beans.Car;

public interface ICarRepo  {
	public Car addCar(Car car);
	Car getCar(int carNo);
	Car deleteCar(int carNo);
	Car updateCar(int carNo,int carPrice);
	
}

package com.cg.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.beans.Car;
@Transactional
@Repository
public class CarRepoImpl implements ICarRepo
{
@PersistenceContext
EntityManager entity;
	@Override
	public Car addCar(Car car) {
		entity.persist(car);
		entity.flush();
		return car;
	}

	@Override
	public Car getCar(int carNo) {
	Car car=entity.find(Car.class, carNo);
	
		return car;
	}

	@Override
	public Car deleteCar(int carNo) {
	Car car=entity.find(Car.class, carNo);
	entity.remove(car);
		return car;
	}

	@Override
	public Car updateCar(int carNo,int carPrice) {
	Car car=entity.find(Car.class,carNo);
	car.setCarPrice(carPrice);
	entity.merge(car);
		return car;
	}

}

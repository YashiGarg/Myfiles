package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Car;
import com.cg.repo.ICarRepo;


@RestController

public class ClassController {
	@Autowired
	ICarRepo carRepo;

	@RequestMapping(path="/yashi",method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public Car addCar(@RequestBody Car car) {

		return carRepo.addCar(car);
	}

	@RequestMapping(path="/yashi/{carNo}",method = RequestMethod.GET ,produces = "application/json")
	public Car getCar(@PathVariable  int carNo) {
		Car car = carRepo.getCar(carNo);
		return car;
	}

	@RequestMapping(path="/yashi/{carNo}",method = RequestMethod.DELETE, produces = "application/json")
	public Car addCar(@PathVariable int carNo) {
		Car car = carRepo.deleteCar(carNo);
		return car;
	}

	@RequestMapping(path="/yashi/{carNo}/{carPrice}",method = RequestMethod.POST, produces = "application/json")
	public Car addCar(@PathVariable int carNo, @PathVariable int carPrice) {
		Car car = carRepo.updateCar(carNo, carPrice);
		return car;
	}
	@RequestMapping(value="/abc")
	public String abc()
	{
		return "yashi";
	}
}

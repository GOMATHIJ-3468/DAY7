package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CarRepo;
import com.example.demo.model.Car;

@Service
public class CarService {

	@Autowired
	CarRepo cr;
	
	public Car cardetails(Car c) {
		return cr.save(c);
	}
	
	public List<Car> carndetails(List<Car> c){
		return (List<Car>) cr.saveAll(c);
	}
	
	public List<Car> showdetails(){
		return cr.findAll();
	}
	
	public List<Car> showowner(int own){
		return cr.getowner(own);
	}
	
	public List<Car> showaddress(String add){
		return cr.getaddress(add);
	}
	
	public List<Car> showcarname(String cname){
		return cr.getcarname(cname);
	}
	
	public List<Car> showowntype(int own,String ctype){
		return cr.getownortype(own, ctype);
	}
}

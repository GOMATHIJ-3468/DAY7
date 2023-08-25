package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CarService;
import com.example.demo.model.Car;

@RestController
public class CarController {

	@Autowired
	CarService cs;
	
	@PostMapping("addcar")
	public Car carinfo(@RequestBody Car c) {
		return cs.cardetails(c);
	}
	@PostMapping("addncar")
	public List<Car> carninfo(@RequestBody List<Car> c){
		return cs.carndetails(c);
	}
	
	@GetMapping("dispcar")
	public List<Car> getinfo(){
		return cs.showdetails();
	}
	
	@GetMapping("owner/{owners}")
	public List<Car> getownnerinfo(@PathVariable int owners){
		return cs.showowner(owners);
	}
	@GetMapping("address/{address}")
	public List<Car> getaddressinfo(@PathVariable String address){
		return cs.showaddress(address);
	}
	
	@GetMapping("owner/{owners}/cartype/{cartype}")
	public List<Car> getownortypeinfo(@PathVariable int owners,@PathVariable String cartype){
		return cs.showowntype(owners, cartype);
	}
}

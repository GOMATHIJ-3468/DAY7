package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Car;


public interface CarRepo extends JpaRepository<Car, Integer>{

	@Query(value="select * from car_details where owners=:s",nativeQuery=true)
	public List<Car> getowner(@Param("s") int own);
	
	@Query(value="select * from car_details where address=:s",nativeQuery=true)
	public List<Car> getaddress(@Param("s") String address);
	
	@Query(value="select * from car_details where carname=:s",nativeQuery=true)
	public List<Car> getcarname(@Param("s") String carname);
	
	@Query(value="select * from car_details where owners=:s or cartype=:sn",nativeQuery=true)
	public List<Car> getownortype(@Param("s") int own, @Param("sn") String ctype);

}

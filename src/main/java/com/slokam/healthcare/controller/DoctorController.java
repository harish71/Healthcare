package com.slokam.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.healthcare.entity.Doctor;
import com.slokam.healthcare.service.DoctorService;

@RestController
@RequestMapping("Doctor") 
public class DoctorController {
	 @Autowired
	 private DoctorService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Doctor>	 saveDoctor(@RequestBody Doctor obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Doctor>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Doctor>	 deleteDoctor(@RequestBody Doctor obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Doctor>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Doctor>> getAllDoctor(){
		 List<Doctor> list = service.getAll();
		 return new ResponseEntity<List<Doctor>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Doctor> getByIdDoctor(@PathVariable Integer id) {
		  Doctor obj =  service.getById(id);
		  return new ResponseEntity<Doctor>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<Doctor>	 
	 deleteDoctor(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Doctor>(HttpStatus.OK);
	 }
}


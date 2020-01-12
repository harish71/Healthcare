package com.slokam.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.healthcare.entity.Patient;
import com.slokam.healthcare.service.PatientService;

@RestController
@RequestMapping("Patient") 
public class PatientController {
	 @Autowired
	 private PatientService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Patient>	 savePatient(@RequestBody Patient obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Patient>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Patient>	 deletePatient(@RequestBody Patient obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Patient>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Patient>> getAllPatient(){
		 List<Patient> list = service.getAll();
		 return new ResponseEntity<List<Patient>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Patient> getByIdPatient(@PathVariable Integer id) {
		  Patient obj =  service.getById(id);
		  return new ResponseEntity<Patient>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<Patient>	 
	 deletePatient(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Patient>(HttpStatus.OK);
	 }
}


package com.slokam.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.healthcare.entity.Med;
import com.slokam.healthcare.service.MedService;

@RestController
@RequestMapping("Med") 
public class MedController {
	 @Autowired
	 private MedService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Med>	 saveMed(@RequestBody Med obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Med>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Med>	 deleteMed(@RequestBody Med obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Med>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Med>> getAllMed(){
		 List<Med> list = service.getAll();
		 return new ResponseEntity<List<Med>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Med> getByIdMed(@PathVariable Integer id) {
		  Med obj =  service.getById(id);
		  return new ResponseEntity<Med>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<Med>	 
	 deleteMed(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Med>(HttpStatus.OK);
	 }
}


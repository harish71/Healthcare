package com.slokam.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.healthcare.entity.Gender;
import com.slokam.healthcare.service.GenderService;

@RestController
@RequestMapping("Gender") 
public class GenderController {
	 @Autowired
	 private GenderService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Gender>	 saveGender(@RequestBody Gender obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Gender>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Gender>	 deleteGender(@RequestBody Gender obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Gender>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Gender>> getAllGender(){
		 List<Gender> list = service.getAll();
		 return new ResponseEntity<List<Gender>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Gender> getByIdGender(@PathVariable Integer id) {
		  Gender obj =  service.getById(id);
		  return new ResponseEntity<Gender>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<Gender>	 
	 deleteGender(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Gender>(HttpStatus.OK);
	 }
}


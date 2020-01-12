package com.slokam.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.healthcare.entity.Disease;
import com.slokam.healthcare.service.DiseaseService;

@RestController
@RequestMapping("Disease") 
public class DiseaseController {
	 @Autowired
	 private DiseaseService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Disease>	 saveDisease(@RequestBody Disease obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Disease>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Disease>	 deleteDisease(@RequestBody Disease obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Disease>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Disease>> getAllDisease(){
		 List<Disease> list = service.getAll();
		 return new ResponseEntity<List<Disease>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Disease> getByIdDisease(@PathVariable Integer id) {
		  Disease obj =  service.getById(id);
		  return new ResponseEntity<Disease>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<Disease>	 
	 deleteDisease(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Disease>(HttpStatus.OK);
	 }
}


package com.slokam.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.healthcare.entity.Visiting;
import com.slokam.healthcare.service.VisitingService;

@RestController
@RequestMapping("Visiting") 
public class VisitingController {
	 @Autowired
	 private VisitingService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Visiting>	 saveVisiting(@RequestBody Visiting obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Visiting>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Visiting>	 deleteVisiting(@RequestBody Visiting obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Visiting>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Visiting>> getAllVisiting(){
		 List<Visiting> list = service.getAll();
		 return new ResponseEntity<List<Visiting>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Visiting> getByIdVisiting(@PathVariable Integer id) {
		  Visiting obj =  service.getById(id);
		  return new ResponseEntity<Visiting>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<Visiting>	 
	 deleteVisiting(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Visiting>(HttpStatus.OK);
	 }
}


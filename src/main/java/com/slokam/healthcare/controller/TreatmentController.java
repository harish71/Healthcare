package com.slokam.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.healthcare.entity.Treatment;
import com.slokam.healthcare.service.TreatmentService;

@RestController
@RequestMapping("Treatment") 
public class TreatmentController {
	 @Autowired
	 private TreatmentService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Treatment>	 saveTreatment(@RequestBody Treatment obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Treatment>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Treatment>	 deleteTreatment(@RequestBody Treatment obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Treatment>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Treatment>> getAllTreatment(){
		 List<Treatment> list = service.getAll();
		 return new ResponseEntity<List<Treatment>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Treatment> getByIdTreatment(@PathVariable Integer id) {
		  Treatment obj =  service.getById(id);
		  return new ResponseEntity<Treatment>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<Treatment>	 
	 deleteTreatment(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Treatment>(HttpStatus.OK);
	 }
}


package com.slokam.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.healthcare.entity.PrecItem;
import com.slokam.healthcare.service.PrecItemService;

@RestController
@RequestMapping("PrecItem") 
public class PrecItemController {
	 @Autowired
	 private PrecItemService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<PrecItem>	 savePrecItem(@RequestBody PrecItem obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<PrecItem>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<PrecItem>	 deletePrecItem(@RequestBody PrecItem obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<PrecItem>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<PrecItem>> getAllPrecItem(){
		 List<PrecItem> list = service.getAll();
		 return new ResponseEntity<List<PrecItem>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<PrecItem> getByIdPrecItem(@PathVariable Integer id) {
		  PrecItem obj =  service.getById(id);
		  return new ResponseEntity<PrecItem>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<PrecItem>	 
	 deletePrecItem(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<PrecItem>(HttpStatus.OK);
	 }
}


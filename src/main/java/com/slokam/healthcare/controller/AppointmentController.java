package com.slokam.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.healthcare.entity.Appointment;
import com.slokam.healthcare.service.AppointmentService;

@RestController
@RequestMapping("Appointment") 
public class AppointmentController {
	 @Autowired
	 private AppointmentService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Appointment>	 saveAppointment(@RequestBody Appointment obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Appointment>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Appointment>	 deleteAppointment(@RequestBody Appointment obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Appointment>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Appointment>> getAllAppointment(){
		 List<Appointment> list = service.getAll();
		 return new ResponseEntity<List<Appointment>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Appointment> getByIdAppointment(@PathVariable Integer id) {
		  Appointment obj =  service.getById(id);
		  return new ResponseEntity<Appointment>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<Appointment>	 
	 deleteAppointment(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Appointment>(HttpStatus.OK);
	 }
}


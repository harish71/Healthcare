package com.slokam.healthcare.service.impl;

import com.slokam.healthcare.entity.Appointment;
import com.slokam.healthcare.repo.AppointmentRepo;
import com.slokam.healthcare.service.AppointmentService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AppointmentServiceImpl implements AppointmentService {

      
   

	@Autowired
	private AppointmentRepo repo;
	
	@Override
	public List<Appointment> getAll() {
		return repo.findAll();
	}

	@Override
	public Appointment getById(Integer id) {
		
		Optional<Appointment> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Appointment save(Appointment todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Appointment todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}

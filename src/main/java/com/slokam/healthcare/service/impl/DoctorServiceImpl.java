package com.slokam.healthcare.service.impl;

import com.slokam.healthcare.entity.Doctor;
import com.slokam.healthcare.repo.DoctorRepo;
import com.slokam.healthcare.service.DoctorService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DoctorServiceImpl implements DoctorService {

      
   

	@Autowired
	private DoctorRepo repo;
	
	@Override
	public List<Doctor> getAll() {
		return repo.findAll();
	}

	@Override
	public Doctor getById(Integer id) {
		
		Optional<Doctor> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Doctor save(Doctor todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Doctor todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}

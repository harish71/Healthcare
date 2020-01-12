package com.slokam.healthcare.service.impl;

import com.slokam.healthcare.entity.Patient;
import com.slokam.healthcare.repo.PatientRepo;
import com.slokam.healthcare.service.PatientService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PatientServiceImpl implements PatientService {

      
   

	@Autowired
	private PatientRepo repo;
	
	@Override
	public List<Patient> getAll() {
		return repo.findAll();
	}

	@Override
	public Patient getById(Integer id) {
		
		Optional<Patient> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Patient save(Patient todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Patient todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}

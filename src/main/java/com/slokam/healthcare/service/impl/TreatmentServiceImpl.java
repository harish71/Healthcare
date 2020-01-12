package com.slokam.healthcare.service.impl;

import com.slokam.healthcare.entity.Treatment;
import com.slokam.healthcare.repo.TreatmentRepo;
import com.slokam.healthcare.service.TreatmentService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TreatmentServiceImpl implements TreatmentService {

      
   

	@Autowired
	private TreatmentRepo repo;
	
	@Override
	public List<Treatment> getAll() {
		return repo.findAll();
	}

	@Override
	public Treatment getById(Integer id) {
		
		Optional<Treatment> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Treatment save(Treatment todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Treatment todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}

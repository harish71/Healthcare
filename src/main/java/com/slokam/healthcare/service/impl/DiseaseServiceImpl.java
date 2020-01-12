package com.slokam.healthcare.service.impl;

import com.slokam.healthcare.entity.Disease;
import com.slokam.healthcare.repo.DiseaseRepo;
import com.slokam.healthcare.service.DiseaseService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DiseaseServiceImpl implements DiseaseService {

      
   

	@Autowired
	private DiseaseRepo repo;
	
	@Override
	public List<Disease> getAll() {
		return repo.findAll();
	}

	@Override
	public Disease getById(Integer id) {
		
		Optional<Disease> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Disease save(Disease todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Disease todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}

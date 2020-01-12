package com.slokam.healthcare.service.impl;

import com.slokam.healthcare.entity.Med;
import com.slokam.healthcare.repo.MedRepo;
import com.slokam.healthcare.service.MedService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MedServiceImpl implements MedService {

      
   

	@Autowired
	private MedRepo repo;
	
	@Override
	public List<Med> getAll() {
		return repo.findAll();
	}

	@Override
	public Med getById(Integer id) {
		
		Optional<Med> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Med save(Med todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Med todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}

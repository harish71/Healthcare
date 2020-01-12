package com.slokam.healthcare.service.impl;

import com.slokam.healthcare.entity.Gender;
import com.slokam.healthcare.repo.GenderRepo;
import com.slokam.healthcare.service.GenderService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class GenderServiceImpl implements GenderService {

      
   

	@Autowired
	private GenderRepo repo;
	
	@Override
	public List<Gender> getAll() {
		return repo.findAll();
	}

	@Override
	public Gender getById(Integer id) {
		
		Optional<Gender> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Gender save(Gender todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Gender todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}

package com.slokam.healthcare.service.impl;

import com.slokam.healthcare.entity.Visiting;
import com.slokam.healthcare.repo.VisitingRepo;
import com.slokam.healthcare.service.VisitingService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class VisitingServiceImpl implements VisitingService {

      
   

	@Autowired
	private VisitingRepo repo;
	
	@Override
	public List<Visiting> getAll() {
		return repo.findAll();
	}

	@Override
	public Visiting getById(Integer id) {
		
		Optional<Visiting> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Visiting save(Visiting todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Visiting todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}

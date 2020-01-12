package com.slokam.healthcare.service.impl;

import com.slokam.healthcare.entity.PrecItem;
import com.slokam.healthcare.repo.PrecItemRepo;
import com.slokam.healthcare.service.PrecItemService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PrecItemServiceImpl implements PrecItemService {

      
   

	@Autowired
	private PrecItemRepo repo;
	
	@Override
	public List<PrecItem> getAll() {
		return repo.findAll();
	}

	@Override
	public PrecItem getById(Integer id) {
		
		Optional<PrecItem> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public PrecItem save(PrecItem todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(PrecItem todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}

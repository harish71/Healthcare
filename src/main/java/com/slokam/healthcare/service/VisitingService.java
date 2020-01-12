package com.slokam.healthcare.service;

import com.slokam.healthcare.entity.Visiting;
import com.slokam.healthcare.repo.VisitingRepo;

import java.util.*;

public interface VisitingService {
	
	public List<Visiting> getAll();
	public Visiting getById(Integer id);
	public Visiting save(Visiting Visiting);
	public void remove(Visiting Visiting);
    public void remove(Integer id);
}

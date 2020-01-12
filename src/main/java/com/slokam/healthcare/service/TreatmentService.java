package com.slokam.healthcare.service;

import com.slokam.healthcare.entity.Treatment;
import com.slokam.healthcare.repo.TreatmentRepo;

import java.util.*;

public interface TreatmentService {
	
	public List<Treatment> getAll();
	public Treatment getById(Integer id);
	public Treatment save(Treatment Treatment);
	public void remove(Treatment Treatment);
    public void remove(Integer id);
}

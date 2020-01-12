package com.slokam.healthcare.service;

import com.slokam.healthcare.entity.Disease;
import com.slokam.healthcare.repo.DiseaseRepo;

import java.util.*;

public interface DiseaseService {
	
	public List<Disease> getAll();
	public Disease getById(Integer id);
	public Disease save(Disease Disease);
	public void remove(Disease Disease);
    public void remove(Integer id);
}

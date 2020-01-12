package com.slokam.healthcare.service;

import com.slokam.healthcare.entity.Patient;
import com.slokam.healthcare.repo.PatientRepo;

import java.util.*;

public interface PatientService {
	
	public List<Patient> getAll();
	public Patient getById(Integer id);
	public Patient save(Patient Patient);
	public void remove(Patient Patient);
    public void remove(Integer id);
}

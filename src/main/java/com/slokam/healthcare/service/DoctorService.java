package com.slokam.healthcare.service;

import com.slokam.healthcare.entity.Doctor;
import com.slokam.healthcare.repo.DoctorRepo;

import java.util.*;

public interface DoctorService {
	
	public List<Doctor> getAll();
	public Doctor getById(Integer id);
	public Doctor save(Doctor Doctor);
	public void remove(Doctor Doctor);
    public void remove(Integer id);
}

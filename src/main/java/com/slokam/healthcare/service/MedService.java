package com.slokam.healthcare.service;

import com.slokam.healthcare.entity.Med;
import com.slokam.healthcare.repo.MedRepo;

import java.util.*;

public interface MedService {
	
	public List<Med> getAll();
	public Med getById(Integer id);
	public Med save(Med Med);
	public void remove(Med Med);
    public void remove(Integer id);
}

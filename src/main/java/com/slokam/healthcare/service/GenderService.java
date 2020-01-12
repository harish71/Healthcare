package com.slokam.healthcare.service;

import com.slokam.healthcare.entity.Gender;
import com.slokam.healthcare.repo.GenderRepo;

import java.util.*;

public interface GenderService {
	
	public List<Gender> getAll();
	public Gender getById(Integer id);
	public Gender save(Gender Gender);
	public void remove(Gender Gender);
    public void remove(Integer id);
}

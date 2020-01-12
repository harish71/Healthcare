package com.slokam.healthcare.service;

import com.slokam.healthcare.entity.PrecItem;
import com.slokam.healthcare.repo.PrecItemRepo;

import java.util.*;

public interface PrecItemService {
	
	public List<PrecItem> getAll();
	public PrecItem getById(Integer id);
	public PrecItem save(PrecItem PrecItem);
	public void remove(PrecItem PrecItem);
    public void remove(Integer id);
}

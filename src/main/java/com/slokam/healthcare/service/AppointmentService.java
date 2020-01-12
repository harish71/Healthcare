package com.slokam.healthcare.service;

import com.slokam.healthcare.entity.Appointment;
import com.slokam.healthcare.repo.AppointmentRepo;

import java.util.*;

public interface AppointmentService {
	
	public List<Appointment> getAll();
	public Appointment getById(Integer id);
	public Appointment save(Appointment Appointment);
	public void remove(Appointment Appointment);
    public void remove(Integer id);
}

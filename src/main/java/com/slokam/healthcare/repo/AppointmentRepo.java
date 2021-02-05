package com.slokam.healthcare.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.healthcare.entity.Appointment;
				@Repository
				public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {
                                      System.out.println("");
				}

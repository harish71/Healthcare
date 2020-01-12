package com.slokam.healthcare.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.healthcare.entity.Med;
				@Repository
				public interface MedRepo extends JpaRepository<Med, Integer> {

				}

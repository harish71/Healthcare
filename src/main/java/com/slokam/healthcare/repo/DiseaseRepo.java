package com.slokam.healthcare.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.healthcare.entity.Disease;
				@Repository
				public interface DiseaseRepo extends JpaRepository<Disease, Integer> {

				}

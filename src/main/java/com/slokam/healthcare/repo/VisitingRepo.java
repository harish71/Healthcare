package com.slokam.healthcare.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.healthcare.entity.Visiting;
				@Repository
				public interface VisitingRepo extends JpaRepository<Visiting, Integer> {

				}

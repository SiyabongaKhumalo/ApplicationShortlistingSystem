package com.applicatiosShortlistingApp.applicationsShortlistingProject.Repositories;


import com.applicatiosShortlistingApp.applicationsShortlistingProject.Entities.Qualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificationRepository extends JpaRepository<Qualification, Integer> {
}

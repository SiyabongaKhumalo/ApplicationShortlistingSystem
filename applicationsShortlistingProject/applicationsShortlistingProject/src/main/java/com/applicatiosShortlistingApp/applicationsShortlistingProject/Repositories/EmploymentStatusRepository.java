package com.applicatiosShortlistingApp.applicationsShortlistingProject.Repositories;

import com.applicatiosShortlistingApp.applicationsShortlistingProject.Entities.EmploymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentStatusRepository extends JpaRepository<EmploymentStatus , String> {
}

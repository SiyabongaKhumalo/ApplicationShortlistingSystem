package com.applicatiosShortlistingApp.applicationsShortlistingProject.Repositories;


import com.applicatiosShortlistingApp.applicationsShortlistingProject.Entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}

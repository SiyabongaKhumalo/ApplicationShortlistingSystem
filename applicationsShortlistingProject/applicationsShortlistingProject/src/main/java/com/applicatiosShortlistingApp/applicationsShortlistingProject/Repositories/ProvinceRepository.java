package com.applicatiosShortlistingApp.applicationsShortlistingProject.Repositories;


import com.applicatiosShortlistingApp.applicationsShortlistingProject.Entities.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository  extends JpaRepository<Province, String> {
}

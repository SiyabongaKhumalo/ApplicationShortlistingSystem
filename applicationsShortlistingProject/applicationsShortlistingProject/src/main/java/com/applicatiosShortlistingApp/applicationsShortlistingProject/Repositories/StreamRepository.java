package com.applicatiosShortlistingApp.applicationsShortlistingProject.Repositories;


import com.applicatiosShortlistingApp.applicationsShortlistingProject.Entities.Stream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamRepository  extends JpaRepository<Stream, String> {
}

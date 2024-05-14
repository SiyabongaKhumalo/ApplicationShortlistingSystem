package com.applicatiosShortlistingApp.applicationsShortlistingProject.Repositories;


import com.applicatiosShortlistingApp.applicationsShortlistingProject.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
}

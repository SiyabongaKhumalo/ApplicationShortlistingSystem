package com.applicatiosShortlistingApp.applicationsShortlistingProject.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="EmploymentStatus_Table")
public class EmploymentStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String statusInfo;
}

package com.applicatiosShortlistingApp.applicationsShortlistingProject.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="Province_Table")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
}

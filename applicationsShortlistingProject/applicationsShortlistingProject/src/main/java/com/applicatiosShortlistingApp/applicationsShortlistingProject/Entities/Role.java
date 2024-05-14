package com.applicatiosShortlistingApp.applicationsShortlistingProject.Entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="Role_Table")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
}

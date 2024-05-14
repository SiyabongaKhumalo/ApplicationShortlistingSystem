package com.applicatiosShortlistingApp.applicationsShortlistingProject.Entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="Stream_Table")
public class Stream {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
}

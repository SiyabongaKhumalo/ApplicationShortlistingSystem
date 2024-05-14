package com.applicatiosShortlistingApp.applicationsShortlistingProject.Entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="User_Table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String FirstName;
    private String LastName;
    private String phoneNumber;


}

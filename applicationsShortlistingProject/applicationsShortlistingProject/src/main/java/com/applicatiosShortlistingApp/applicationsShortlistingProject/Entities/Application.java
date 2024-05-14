package com.applicatiosShortlistingApp.applicationsShortlistingProject.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "Application_Table")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private Date openingDate;
    private Date closingDate;
    private Date appliedDate;


}

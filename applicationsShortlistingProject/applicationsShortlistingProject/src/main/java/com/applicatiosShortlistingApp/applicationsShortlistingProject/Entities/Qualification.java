package com.applicatiosShortlistingApp.applicationsShortlistingProject.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.HashSet;

@Entity
@Data
@Table(name ="Qualification_Table")
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String qualificationid;
    private String qualificationName;
    private String institutionName;
    private Date awardedDate;


}

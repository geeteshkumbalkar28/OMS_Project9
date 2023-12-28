package com.example.OMS.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "Interview")
@Getter
@Setter

public class Interview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer InterviewId;

    private String firstName;
    private String lastName;
    private String email;
    private String mobileNo;
    private Date interviewDate;
    private LocalTime interviewTime;
    private String profile;
    private String gender;
    private boolean status;
    private Date datetime;
    private String location;
    private boolean mode;
    private boolean result;

}

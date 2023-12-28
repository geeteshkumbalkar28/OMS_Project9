package com.example.OMS.Entity;


import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int projectId;
    private String projectName;
    private String clientName;
    private String Description;
    private String assignedTo;
    private Date startDate;
    private Date endDate;
    private String status;
    private int duration;


    @ManyToOne(fetch = FetchType.EAGER)
    private Users user;

//    @ManyToOne(fetch = FetchType.EAGER)
//    private Client client;


    //Constructor
    public Project() {

    }

}

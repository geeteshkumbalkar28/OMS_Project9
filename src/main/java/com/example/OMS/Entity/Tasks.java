package com.example.OMS.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int taskId;
    private String description;
    private String assignedTo;
    private String taskName;
    private boolean status;
    private boolean duration;

    @ManyToOne(fetch = FetchType.EAGER)
    private Project project;


    //Constructor
    public Tasks() {

    }
}

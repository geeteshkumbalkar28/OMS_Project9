package com.example.OMS.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Tokens")
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Token_Id" , nullable = false)
    private Long tokenId;

    @Column(name = "Task_Name" , length = 45)
    private String taskName;

    @Column(name = "Subtask_Name" , length = 45)
    private String subTaskName;

    @Column(name = "Description" , length = 250)
    private String description;

    @Column(name = "Status")
    private String status;

    @Column(name = "Duration" , length = 45)
    private String duration;

    @Column(name = "Comments" , length = 250)
    private String comments;

    @Column(name = "AssignedTo_UserId" , length = 30)
    private Long assignedToUserId;

    @Column(name = "Create_Date")
    private LocalDate createDate;

    @Column(name = "End_Date")
    private LocalDate endDate;

    @Column(name = "Start_Time")
    private LocalDateTime startTime;

    @Column(name = "End_Time")
    private LocalDateTime endTime;

    @ManyToOne(fetch = FetchType.EAGER , optional = false)
    private Task taskid;

    @OneToMany(mappedBy = "project_id")
    private Long projectId;

}

package com.example.OMS.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Token_id" , nullable = false)
    private Long taskId;

    @Column(name = "Task_Name" , length = 250)
    private String taskName;

    @Column(name = "Description" , length = 250)
    private String description;

    @Column(name = "Assigned_To" , length = 30)
    private Long assignedTo;

    @Column(name = "Status")
    private String status;

    @Column(name = "Duration" , length = 45)
    private String duration;

    @OneToMany(mappedBy = "taskid")
    private List<Task> task_id = new LinkedList<>();

    @ManyToOne(fetch = FetchType.EAGER , optional = false)
    private Project projectId;
}

package com.example.OMS.Dto;

import lombok.Data;

import java.util.Date;

@Data
public class ProjectDto {

    private int projectId;
    private String projectName;
    private String clientName;
    private String Description;
    private String assignedTo;
    private Date startDate;
    private Date endDate;
    private String status;
    private int duration;



}

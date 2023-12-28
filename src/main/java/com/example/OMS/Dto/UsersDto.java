package com.example.OMS.Dto;

import com.example.OMS.Entity.UserRole;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UsersDto {
    private int userId;

    private Date date;
    private String email;
    private String fullName;
    private String gender;
    private String mobileNumber;
    private String password;
    private String reference;
    private String status;


}

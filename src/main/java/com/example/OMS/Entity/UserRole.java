package com.example.OMS.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "user_role")
@Getter
@Setter
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userRoleId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Users user;

    @ManyToOne
    private Role role;
}

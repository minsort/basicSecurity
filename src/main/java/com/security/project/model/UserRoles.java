package com.security.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="user_roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"login","role"})})
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String login;
    private String password;
    private String position;
    private String role;
}


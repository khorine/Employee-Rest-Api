package com.springboot.springbootbackend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String lastName;

    @Column(name = "last_name")
    private  String firstName;

    @Column(name = "email")
    private String email;

}

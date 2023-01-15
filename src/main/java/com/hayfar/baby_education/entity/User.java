package com.hayfar.baby_education.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="users")
@Data
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String password;
}
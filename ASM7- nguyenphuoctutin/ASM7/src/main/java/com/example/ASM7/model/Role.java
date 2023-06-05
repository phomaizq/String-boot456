package com.example.ASM7.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer role_id;
    @Column
    private String name;
}
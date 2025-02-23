package com.jparepo.demo.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
}

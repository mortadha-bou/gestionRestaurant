package com.example.resto.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "chef")
public class Chef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Name;
    private String Role;


    public Chef() {
    }

    public Chef(int  id, String name, String role) {
        this.id = id;
        this.Name = name;
        this.Role = role;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }


}

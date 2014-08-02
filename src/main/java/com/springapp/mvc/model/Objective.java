package com.springapp.mvc.model;

import javax.persistence.*;

@Entity(name = "objective")
public class Objective {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Basic
    private String name;
    @Basic
    private String description;

    public Objective(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Objective() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.springapp.mvc.model;

import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;

@Entity(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String name;
    @Basic
    private String description;

    @ManyToOne
    @ForeignKey(name="FK_OBJECTIVE")
    private Objective objective;

    public Task() {

    }

    public Task(String description, String name, Objective objective) {
        this.description = description;
        this.name = name;
        this.objective = objective;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }
}

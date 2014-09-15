package com.springapp.mvc.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity(name = "objective")
public class Objective implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String name;
    @Basic
    private String description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "objective")
    private Set<Task> tasks;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
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

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Objective objective = (Objective) o;

        if (id != null ? !id.equals(objective.id) : objective.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}

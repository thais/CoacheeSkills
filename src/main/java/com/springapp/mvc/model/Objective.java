package com.springapp.mvc.model;

public class Objective {

    private String name;
    private String description;
    private Pillar pillar;

    public Objective(String name, String description, Pillar pillar) {
        this.name = name;
        this.description = description;
        this.pillar = pillar;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Pillar getPillar() {
        return pillar;
    }
}

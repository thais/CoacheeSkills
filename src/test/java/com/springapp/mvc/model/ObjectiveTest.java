package com.springapp.mvc.model;

import org.junit.Before;

public class ObjectiveTest {

    private Objective objective;
    private String name;
    private String description;
    private Pillar pillar;

    @Before
    public void setUp() throws Exception {
        name = "name";
        description = "description";
        pillar = new Pillar(1);
    }

}

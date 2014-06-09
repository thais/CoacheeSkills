package com.springapp.mvc.model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class ObjectiveTest {

    private Objective objective;
    private String name;
    private String description;
    private Pillar pillar;

    @Test
    public void cannotBeEmpty() throws Exception {
        name = "name";
        description = "description";
        pillar = new Pillar(1);
        objective = new Objective(name, description, pillar);

        assertThat(objective.getName(), is(name));
        assertThat(objective.getDescription(), is(description));
        assertNotNull(objective.getPillar());
    }
}

package com.springapp.mvc.model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PillarTest {

    @Test
    public void getPillarMustAcceptOneTwoOrThree() throws Exception {
        Pillar pillarOne = new Pillar(1);
        Pillar pillarTwo = new Pillar(2);
        Pillar pillarThree = new Pillar(3);

        assertThat(pillarOne.getPillar(), is(1));
        assertThat(pillarTwo.getPillar(), is(2));
        assertThat(pillarThree.getPillar(), is(3));
    }

    @Test (expected = IllegalArgumentException.class)
    public void cannotAcceptNumbersBellowOneOrMoreThanThree() throws Exception {
        Pillar pillarFour = new Pillar(4);
        Pillar pillarZero = new Pillar(0);
    }
}

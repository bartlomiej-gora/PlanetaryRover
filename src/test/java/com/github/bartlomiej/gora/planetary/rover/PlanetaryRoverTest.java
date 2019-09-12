package com.github.bartlomiej.gora.planetary.rover;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class PlanetaryRoverTest {

    public static final int LEFT = 0;
    public static final int RIGHT = 50;
    public static final int TOP = 0;
    public static final int BOTTOM = 50;
    public static final int CENTER_X = 25;
    public static final int CENTER_Y = 25;

    private PlanetaryRover tesee;
    private PlanetSufrace surface;

    @Before
    public void setup() {
        surface = new PlanetSufrace(LEFT, RIGHT, TOP, BOTTOM);
        tesee = new PlanetaryRover(CENTER_X, CENTER_Y, Direction.NORTH, surface);
    }

}

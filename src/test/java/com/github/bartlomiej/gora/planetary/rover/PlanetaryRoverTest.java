package com.github.bartlomiej.gora.planetary.rover;

import org.junit.Before;

public class PlanetaryRoverTest {

    public static final int LEFT = 0;
    public static final int RIGHT = 50;
    public static final int TOP = 0;
    public static final int BOTTOM = 50;
    public static final int CENTER_X = 25;
    public static final int CENTER_Y = 25;

    private PlanetaryRover tesee;
    private PlanetSurface surface;

    @Before
    public void setup() {
        surface = new PlanetSurface(LEFT, RIGHT, TOP, BOTTOM);
        tesee = PlanetaryRover.land(CENTER_X, CENTER_Y, Direction.NORTH, surface);
    }

}

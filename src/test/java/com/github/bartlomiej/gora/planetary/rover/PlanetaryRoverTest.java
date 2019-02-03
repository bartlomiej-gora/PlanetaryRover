package com.github.bartlomiej.gora.planetary.rover;

import org.junit.Before;

public class PlanetaryRoverTest {

    public static final int LEFT = 0;
    public static final int RIGHT = 100;
    public static final int TOP = 0;
    public static final int BOTTOM = 100;
    public static final int CENTER_X = 50;
    public static final int CENTER_Y = 50;

    private PlanetryRover tesee;
    private PlanetSufrace surface;

    @Before
    public void setup() {
        surface = new PlanetSufrace(LEFT, RIGHT, TOP, BOTTOM);
        tesee = new PlanetryRover(CENTER_X, CENTER_Y, Direction.NORTH, surface);
    }


}

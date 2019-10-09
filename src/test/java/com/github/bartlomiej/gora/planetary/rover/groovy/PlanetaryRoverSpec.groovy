package com.github.bartlomiej.gora.planetary.rover.groovy

import com.github.bartlomiej.gora.planetary.rover.Direction
import com.github.bartlomiej.gora.planetary.rover.PlanetSurface
import com.github.bartlomiej.gora.planetary.rover.PlanetaryRover
import spock.lang.Specification

class PlanetaryRoverSpec extends Specification {

    static final LEFT = 0;
    static final RIGHT = 50;
    static final TOP = 0;
    static final BOTTOM = 50;
    static final CENTER_X = 25;
    static final CENTER_Y = 25;

     PlanetaryRover testee;
     PlanetSurface surface;

    def setup() {
        surface = new PlanetSurface(LEFT, RIGHT, TOP, BOTTOM);
        testee = PlanetaryRover.land(CENTER_X, CENTER_Y, Direction.NORTH, surface);
    }

}

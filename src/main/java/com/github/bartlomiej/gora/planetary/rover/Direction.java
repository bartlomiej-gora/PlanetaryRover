package com.github.bartlomiej.gora.planetary.rover;

import java.util.Arrays;

public enum Direction {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);

    private final int degreesFromNorth;

    Direction(int degreesFromNorth) {
        this.degreesFromNorth = degreesFromNorth;
    }

    public Direction directionToRight() {
        return directionForDegreesFromNorth(degreesFromNorth + 90);
    }

    public Direction directionToLeft() {
        return directionForDegreesFromNorth(degreesFromNorth - 90);
    }

    public Direction directionForDegreesFromNorth(int degreesFromNorth) {
        return Arrays.stream(Direction.values())
                .filter(direction -> direction.degreesFromNorth == Math.floorMod(degreesFromNorth, 360))
                .findFirst()
                .orElse(null);

    }
}

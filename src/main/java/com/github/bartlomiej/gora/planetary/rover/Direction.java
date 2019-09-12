package com.github.bartlomiej.gora.planetary.rover;

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
        int normalizedDegrees = Math.floorMod(degreesFromNorth, 360);
        for (Direction direction : Direction.values()) {
            if (direction.degreesFromNorth == normalizedDegrees) {
                return direction;
            }
        }
        return null;
    }
}

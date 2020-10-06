package com.github.bartlomiej.gora.planetary.rover;

public class PlanetaryRover {

    private int x;
    private int y;
    final private PlanetSurface planetSurface;

    private Direction direction;

    private PlanetaryRover(final int x, final int y, final Direction direction, final PlanetSurface planetSurface) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.planetSurface = planetSurface;
    }

    public static PlanetaryRover land(final int x,
                                      final int y,
                                      final Direction direction,
                                      final PlanetSurface planetSurface) {
        return new PlanetaryRover(x, y, direction, planetSurface);
    }

    public void move(final String directions) {
        directions.chars().forEach(character -> {
            switch (Character.valueOf((char) character).toString()) {
                case "L" -> direction = direction.directionToLeft();
                case "R" -> direction = direction.directionToRight();
                case "F" -> forward();
                case "B" -> backward();
            }
        });

    }

    private void backward() {
        switch (direction) {
            case NORTH -> y = y - 1;
            case SOUTH -> y = y + 1;
            case EAST -> x = x - 1;
            case WEST -> x = x + 1;

        }
    }

    private void forward() {
        switch (direction) {
            case NORTH -> y = y + 1;
            case SOUTH -> y = y - 1;
            case EAST -> x = x + 1;
            case WEST -> x = x - 1;

        }
    }

    public static class Placement {

        final private int x;
        final private int y;
        final private Direction direction;

        Placement(final int x, final int y, final Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Direction getDirection() {
            return direction;
        }
    }

    public Placement getPlacement() {
        return new Placement(x, y, direction);
    }
}

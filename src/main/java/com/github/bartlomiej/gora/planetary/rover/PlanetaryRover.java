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

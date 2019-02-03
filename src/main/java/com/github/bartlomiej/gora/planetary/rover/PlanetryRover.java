package com.github.bartlomiej.gora.planetary.rover;

public class PlanetryRover {

    private int x;
    private int y;
    private PlanetSufrace planetSufrace;

    private Direction direction;

    public PlanetryRover(final int x, final int y, final Direction direction, final PlanetSufrace planetSufrace) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.planetSufrace = planetSufrace;
    }

    public void move(final String directions) {

    }

    public class Placement {
        private int x;
        private int y;
        private Direction direction;

        public Placement(final int x, final int y, final Direction direction) {
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

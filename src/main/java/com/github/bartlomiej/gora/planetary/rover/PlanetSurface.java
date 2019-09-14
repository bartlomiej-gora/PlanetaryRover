package com.github.bartlomiej.gora.planetary.rover;

public class PlanetSurface {

    private final int leftBorder;
    private final int rightBorder;
    private final int topBorder;
    private final int bottomBorder;

    public PlanetSurface(final int leftBorder, final int rightBorder, final int topBorder, final int bottomBorder) {
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        this.topBorder = topBorder;
        this.bottomBorder = bottomBorder;
    }

    public int getLeftBorder() {
        return leftBorder;
    }

    public int getRightBorder() {
        return rightBorder;
    }

    public int getTopBorder() {
        return topBorder;
    }

    public int getBottomBorder() {
        return bottomBorder;
    }
}

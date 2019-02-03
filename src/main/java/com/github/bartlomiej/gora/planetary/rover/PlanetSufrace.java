package com.github.bartlomiej.gora.planetary.rover;

public class PlanetSufrace {

    private final int leftBorder;
    private final int rightBourder;
    private final int topBorder;
    private final int bottomBorder;

    public PlanetSufrace(final int leftBorder, final int rightBourder, final int topBorder, final int bottomBorder) {
        this.leftBorder = leftBorder;
        this.rightBourder = rightBourder;
        this.topBorder = topBorder;
        this.bottomBorder = bottomBorder;
    }

    public int getLeftBorder() {
        return leftBorder;
    }

    public int getRightBourder() {
        return rightBourder;
    }

    public int getTopBorder() {
        return topBorder;
    }

    public int getBottomBorder() {
        return bottomBorder;
    }
}

package com.github.bartlomiej.gora.planetary.rover

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test


class PlanetaryRoverTest {
    val LEFT = 0
    val RIGHT = 50
    val TOP = 0
    val BOTTOM = 50
    val CENTER_X = 25
    val CENTER_Y = 25

    @Test
    fun `L - skręć w lewo (left)`() {

        val surface = PlanetSurface(LEFT, RIGHT, TOP, BOTTOM)
        val testee = PlanetaryRover.land(CENTER_X, CENTER_Y, Direction.NORTH, surface)

        testee.move("L")

        testee.placement.direction shouldBe Direction.WEST;

    }

    @Test
    fun `R - skręć w prawo (right)`() {

        val surface = PlanetSurface(LEFT, RIGHT, TOP, BOTTOM)
        val testee = PlanetaryRover.land(CENTER_X, CENTER_Y, Direction.NORTH, surface)

        testee.move("R")

        testee.placement.direction shouldBe Direction.EAST;

    }

    @Test
    fun `F - do przodu (forward)`() {

        val surface = PlanetSurface(LEFT, RIGHT, TOP, BOTTOM)
        val testee = PlanetaryRover.land(CENTER_X, CENTER_Y, Direction.NORTH, surface)

        testee.move("F")

        testee.placement.y shouldBe CENTER_Y + 1;

    }

    @Test
    fun `B - do tyłu (back)`() {

        val surface = PlanetSurface(LEFT, RIGHT, TOP, BOTTOM)
        val testee = PlanetaryRover.land(CENTER_X, CENTER_Y, Direction.NORTH, surface)

        testee.move("B")

        testee.placement.y shouldBe CENTER_Y - 1;

    }
}
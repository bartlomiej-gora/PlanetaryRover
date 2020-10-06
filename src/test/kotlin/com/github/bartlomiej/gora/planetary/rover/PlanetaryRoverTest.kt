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
    fun `L - skręć w lewo (left) bedąc skierowany na EAST`() {

        val surface = PlanetSurface(LEFT, RIGHT, TOP, BOTTOM)
        val testee = PlanetaryRover.land(CENTER_X, CENTER_Y, Direction.EAST, surface)

        testee.move("L")

        testee.placement.direction shouldBe Direction.NORTH;

    }

    @Test
    fun `R - skręć w prawo (right)`() {

        val surface = PlanetSurface(LEFT, RIGHT, TOP, BOTTOM)
        val testee = PlanetaryRover.land(CENTER_X, CENTER_Y, Direction.NORTH, surface)

        testee.move("R")

        testee.placement.direction shouldBe Direction.EAST;

    }

    @Test
    fun `R - skręć w prawo (right) będąc skierowanym na SOUTH`() {

        val surface = PlanetSurface(LEFT, RIGHT, TOP, BOTTOM)
        val testee = PlanetaryRover.land(CENTER_X, CENTER_Y, Direction.SOUTH, surface)

        testee.move("R")

        testee.placement.direction shouldBe Direction.WEST;

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

    @Test
    fun `FFFLFFFRFFFRFFFLBB`(){

        val surface = PlanetSurface(LEFT, RIGHT, TOP, BOTTOM)
        val testee = PlanetaryRover.land(CENTER_X, CENTER_Y, Direction.NORTH, surface)

        testee.move("FFFLFFFRFFFRFFFLBB")

        //(25, 25)->FFF (25,28)->L->FFF(22,28)->R->FFF->(22,31)->R->FFF->(25,31)->L->BB(25,29)

        testee.placement.y shouldBe 29
        testee.placement.x shouldBe 25
        testee.placement.direction shouldBe Direction.NORTH
    }
}
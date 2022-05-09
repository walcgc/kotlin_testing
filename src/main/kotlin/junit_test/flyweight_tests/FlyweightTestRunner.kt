package junit_test.flyweight_tests

import design_patterns.structural.flyweight.Circle
import design_patterns.structural.flyweight.ShapeFactory
import design_patterns.structural.flyweight.TestFunctions
import org.junit.Assert.*
import org.junit.Test
import java.util.logging.Logger

class FlyweightTestRunner {

    private val logger = Logger.getLogger(FlyweightTestRunner::class.java.name)

    @Test
    fun completeCircleDetailsXXX1() {
        // Test if functions generate random numbers and getters and setters are working.
        val circle = ShapeFactory.getCircle(TestFunctions.getRandomColor()) as Circle
        circle.setX(TestFunctions.getRandomX())
        circle.setY(TestFunctions.getRandomY())
        circle.setRadius(100)

        assertNotNull(circle.color)
        assertNotNull(circle.x)
        assertNotNull(circle.y)
        assertNotNull(circle.radius)


    }

    @Test
    fun completeCircleDetailsXXX2() {
        // Test if functions generate random numbers and getters and setters are working.
        // non - random values
        val circle = ShapeFactory.getCircle("Blue") as Circle
        circle.setX(20)
        circle.setY(47)
        circle.setRadius(98)

        assertNotNull(circle.color)
        assertNotNull(circle.x)
        assertNotNull(circle.y)
        assertNotNull(circle.radius)

        assertEquals("Circle: Draw() [Color : Blue, x : 20, y : 47, radius : 98]",circle.drawMessage())

    }

    @Test
    fun incompleteCircleDetailsXXX1() {
        // Incomplete details of circle
        //There's a bug here, if you change it to Blue, seems like it's referencing past object from other test.
        val circle = ShapeFactory.getCircle("Green") as Circle
        circle.setX(20)

        circle.setRadius(98)

        assertNotNull(circle.color)
        assertNotNull(circle.x)
        assertEquals(0, circle.y)
        assertNotNull(circle.radius)

        assertEquals("Circle: Draw() [Color : Green, x : 20, y : 0, radius : 98]",circle.drawMessage())

    }

}
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
        val circle = ShapeFactory.getCircle(TestFunctions.randomColor) as Circle
        circle.x = TestFunctions.randomX
        circle.y = TestFunctions.randomY
        circle.radius = 100

        assertNotNull(circle.color)
        assertNotNull(circle.x)
        assertNotNull(circle.y)
        assertNotNull(circle.radius)

        logger.info("Circle exists.")

    }

    @Test
    fun completeCircleDetailsXXX2() {
        // Test if functions generate random numbers and getters and setters are working.
        // non - random values
        val circle = ShapeFactory.getCircle("Blue") as Circle
        circle.x = 20
        circle.y = 47
        circle.radius =98

        assertNotNull(circle.color)
        assertNotNull(circle.x)
        assertNotNull(circle.y)
        assertNotNull(circle.radius)

        assertEquals("Circle: Draw() [Color : Blue, x : 20, y : 47, radius : 98]",circle.drawMessage())

        logger.info("Circle exists.")

    }

    @Test
    fun incompleteCircleDetailsXXX1() {
        // Incomplete details of circle
        //There's a bug here, if you change it to Blue, seems like it's referencing past object from other test.

        val circle = ShapeFactory.getCircle("Yellow") as Circle
        circle.x = 20

        circle.radius = 98

        assertNotNull(circle.color)
        assertNotNull(circle.x)
        assertEquals(0, circle.y)
        assertNotNull(circle.radius)

        assertEquals("Circle: Draw() [Color : Yellow, x : 20, y : 0, radius : 98]",circle.drawMessage())

        logger.info("Circle exists.")
    }

    @Test
    fun testItemCount() {

        val circle = ShapeFactory.getCircle("Orange") as Circle
        circle.x = 20
        circle.y = 47
        circle.radius =98

        val primaryValue = ShapeFactory.getMapSize()
        logger.info("Number of existing circles: $primaryValue")

        val circle2 = ShapeFactory.getCircle("Brown") as Circle
        circle.x = 10
        circle.y = 27
        circle.radius = 78

        val oldValue = ShapeFactory.getMapSize()
        logger.info("Number of existing circles: $oldValue")

        val circle3 = ShapeFactory.getCircle("Orange") as Circle
        circle.x = 40
        circle.y = 49
        circle.radius = 100

        val newValue = ShapeFactory.getMapSize()
        logger.info("Number of existing circles: $newValue")

        assertEquals(oldValue, newValue)


    }



}
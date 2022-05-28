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
    fun testCircleCount() {

        //tests if flyweight is properly reusing already-existing circles of the same color

        val circle = ShapeFactory.getCircle("Orange") as Circle
        circle.x = 20
        circle.y = 47
        circle.radius =98

        // map size after creating a new circle of color Orange
        val primaryItemCount = ShapeFactory.getMapSize()
        logger.info("Number of existing circles: $primaryItemCount")

        val circle2 = ShapeFactory.getCircle("Brown") as Circle
        circle.x = 10
        circle.y = 27
        circle.radius = 78

        // map size after creating a new circle of color Brown
        // should be 1 more than primaryItemCount
        val oldItemCount = ShapeFactory.getMapSize()
        logger.info("Number of existing circles: $oldItemCount")

        val circle3 = ShapeFactory.getCircle("Orange") as Circle
        circle.x = 40
        circle.y = 49
        circle.radius = 100

        // map size after creating another new circle of color Orange
        // should not change because an Orange circle already exists
        val newItemCount = ShapeFactory.getMapSize()
        logger.info("Number of existing circles: $newItemCount")

        assertEquals(oldItemCount, newItemCount)
        logger.info("Success: Existing circle replaced. New object creation avoided.")


    }



}
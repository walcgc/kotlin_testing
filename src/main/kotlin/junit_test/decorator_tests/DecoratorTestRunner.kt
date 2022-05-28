package junit_test.decorator_tests

import design_patterns.structural.decorator.*
import org.junit.Assert.*
import org.junit.Test
import java.util.logging.Logger

class DecoratorTestRunner {

    private val logger = Logger.getLogger(DecoratorTestRunner::class.java.name)

    @Test
    fun decoratorIsCarXXX1() {
        // checks if carDecorator implements Car
        val carDecorator = CarDecorator(CarInstance())
        assertTrue(carDecorator is Car)
        logger.info("Implemented Car.")

    }

    @Test
    fun raceCarIsCarXXX1() {
        // checks if carDecorator implements Car
        val raceCar: Car = RaceCar(CarInstance())
        assertTrue(raceCar is Car)
        logger.info("Implemented Car.")

    }

    @Test
    fun raceCarHasCarDecoratorXXX1() {
        // checks if carDecorator implements Car
        val raceCar: Car = RaceCar(CarInstance())
        assertTrue(raceCar is CarDecorator)
        logger.info("Implemented Car.")

    }

    @Test
    fun methodIsIntactXXX1() {
        // checks if the original method in car remains intact after being decorated
        val normalCar: Car = CarInstance()
        val raceCar: Car = RaceCar(CarInstance())
        assertEquals(raceCar.addFeature(), normalCar.addFeature());
        logger.info("Original method is intact")

    }

}
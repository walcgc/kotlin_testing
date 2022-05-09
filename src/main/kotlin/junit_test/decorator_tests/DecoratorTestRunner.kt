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

    }

    @Test
    fun raceCarIsCarXXX1() {
        // checks if carDecorator implements Car
        val raceCar: Car = RaceCar(CarInstance())
        assertTrue(raceCar is Car)

    }

    @Test
    fun raceCarHasCarDecoratorXXX1() {
        // checks if carDecorator implements Car
        val raceCar: Car = RaceCar(CarInstance())
        assertTrue(raceCar is CarDecorator)

    }

}
package junit_test.factory_tests

import design_patterns.creational.factory.CupcakeFactory
import design_patterns.creational.factory.cupcakes.*
import org.junit.Assert.*
import org.junit.Test
import java.util.logging.Logger


class FactoryTestRunner {
    var cupcakeFactory: CupcakeFactory = CupcakeFactory()
    private val logger = Logger.getLogger(FactoryTestRunner::class.java.name)

    @Test
    fun returnsACupcakeXXX1() {
        // checks if the factory actually returns a cupcake
        var cupcake = "Special"
        assertNotNull(cupcakeFactory.makeCupcake(cupcake))
        logger.info(cupcake + " used as input. Default cupcake returned.")

    }

    @Test
    fun returnsChocoCupcakeXXX1() {
        // checks if object is same kind
        var cupcake = "Chocolate"
        assertTrue(cupcakeFactory.makeCupcake(cupcake) is ChocolateCupcake)
        logger.info(cupcake + " used as input. Chocolate cupcake returned.")
    }

    @Test
    fun returnsStrawberryCupcakeXXX1() {
        // checks if object is same kind
        var cupcake = "Strawberry"
        assertTrue(cupcakeFactory.makeCupcake(cupcake) is StrawberryCupcake)
        logger.info(cupcake + " used as input. Strawberry cupcake returned.")
    }

    @Test
    fun returnsBananaCupcakeXXX1() {
        // checks if object is same kind
        var cupcake = "Banana"
        assertTrue(cupcakeFactory.makeCupcake(cupcake) is BananaCupcake)
        logger.info(cupcake + " used as input. Banana cupcake returned.")
    }

    @Test
    fun returnsDefaultCupcakeXXX1() {
        // checks if object is same kind
        var cupcake = "AA"
        assertTrue(cupcakeFactory.makeCupcake(cupcake) is DefaultCupcake)
        logger.info(cupcake + " used as input. Default cupcake returned.")
    }

    @Test
    fun returnsDifferentFlavorsXXX1() {
        // checks if different flavors are produced as intended
        var cupcake1 = cupcakeFactory.makeCupcake("Banana")
        var cupcake2 = cupcakeFactory.makeCupcake("Chocolate")

        assertFalse(cupcake1 == cupcake2)
        logger.info("Two different cupcake flavors returned.")
    }

}


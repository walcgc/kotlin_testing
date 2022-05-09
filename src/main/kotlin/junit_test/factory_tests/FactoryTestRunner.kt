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
    fun returnsNoCupcakeXXX1() {
        // checks if object is same kind
        var cupcake = "Bananas"
        assertNull(cupcakeFactory.makeCupcake(cupcake))
        logger.info(cupcake + " used as input. No cupcake returned.")
    }
}


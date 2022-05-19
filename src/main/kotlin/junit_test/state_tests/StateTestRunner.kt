package junit_test.state_tests

import design_patterns.behavioral.state.cupcakes.Cupcake
import junit_test.state_tests.StateTestCases.calculateDiscountedPrice
import junit_test.state_tests.StateTestCases.isCorrectPrice
import design_patterns.behavioral.state.cupcakes.SpecialCupcake
import design_patterns.behavioral.state.discounts.*

import junit_test.state_tests.StateTestCases
import org.junit.Assert
import org.junit.Test
import java.util.logging.Logger

class StateTestRunner {
    fun printBreak() {
        println("\nPASSED")
        println("===========================================================================")
    }

    // Discount States
    val fullPrice = FullPrice()
    val halfOff = HalfOff()
    val quarterOff = QuarterOff()
    val threeFourthsOff = ThreeFourthsOff()
    val discount: DiscountState = quarterOff
    var referenceDiscountedPrice = 0.0
    var testDiscountedPrice = 0.0

    private val logger = Logger.getLogger(StateTestRunner::class.java.name)


    @Test
    fun fullPriceTestXXX1(){
        val fullPriceCupcake: Cupcake = SpecialCupcake()
        fullPriceCupcake.price = 60.0

        // Testing for full price
        referenceDiscountedPrice = fullPriceCupcake.price
        val test_cupcake1: Cupcake = SpecialCupcake()
        testDiscountedPrice = calculateDiscountedPrice(test_cupcake1, fullPrice)
        Assert.assertEquals(referenceDiscountedPrice, testDiscountedPrice, 0.0)
        Assert.assertTrue(isCorrectPrice(fullPriceCupcake.price, testDiscountedPrice))
        logger.info("Full Price Discount applied")

    }

    @Test
    fun falseTestCaseXXX1(){
        val fullPriceCupcake: Cupcake = SpecialCupcake()
        fullPriceCupcake.price = 60.1

        // Testing for full price
        referenceDiscountedPrice = fullPriceCupcake.price
        val test_cupcake1: Cupcake = SpecialCupcake()
        testDiscountedPrice = calculateDiscountedPrice(test_cupcake1, fullPrice)
        //Assert.assertEquals(referenceDiscountedPrice, testDiscountedPrice, 0.0)
        Assert.assertFalse(isCorrectPrice(fullPriceCupcake.price, testDiscountedPrice))
        logger.info("False Test passed")

    }

    @Test
    fun quarterOffPriceTestXXX1(){
        val cupcake25Off: Cupcake = SpecialCupcake()
        cupcake25Off.price = 45.0

        // Testing for 25 off
        referenceDiscountedPrice = cupcake25Off.price
        val test_cupcake2: Cupcake = SpecialCupcake()
        testDiscountedPrice = calculateDiscountedPrice(test_cupcake2, quarterOff)
        Assert.assertEquals(referenceDiscountedPrice, testDiscountedPrice, 0.0)
        Assert.assertTrue(isCorrectPrice(cupcake25Off.price, testDiscountedPrice))
        logger.info("25% Off Price Discount applied")

    }

    @Test
    fun halfOffPriceTestXXX1(){
        val cupcakeHalfOff: Cupcake = SpecialCupcake()
        cupcakeHalfOff.price = 30.0

        // Testing for half off
        referenceDiscountedPrice = cupcakeHalfOff.price
        val test_cupcake3: Cupcake = SpecialCupcake()
        testDiscountedPrice = calculateDiscountedPrice(test_cupcake3, halfOff)
        Assert.assertEquals(referenceDiscountedPrice, testDiscountedPrice, 0.0)
        Assert.assertTrue(isCorrectPrice(cupcakeHalfOff.price, testDiscountedPrice))
        logger.info("50% Off Price Discount applied")

    }


    @Test
    fun threeFourthsOffDiscountedPrice() {

        val cupcake75Off: Cupcake = SpecialCupcake()
        cupcake75Off.price = 15.0

        // Testing for 75% off
        referenceDiscountedPrice = cupcake75Off.price
        val test_cupcake4: Cupcake = SpecialCupcake()
        testDiscountedPrice = calculateDiscountedPrice(test_cupcake4, threeFourthsOff)
        Assert.assertEquals(referenceDiscountedPrice, testDiscountedPrice, 0.0)
        Assert.assertTrue(isCorrectPrice(cupcake75Off.price, testDiscountedPrice))

        logger.info("75% Off Price Discount applied")
    }
}
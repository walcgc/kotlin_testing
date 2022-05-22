package junit_test.state_tests

import design_patterns.behavioral.state.cupcakes.Cupcake
import design_patterns.behavioral.state.discounts.DiscountState
import java.util.logging.Logger
import java.util.logging.Level

object StateTestCases {

    private val logger = Logger.getLogger(StateTestCases::class.java.name)

    @JvmStatic
    fun calculateDiscountedPrice(
        chosen_cupcake: Cupcake,
        assigned_discount: DiscountState
    ): Double {
        return chosen_cupcake.price * assigned_discount.discount()
    }

    @JvmStatic
    fun isCorrectPrice(test_cupcake_price: Double, reference_cupcake_price: Double): Boolean {


        //set initial value to false
        var result = false


        //check if prices are equal
        if (reference_cupcake_price == test_cupcake_price) {
            logger.log(Level.INFO, "Discount correctly applied")
            result = true
        } else {
            logger.log(Level.WARNING, "Discount incorrectly applied")
        }
        //return result
        return result
    }
}
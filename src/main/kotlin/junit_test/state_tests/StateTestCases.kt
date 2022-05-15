package junit_test.state_tests

import design_patterns.behavioral.state.cupcakes.Cupcake
import design_patterns.behavioral.state.discounts.DiscountState

object StateTestCases {
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

        //Double reference_price = reference_cupcake.getPrice();

        //check if prices are equal
        if (reference_cupcake_price == test_cupcake_price) {
            println("Discount correctly applied")
            result = true
        } else {
            println("Discounted price incorrect")
        }
        //return result
        return result
    }
}
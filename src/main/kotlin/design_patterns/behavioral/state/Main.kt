package design_patterns.behavioral.state
/*
import design_patterns.behavioral.state.CupcakeFactory.randomCupcake
import design_patterns.behavioral.state.cupcakes.Cupcake.presentCupcake
import design_patterns.behavioral.state.cupcakes.Cupcake.price
import design_patterns.behavioral.state.discounts.DiscountState.discount
*/
import design_patterns.behavioral.state.discounts.*
import kotlin.jvm.JvmStatic

object Main {
    // Main acts like a cash register
    @JvmStatic
    fun main(args: Array<String>) {
        // Discount States
        val fullPrice = FullPrice()
        val halfOff = HalfOff()
        val quarterOff = QuarterOff()
        val threeFourthsOff = ThreeFourthsOff()
        val discount: DiscountState = quarterOff
        var total = 0.0

        //Cupcake Factory
        val factory = CupcakeFactory()
        for (i in 0..2) {
            val cupcake = factory.randomCupcake()
            cupcake!!.presentCupcake()
            total += cupcake.price
        }
        println("----------------------------------------------")
        println("Total price: $total")
        println("Discount rate: " + ((1 - discount.discount()) * 100).toString() + " %")
        println("Total price w/ discount: " + (total * discount.discount()).toString())
    }
}
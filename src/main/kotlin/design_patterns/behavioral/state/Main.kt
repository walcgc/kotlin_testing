package design_patterns.behavioral.state

import design_patterns.behavioral.state.cupcakes.Cupcake
import kotlin.jvm.JvmStatic
import design_patterns.behavioral.state.cupcakes.SpecialCupcake
import design_patterns.behavioral.state.discounts.*

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
        var discountedPrice = 0.0
        val sampleCupcake: Cupcake = SpecialCupcake()
        sampleCupcake.presentCupcake()
        discountedPrice = sampleCupcake.price
        println("----------------------------------------------")
        println("Total price: $discountedPrice")
        println("Discount rate: " + ((1 - discount.discount()) * 100).toString() + " %")
        println("Total price w/ discount: " + (discountedPrice * discount.discount()).toString())
    }
}
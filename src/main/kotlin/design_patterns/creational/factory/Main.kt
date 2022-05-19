package design_patterns.creational.factory

import design_patterns.creational.factory.discounts.*

object Main {
    // Main acts like a cash register
    @JvmStatic
    fun main(args: Array<String>) {
        // Discount States
        val fullPrice = FullPrice()
        val halfOff = HalfOff()
        val quarterOff = QuarterOff()
        val threeFourthsOff = ThreeFourthsOff()
        val discount: DiscountState = halfOff
        var total = 0.0

        //Cupcake Factory
        val factory = CupcakeFactory()
        for (i in 0..2) {
            val cupcake = factory.randomCupcake()
            cupcake.presentCupcake()
            total = cupcake.price + total
            
        }
        println("----------------------------------------------")
        println("Total price: $total")
        println("Discount rate: " + ((1 - discount.discount()) * 100).toString() + " %")
        println("Total price w/ discount: " + (total * discount.discount()).toString())
    }
}

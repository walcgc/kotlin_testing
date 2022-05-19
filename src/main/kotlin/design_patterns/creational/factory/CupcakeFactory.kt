package design_patterns.creational.factory

import design_patterns.creational.factory.cupcakes.*
import java.util.*



class CupcakeFactory {
    fun makeCupcake(name: String?): Cupcake {
        return when (name) {
            "Chocolate" -> ChocolateCupcake()
            "Banana" -> BananaCupcake()
            "Strawberry" -> StrawberryCupcake()
            else -> DefaultCupcake()
        }
    }

    fun randomCupcake(): Cupcake {
        val rand = Random()
        val num = rand.nextInt(3)
        return when (num) {
            0 -> ChocolateCupcake()
            1 -> BananaCupcake()
            2 -> StrawberryCupcake()
            else -> DefaultCupcake()
        }
    }
}

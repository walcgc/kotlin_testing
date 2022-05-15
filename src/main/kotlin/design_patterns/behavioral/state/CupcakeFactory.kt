package design_patterns.behavioral.state

import design_patterns.behavioral.state.cupcakes.Cupcake
import design_patterns.behavioral.state.cupcakes.StrawberryCupcake
import java.util.*

class CupcakeFactory {
    fun makeCupcake(name: String?): Cupcake? {
        return when (name) {
            "Strawberry" -> StrawberryCupcake()
            else -> null
        }
    }

    fun randomCupcake(): Cupcake? {
        val rand = Random()
        val num = rand.nextInt(3)
        return when (num) {
            0 -> StrawberryCupcake()
            1 -> StrawberryCupcake()
            2 -> StrawberryCupcake()
            else -> null
        }
    }
}
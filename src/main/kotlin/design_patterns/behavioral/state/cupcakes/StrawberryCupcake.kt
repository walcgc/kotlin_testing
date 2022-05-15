package design_patterns.behavioral.state.cupcakes

/**
import design_patterns.behavioral.state.cupcakes.Cupcake.name
import design_patterns.behavioral.state.cupcakes.Cupcake.flavor
import design_patterns.behavioral.state.cupcakes.Cupcake.price
import design_patterns.behavioral.state.cupcakes.Cupcake.recipeType
**/

class StrawberryCupcake : Cupcake() {
    init {
        name = "Strawberry"
        flavor = "Strawberry"
        price = 60.00
        recipeType = "Keto"
    }
}
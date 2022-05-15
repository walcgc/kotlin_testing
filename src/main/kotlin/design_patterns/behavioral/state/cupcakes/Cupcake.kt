package design_patterns.behavioral.state.cupcakes

abstract class Cupcake {
    var name: String? = null
    var price = 0.0
    var flavor: String? = null
    var recipeType: String? = null
    fun presentCupcake() {
        println(name + " picked - " + price.toString())
    }
}
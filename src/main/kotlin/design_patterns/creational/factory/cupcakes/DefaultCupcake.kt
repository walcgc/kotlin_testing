package design_patterns.creational.factory.cupcakes

class DefaultCupcake: Cupcake() {
    init {
        name = "Default"
        flavor = "Default"
        price = 10.00
        recipeType = "Default"
    }
}
package junit_test.factory_tests

import design_patterns.creational.factory.CupcakeFactory
import design_patterns.creational.factory.cupcakes.*

fun returnChocolateCupcake(): Cupcake {
    var cupcakeFactory: CupcakeFactory = CupcakeFactory()
    var cupcake: Cupcake = cupcakeFactory.makeCupcake("Chocolate")
    return ChocolateCupcake()
}




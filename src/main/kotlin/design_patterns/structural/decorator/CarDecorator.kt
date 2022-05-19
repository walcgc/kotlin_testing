package design_patterns.structural.decorator

open class CarDecorator(protected var car: Car) : Car {
    override fun addFeature() {
        car.addFeature()
    }
}
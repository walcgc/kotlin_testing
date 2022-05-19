package design_patterns.structural.decorator

class RaceCar(car: Car?) : CarDecorator(
    car!!
) {
    override fun addFeature() {
        super.addFeature()
        println("Adding race car features.")
    }
}

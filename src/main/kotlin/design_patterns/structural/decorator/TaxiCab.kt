package design_patterns.structural.decorator

open class TaxiCab(car: Car?) : CarDecorator(
    car!!
) {
    override fun addFeature() {
        super.addFeature()
        println("Adding taxi cab features.")
    }
}
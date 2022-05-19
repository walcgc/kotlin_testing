package design_patterns.structural.decorator

class CarInstance : Car {
    override fun addFeature() {
        println("Basic Feature")
    }
}
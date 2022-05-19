package design_patterns.structural.decorator

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        println("--Race Car --")
        val raceCar: Car = RaceCar(CarInstance())
        raceCar.addFeature()
        println("--Race Car --")
        val raceCab: Car = TaxiCab(RaceCar(CarInstance()))
        raceCab.addFeature()
        println("--Race Car --")
        val cabRacer: Car = RaceCar(TaxiCab(CarInstance()))
        cabRacer.addFeature()
    }

}
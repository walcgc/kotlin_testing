package design_patterns.creational.factory.discounts

class ThreeFourthsOff : DiscountState {
    private val discount = .25
    override fun discount(): Double {
        return discount
    }
}

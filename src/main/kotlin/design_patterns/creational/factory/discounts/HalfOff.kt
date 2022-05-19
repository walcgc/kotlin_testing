package design_patterns.creational.factory.discounts

class HalfOff : DiscountState {
    private val discount = .50
    override fun discount(): Double {
        return discount
    }
}

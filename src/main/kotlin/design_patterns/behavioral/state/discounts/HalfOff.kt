package design_patterns.behavioral.state.discounts

class HalfOff : DiscountState {
    private val discount = .50
    override fun discount(): Double {
        return discount
    }
}
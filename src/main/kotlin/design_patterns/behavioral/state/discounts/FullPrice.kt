package design_patterns.behavioral.state.discounts

class FullPrice : DiscountState {
    private val discount = 1.0
    override fun discount(): Double {
        return discount
    }
}
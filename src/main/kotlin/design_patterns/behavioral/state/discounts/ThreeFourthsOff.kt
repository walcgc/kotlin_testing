package design_patterns.behavioral.state.discounts

class ThreeFourthsOff : DiscountState {
    private val discount = .25
    override fun discount(): Double {
        return discount
    }
}
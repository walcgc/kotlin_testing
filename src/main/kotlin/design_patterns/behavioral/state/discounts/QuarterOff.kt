package design_patterns.behavioral.state.discounts

class QuarterOff : DiscountState {
    private val discount = .75
    override fun discount(): Double {
        return discount
    }
}
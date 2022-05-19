package design_patterns.creational.factory.discounts

class QuarterOff : DiscountState {
    private val discount = .75
    override fun discount(): Double {
        return discount
    }
}

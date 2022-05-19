package design_patterns.creational.factory.discounts

class FullPrice : DiscountState {
    private val discount = 1.0
    override fun discount(): Double {
        return discount
    }
}

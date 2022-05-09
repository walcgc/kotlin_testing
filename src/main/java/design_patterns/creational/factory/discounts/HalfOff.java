package design_patterns.creational.factory.discounts;

public class HalfOff implements DiscountState {

    private double discount = .50;

    @Override
    public double discount() {
        return this.discount;
    }
}

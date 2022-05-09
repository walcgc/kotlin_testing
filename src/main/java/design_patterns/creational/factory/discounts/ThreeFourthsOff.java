package design_patterns.creational.factory.discounts;

public class ThreeFourthsOff implements DiscountState {

    private double discount = .25;

    @Override
    public double discount() {
        return this.discount;
    }


}

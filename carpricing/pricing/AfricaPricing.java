package carpricing.pricing;

public final class AfricaPricing implements RegionalPricing {

    @Override
    public double calculateBasePrice() {
        return 900_000;
    }

    @Override
    public double calculateTax(double basePrice) {
        return basePrice * 0.12;
    }
}

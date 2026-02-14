package carpricing.pricing;

public final class AsiaPricing implements RegionalPricing {

    @Override
    public double calculateBasePrice() {
        return 1_000_000;
    }

    @Override
    public double calculateTax(double basePrice) {
        return basePrice * 0.18;
    }
}

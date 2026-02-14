package carpricing.pricing;

public final class EuropePricing implements RegionalPricing {

    @Override
    public double calculateBasePrice() {
        return 1_800_000;
    }

    @Override
    public double calculateTax(double basePrice) {
        return basePrice * 0.22;
    }
}

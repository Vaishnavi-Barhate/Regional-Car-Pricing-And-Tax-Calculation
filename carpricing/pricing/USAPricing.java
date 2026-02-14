package carpricing.pricing;

public final class USAPricing implements RegionalPricing {

    @Override
    public double calculateBasePrice() {
        return 2_000_000;
    }

    @Override
    public double calculateTax(double basePrice) {
        return basePrice * 0.25;
    }
}

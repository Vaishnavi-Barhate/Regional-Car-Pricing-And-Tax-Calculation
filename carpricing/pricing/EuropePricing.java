package carpricing.pricing;

/**
 * Pricing implementation for Europe region (R2).
 */
public class EuropePricing implements RegionalPricing {

    @Override
    public double calculateBasePrice() {
        // Base price for cars in Europe region
        return 1_800_000;
    }

    @Override
    public double calculateTax(double basePrice) {
        // 22% tax for Europe region
        return basePrice * 0.22;
    }
}

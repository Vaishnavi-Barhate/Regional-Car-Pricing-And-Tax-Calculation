package carpricing.pricing;

/**
 * Pricing implementation for Asia region (R3).
 */
public class AsiaPricing implements RegionalPricing {

    @Override
    public double calculateBasePrice() {
        // Base price for cars in Asia region
        return 1_000_000;
    }

    @Override
    public double calculateTax(double basePrice) {
        // 18% tax for Asia region
        return basePrice * 0.18;
    }
}

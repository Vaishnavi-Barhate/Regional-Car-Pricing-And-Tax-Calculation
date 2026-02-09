package carpricing.pricing;

/**
 * Pricing implementation for USA region (R1).
 */
public class USAPricing implements RegionalPricing {

    @Override
    public double calculateBasePrice() {
        // Base price for cars in USA region
        return 2_000_000;
    }

    @Override
    public double calculateTax(double basePrice) {
        // 25% tax for USA region
        return basePrice * 0.25;
    }
}

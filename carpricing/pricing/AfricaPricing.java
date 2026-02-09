package carpricing.pricing;

/**
 * Pricing implementation for Africa region (R4).
 */
public class AfricaPricing implements RegionalPricing {

    @Override
    public double calculateBasePrice() {
        // Base price for cars in Africa region
        return 900_000;
    }

    @Override
    public double calculateTax(double basePrice) {
        // 12% tax for Africa region
        return basePrice * 0.12;
    }
}

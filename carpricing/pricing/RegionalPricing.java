package carpricing.pricing;

/**
 * Contract for regional car pricing.
 * Every region must define its own base price and tax calculation.
 */
public interface RegionalPricing {

    /**
     * Calculates the base price of the car for a specific region.
     *
     * @return base price
     */
    double calculateBasePrice();

    /**
     * Calculates tax based on the base price.
     *
     * @param basePrice base price of the car
     * @return tax amount
     */
    double calculateTax(double basePrice);
}

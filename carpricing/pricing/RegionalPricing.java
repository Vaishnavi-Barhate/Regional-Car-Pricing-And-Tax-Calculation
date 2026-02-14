package carpricing.pricing;

public sealed interface RegionalPricing
        permits AsiaPricing, USAPricing, EuropePricing, AfricaPricing {

    double calculateBasePrice();

    double calculateTax(double basePrice);

    default double calculateFinalPrice() {
        double base = calculateBasePrice();
        return base + calculateTax(base);
    }
}

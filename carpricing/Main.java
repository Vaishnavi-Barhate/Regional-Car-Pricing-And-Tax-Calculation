package carpricing;

import carpricing.service.CarPricingService;

/**
 * Application entry point.
 */
public class Main {

    public static void main(String[] args) {

        CarPricingService service = new CarPricingService();

        // Example input
        service.calculatePrice("India");
    }
}

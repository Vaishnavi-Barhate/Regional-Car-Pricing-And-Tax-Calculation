package carpricing;

import carpricing.service.CarPricingService;

public final class Main {

    public static void main(String[] args) {

        var service = new CarPricingService();

        try {
            String country = (args.length > 0) ? args[0] : "India";
            service.calculatePrice(country);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

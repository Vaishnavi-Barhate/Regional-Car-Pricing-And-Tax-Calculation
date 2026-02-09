package carpricing.service;

import carpricing.domain.Region;
import carpricing.factory.PricingFactory;
import carpricing.mapper.CountryRegionMapper;
import carpricing.pricing.RegionalPricing;

/**
 * Service layer responsible for calculating
 * the final car price based on country and region.
 */
public class CarPricingService {

    public void calculatePrice(String country) {

        // Identify region based on country
        Region region = CountryRegionMapper.getRegionByCountry(country);

        // Get pricing strategy for the region
        RegionalPricing pricing = PricingFactory.getPricingByRegion(region);

        // Calculate prices
        double basePrice = pricing.calculateBasePrice();
        double tax = pricing.calculateTax(basePrice);
        double finalPrice = basePrice + tax;

        // Output result
        System.out.println("Country      : " + country);
        System.out.println("Region       : " + region);
        System.out.println("Base Price   : " + basePrice);
        System.out.println("Tax          : " + tax);
        System.out.println("Final Price  : " + finalPrice);
    }
}

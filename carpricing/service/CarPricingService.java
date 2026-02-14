package carpricing.service;

import carpricing.domain.Region;
import carpricing.factory.PricingFactory;
import carpricing.mapper.CountryRegionMapper;
import carpricing.pricing.RegionalPricing;

public final class CarPricingService {

    public void calculatePrice(String country) {

        Region region = CountryRegionMapper
                .getRegionByCountry(country)
                .orElseThrow(() ->
                        new IllegalArgumentException("Invalid country: " + country)
                );

        RegionalPricing pricing = PricingFactory.getPricingByRegion(region);

        double basePrice = pricing.calculateBasePrice();
        double tax = pricing.calculateTax(basePrice);
        double finalPrice = pricing.calculateFinalPrice();

        System.out.println("Country      : " + country);
        System.out.println("Region       : " + region);
        System.out.println("Continent    : " + region.continent());
        System.out.println("Base Price   : " + basePrice);
        System.out.println("Tax          : " + tax);
        System.out.println("Final Price  : " + finalPrice);
    }
}

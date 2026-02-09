package carpricing.factory;

import carpricing.domain.Region;
import carpricing.pricing.AfricaPricing;
import carpricing.pricing.AsiaPricing;
import carpricing.pricing.EuropePricing;
import carpricing.pricing.RegionalPricing;
import carpricing.pricing.USAPricing;

/**
 * Factory class responsible for providing the correct
 * RegionalPricing implementation based on region.
 */
public class PricingFactory {

    public static RegionalPricing getPricingByRegion(Region region) {

        return switch (region) {
            case R1 -> new USAPricing();
            case R2 -> new EuropePricing();
            case R3 -> new AsiaPricing();
            case R4 -> new AfricaPricing();
        };
    }
}

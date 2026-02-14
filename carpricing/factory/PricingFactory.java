package carpricing.factory;

import carpricing.domain.Region;
import carpricing.pricing.AfricaPricing;
import carpricing.pricing.AsiaPricing;
import carpricing.pricing.EuropePricing;
import carpricing.pricing.RegionalPricing;
import carpricing.pricing.USAPricing;
import java.util.Map;
import java.util.function.Supplier;

public final class PricingFactory {

    private static final Map<Region, Supplier<RegionalPricing>> PRICING_MAP =
            Map.of(
                    Region.R1, USAPricing::new,
                    Region.R2, EuropePricing::new,
                    Region.R3, AsiaPricing::new,
                    Region.R4, AfricaPricing::new
            );

    public static RegionalPricing getPricingByRegion(Region region) {
        return PRICING_MAP
                .getOrDefault(region, AsiaPricing::new)
                .get();
    }
}

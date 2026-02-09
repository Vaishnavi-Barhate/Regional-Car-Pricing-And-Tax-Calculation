package carpricing.mapper;

import java.util.Map;

import carpricing.domain.Region;

/**
 * Maps country names to their corresponding regions.
 */
public class CountryRegionMapper {

    private static final Map<String, Region> COUNTRY_REGION_MAP = Map.of(
            "USA", Region.R1,
            "Germany", Region.R2,
            "France", Region.R2,
            "India", Region.R3,
            "China", Region.R3,
            "Kenya", Region.R4
    );

    public static Region getRegionByCountry(String country) {
        // Defaulting to Asia if country is not found
        return COUNTRY_REGION_MAP.getOrDefault(country, Region.R3);
    }
}

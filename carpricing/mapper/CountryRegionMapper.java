package carpricing.mapper;

import carpricing.domain.Region;
import java.util.Map;
import java.util.Optional;

public final class CountryRegionMapper {

    private static final Map<String, Region> COUNTRY_REGION_MAP = Map.of(
            "USA", Region.R1,
            "GERMANY", Region.R2,
            "FRANCE", Region.R2,
            "INDIA", Region.R3,
            "CHINA", Region.R3,
            "KENYA", Region.R4
    );

    public static Optional<Region> getRegionByCountry(String country) {

        if (country == null || country.isBlank()) {
            return Optional.empty();
        }

        return Optional.ofNullable(
                COUNTRY_REGION_MAP.get(country.toUpperCase())
        );
    }
}

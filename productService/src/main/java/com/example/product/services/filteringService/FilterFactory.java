package com.example.product.services.filteringService;
public class FilterFactory {

    public static Filter getFilterFromKey(String key) {

        if (key == null) {
            return null;
        }

        return switch (key) {
            case "ram" -> new RAMFilter();
            case "brand" -> new BrandFilter();
            default -> null;
        };
    }
}


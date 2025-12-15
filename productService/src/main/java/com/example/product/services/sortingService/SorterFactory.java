package com.example.product.services.sortingService;

import com.example.product.dtos.search.SortingCriteria;
public class SorterFactory {
    public static Sorter getSortedByCriteria(SortingCriteria sortingCriteria) {

        if (sortingCriteria == null) {
            throw new IllegalArgumentException("SortingCriteria cannot be null");
        }

        return switch (sortingCriteria) {
            case PRICE_HIGH_TO_LOW -> new PriceHighToLowSorter();
            case PRICE_LOW_TO_HIGH -> new PriceLowToHighSorter();
            default -> throw new UnsupportedOperationException(
                    "Sorting not supported: " + sortingCriteria);
        };
    }
}
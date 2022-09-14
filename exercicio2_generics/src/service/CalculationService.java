package service;

import java.util.Collections;
import java.util.List;

public class CalculationService {

    public static <T extends Comparable<? super T>>T max(List<T> products) {
        if (products.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }

        return Collections.max(products);
    }
}

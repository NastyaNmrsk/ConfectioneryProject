package by.itstep.nmrsk.javastages.stage20.model.entity.comparators;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;

import java.util.Comparator;

public class SortByPriceDesc implements Comparator<Meal> {
    @Override
    public int compare(Meal o1, Meal o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}
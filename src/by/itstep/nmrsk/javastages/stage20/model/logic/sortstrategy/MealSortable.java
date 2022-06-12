package by.itstep.nmrsk.javastages.stage20.model.logic.sortstrategy;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;

public interface MealSortable {
    boolean compare(Meal meal1, Meal meal2);
}

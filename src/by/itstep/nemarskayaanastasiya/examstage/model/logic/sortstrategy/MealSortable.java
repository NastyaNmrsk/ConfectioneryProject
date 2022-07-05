package by.itstep.nemarskayaanastasiya.examstage.model.logic.sortstrategy;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;

public interface MealSortable {
    boolean compare(Meal meal1, Meal meal2);
}

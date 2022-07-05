package by.itstep.nemarskayaanastasiya.examstage.model.logic.sortstrategy;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;

public class SortByPriceAsc implements MealSortable{
    @Override
    public boolean compare(Meal meal1, Meal meal2) {
        return meal1.getPrice() > meal2.getPrice();
    }
}

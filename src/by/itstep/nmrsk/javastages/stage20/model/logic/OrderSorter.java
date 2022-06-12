package by.itstep.nmrsk.javastages.stage20.model.logic;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;
import by.itstep.nmrsk.javastages.stage20.model.entity.container.DynamicOrder;
import by.itstep.nmrsk.javastages.stage20.model.entity.container.Order;
import by.itstep.nmrsk.javastages.stage20.model.logic.sortstrategy.MealSortable;

public class OrderSorter {
    public static void sort(DynamicOrder order, MealSortable sortable) {
        for (int i = 0; i < order.size() - 1; i++) {
            for (int j = 0; j < order.size() - 1 - i; j++) {
                if (sortable.compare(order.get(j), order.get(j + 1))) {
                    Meal temp = order.get(j);
                    order.setMeal(j, order.get(j + 1));
                    order.setMeal(j + 1, temp);
                }
            }
        }
    }
}

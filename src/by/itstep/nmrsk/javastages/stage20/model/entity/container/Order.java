package by.itstep.nmrsk.javastages.stage20.model.entity.container;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Meal> meals;

    public Order() {
        meals = new ArrayList<>();
    }

    public Order(List<Meal> list) {
        meals = list;
    }

    public void add(Meal meal) {
        meals.add(meal);
    }

    public boolean remove(Meal meal) {
        return meals.remove(meal);
    }

    public int size() {
        return meals.size();
    }

    public Meal get(int index) {
        return meals.get(index);
    }

    public void set(Meal meal, int index) {
        meals.set(index, meal);
    }

    @Override
    public String toString() {
        if (size() == 0) {
            return "The order is not made";
        }
        StringBuilder builder = new StringBuilder("List of meals: ");
        for (Meal meal : meals) {
            builder.append("\n").append(meal);

        }
        return builder + "";
    }
}

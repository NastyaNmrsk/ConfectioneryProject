package by.itstep.nemarskayaanastasiya.examstage.model.entity.container;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order implements Iterable<Meal>, Serializable {
    private static final long serialVersionUID=1L;
    private List<Meal> meals;

    public Order() {
        meals = new ArrayList<>();
    }

    public Order(List<Meal> list) {
        meals = list;
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
    public Iterator<Meal> iterator() {
        return meals.iterator();
    }
}

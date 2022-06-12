package by.itstep.nmrsk.javastages.stage20.model.entity.container;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;
import by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern.DynamicOrderIterator;
import by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern.Iterable;
import by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern.MyIterator;

public class DynamicOrder implements Order, Iterable {
    private Meal[] meals;

    public DynamicOrder() {
        meals = new Meal[0];

    }

    public DynamicOrder(Meal[] meals) {
        this();
        if (meals != null) {
            this.meals = meals;
        }

    }

    public int size() {
        return meals.length;
    }

    public void setMeal(int index, Meal meal) {
        meals[index] = meal;
    }


    public Meal get(int index) {
        return meals[index];
    }


    public void add(Meal meal) {
        if (meal == null) {
            return;
        }
        Meal[] temp = new Meal[meals.length + 1];
        int i = 0;
        for (; i < meals.length; i++) {
            temp[i] = meals[i];
        }
        temp[i] = meal;
        meals = temp;
    }

    public void remove(int index) {
        Meal[] temp = new Meal[meals.length - 1];

        for (int i = 0, j = 0; i < meals.length; i++) {
            if (i != index) {
                temp[j] = meals[i];
                j++;
            }
        }
        meals = temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (meals.length == 0) {
            builder.append("DynamicOrder is empty.");
        } else {
            builder.append("DynamicOrder:\n");

            for (Meal meal : meals) {
                builder.append("\n").append(meal);
            }

        }

        return builder.toString();
    }

    @Override
    public MyIterator getIterator() {
        return new DynamicOrderIterator(this);
    }
}
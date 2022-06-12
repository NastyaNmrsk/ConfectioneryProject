package by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;

public class ArrayIterator implements MyIterator {
    private Meal[] meals;
    private int current;

    public ArrayIterator(Meal[] meals) {
        this.meals = meals;
        current = 0;
    }

    @Override
    public Meal next() {
        return meals[current++];
    }

    @Override
    public boolean hasNext() {
        return current < meals.length;
    }

    @Override
    public void reset() {
        current = 0;
    }
}
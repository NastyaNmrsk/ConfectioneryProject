package by.itstep.nmrsk.javastages.stage20.model.entity.container;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;
import by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern.FixedOrderIterator;
import by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern.Iterable;
import by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern.MyIterator;

public class FixedOrder implements Order, Iterable {
    public static final int DEFAULT_SIZE = 10;
    private Meal[] array;
    private int size;

    public FixedOrder() {
        array = new Meal[DEFAULT_SIZE];
        size = 0;
    }

    public FixedOrder(int capacity) {
        array = new Meal[capacity];
        size = 0;
    }

    public FixedOrder(Meal[] array) {
        this.array = array;
        size = array.length;
    }

    public Meal get(int index) {
        return array[index];
    }

    public void setMeal(int index, Meal meal) {
        array[index] = meal;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return array.length;
    }

    public void add(Meal meal) {
        if (meal == null) {
            return;
        }

        if (size < array.length) {
            array[size] = meal;
            size++;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void remove(int index) {
        if (isEmpty() || (index < 0 && index >= size)) {
            return;
        }
        if (index == size - 1) {
            array[index] = null;
        } else {

            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
        }
        size--;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (isEmpty()) {
            builder.append("Order is empty.");
        } else {
            builder.append("Order:\n");

            for (int i = 0; i < size; i++) {
                builder.append("\n").append(array[i]);
            }

        }

        return builder.toString();
    }

    @Override
    public MyIterator getIterator() {
        return new FixedOrderIterator(this);
    }
}
package by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;

public class DynamicOrderIterator implements MyIterator {
    private DynamicOrder order;
    private int current;

    public DynamicOrderIterator(DynamicOrder order) {
        this.order = order;
        current = 0;
    }

    @Override
    public Meal next() {
        return order.get(current++);
    }

    @Override
    public boolean hasNext() {
        return current < order.size();
    }

    @Override
    public void reset() {
        current = 0;
    }
}

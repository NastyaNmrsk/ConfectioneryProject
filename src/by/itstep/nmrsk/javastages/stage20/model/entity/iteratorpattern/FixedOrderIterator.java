package by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;
import by.itstep.nmrsk.javastages.stage20.model.entity.container.FixedOrder;

public class FixedOrderIterator implements MyIterator {
    private FixedOrder order;
    private int current;

    public FixedOrderIterator(FixedOrder order) {
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

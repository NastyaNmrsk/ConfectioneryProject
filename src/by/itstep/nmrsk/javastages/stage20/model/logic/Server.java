package by.itstep.nmrsk.javastages.stage20.model.logic;

import by.itstep.nmrsk.javastages.stage20.model.entity.container.Order;
import by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern.Iterable;
import by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern.MyIterator;

public class Server {
    private Server() {
    }

    public static double calculateTotalPrice(Iterable iterable) {
        MyIterator iterator = iterable.getIterator();

        double total = 0;

        while (iterator.hasNext()) {
            total += iterator.next().getPrice();
        }

        return total;
    }
}

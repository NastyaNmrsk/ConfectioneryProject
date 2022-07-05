package by.itstep.nemarskayaanastasiya.examstage.model.logic;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;
import java.util.Iterator;

public class Server {
    private Server() {
    }

    public static double calculateTotalPrice(Iterable<Meal> iterable) {
        Iterator<Meal> iterator = iterable.iterator();

        double total = 0;

        while (iterator.hasNext()) {
            total += iterator.next().getPrice();
        }

        return total;
    }
}

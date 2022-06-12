package by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;

public interface MyIterator {
    Meal next();

    boolean hasNext();

    void reset();
}

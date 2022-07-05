package by.itstep.nemarskayaanastasiya.examstage.model.entity.iteratorpattern;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;

public interface MyIterator {
    Meal next();

    boolean hasNext();

    void reset();
}

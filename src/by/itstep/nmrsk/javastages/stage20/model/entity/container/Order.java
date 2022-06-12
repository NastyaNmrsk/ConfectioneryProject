package by.itstep.nmrsk.javastages.stage20.model.entity.container;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;

public interface Order {
    int size();

    Meal get(int index);
}

package by.itstep.nemarskayaanastasiya.examstage.util;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.container.Order;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.Cake;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.Drink;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.PuffPastry;

public class HardcodeOrderBuilder {
    public static Order createOrder() {
        Cake cake = new Cake("Cylinder", "Cheesecake", 11.0);
        Cake cake1 = new Cake("Cube", "Honeycake", 12.0);
        Drink drink = new Drink("Cocoa", "Marshmallow", 5.0);
        Drink drink1 = new Drink("Tea", "Lemon", 4.5);
        PuffPastry puffpastry = new PuffPastry("Croissant", "Chocolate", 6.0);
        PuffPastry puffpastry1 = new PuffPastry("Croissant", "Salmon", 10.0);

        Order order = new Order();
        order.add(cake);
        order.add(cake1);
        order.add(drink);
        order.add(drink1);
        order.add(puffpastry);
        return order;
    }
}

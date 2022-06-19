package by.itstep.nmrsk.javastages.stage20.util;

import by.itstep.nmrsk.javastages.stage20.model.entity.Cake;
import by.itstep.nmrsk.javastages.stage20.model.entity.Drink;
import by.itstep.nmrsk.javastages.stage20.model.entity.PuffPastry;
import by.itstep.nmrsk.javastages.stage20.model.entity.container.Order;

public class HardcodeOrderBuilder {
    public static Order createOrder() {
        Cake cake = new Cake("Cylinder", "Cheesecake", 11.0, 298);
        Cake cake1 = new Cake("Cube", "Honeycake", 12.0, 311.0);
        Drink drink = new Drink("Cocoa", "Marshmallow", 5.0, 121.0);
        Drink drink1 = new Drink("Tea", "Lemon", 4.5, 28.0);
        PuffPastry puffpastry = new PuffPastry("Croissant", "Chocolate", 6.0, 389.9);
        PuffPastry puffpastry1 = new PuffPastry("Croissant", "Salmon", 10.0, 339.7);

        Order order = new Order();
        order.add(cake);
        order.add(cake1);
        order.add(drink);
        order.add(drink1);
        order.add(puffpastry);
        return order;
    }
}

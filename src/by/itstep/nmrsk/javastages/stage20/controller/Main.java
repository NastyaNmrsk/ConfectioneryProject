package by.itstep.nmrsk.javastages.stage20.controller;

import by.itstep.nmrsk.javastages.stage20.model.entity.Cake;
import by.itstep.nmrsk.javastages.stage20.model.entity.Drink;
import by.itstep.nmrsk.javastages.stage20.model.entity.PuffPastry;
import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;
import by.itstep.nmrsk.javastages.stage20.model.entity.container.Order;
import by.itstep.nmrsk.javastages.stage20.model.logic.OrderSorter;
import by.itstep.nmrsk.javastages.stage20.model.logic.sortstrategy.SortByPriceAsc;

public class Main extends Object {
    public static void main(String[] args) {
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

        Meal[] meals = new Meal[]{cake, drink, puffpastry};

//        MyIterator iterator = new ArrayIterator(meals);
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        iterator.reset();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }


//        order.add(cake);
//        order.add(cake1);
//        order.add(drink);
//        order.add(drink1);

//        for (int i = 0; i < order.size(); i++) {
//            System.out.println(order.get(i));
//        }
        OrderSorter.sort(order, new SortByPriceAsc());
        System.out.println(order);
//        System.out.println();
//        OrderSorter.sort(order, new SortByPriceDesc());
//        System.out.println(order);

//        iterator.reset();
//        double total = Server.calculateTotalPrice(iterator);
//        System.out.println("Total price: " + total);
    }
}

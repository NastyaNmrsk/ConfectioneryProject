package by.itstep.nmrsk.javastages.stage20.controller;

import by.itstep.nmrsk.javastages.stage20.model.entity.container.Order;
import by.itstep.nmrsk.javastages.stage20.model.logic.Server;
import by.itstep.nmrsk.javastages.stage20.util.HardcodeOrderBuilder;


public class Main extends Object {
    public static void main(String[] args) {
        Order order = HardcodeOrderBuilder.createOrder();




        double total = Server.calculateTotalPrice(order);
        System.out.println("Total price: " + total);
    }
}

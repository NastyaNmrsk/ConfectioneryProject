package by.itstep.nemarskayaanastasiya.examstage.controller;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.container.Order;
import by.itstep.nemarskayaanastasiya.examstage.model.logic.Server;

public abstract class AbstractController {

    public abstract Order createOrder();

    public void justDoIt() {


        Order order = createOrder();
        System.out.println(order);
        double total = Server.calculateTotalPrice(order);
        System.out.println("Total price: " + total);
    }
}

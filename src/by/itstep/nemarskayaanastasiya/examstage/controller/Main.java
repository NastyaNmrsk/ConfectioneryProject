package by.itstep.nemarskayaanastasiya.examstage.controller;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.Cake;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.container.Order;
import by.itstep.nemarskayaanastasiya.examstage.model.logic.Server;
import by.itstep.nemarskayaanastasiya.examstage.util.ByteStreamBuilder;
import by.itstep.nemarskayaanastasiya.examstage.util.CharStreamBuilder;
import by.itstep.nemarskayaanastasiya.examstage.util.HardcodeOrderBuilder;
import by.itstep.nemarskayaanastasiya.examstage.util.RandomOrderBuilder;
import by.itstep.nemarskayaanastasiya.examstage.util.exceptions.OrderFileNotFoundException;
import by.itstep.nemarskayaanastasiya.examstage.util.serialization.OrderSerializator;

import java.io.IOException;


public class Main extends Object {
    public static void main(String[] args) throws OrderFileNotFoundException, IOException {
//        Meal meal = new Cake("Tor", "Lime",10);

//        Order order = HardcodeOrderBuilder.createOrder();
        int type = 0;
        Order order = SimpleOrderFactory.getFactory().create(type);

//        OrderSerializator.write(order);
//        System.out.println(OrderSerializator.read());


//        String fileName = "e:/Nastya/test/meal.bin";
//        String fileName = "e:/Nastya/test/meal.txt";
//        ByteStreamBuilder byteStreamBuilder = new ByteStreamBuilder(fileName);
//        CharStreamBuilder builder = new CharStreamBuilder(fileName);
//        Order order = builder.createOrder();
//        builder.saveOrder(order);
//        byteStreamBuilder.saveOrder(order);
//        Order order = ByteStreamBuilder.createOrder();
        System.out.println(order);
        double total = Server.calculateTotalPrice(order);
        System.out.println("Total price: " + total);
    }
}

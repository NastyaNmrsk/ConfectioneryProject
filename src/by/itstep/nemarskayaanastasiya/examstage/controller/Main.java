package by.itstep.nemarskayaanastasiya.examstage.controller;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.Cake;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.container.Order;
import by.itstep.nemarskayaanastasiya.examstage.model.logic.Server;
import by.itstep.nemarskayaanastasiya.examstage.util.exceptions.OrderFileNotFoundException;


import java.io.IOException;


public class Main extends Object {
    public static void main(String[] args) throws OrderFileNotFoundException, IOException {
        ControllerSimpleFactory.ControllerType type = ControllerSimpleFactory.ControllerType.FIRST;
        AbstractController controller = ControllerSimpleFactory.getController(type);
        controller.justDoIt();
//        Meal meal = new Cake("Tor", "Lime",10);

//        Order order = HardcodeOrderBuilder.createOrder();


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

    }
}

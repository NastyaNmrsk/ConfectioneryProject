package by.itstep.nemarskayaanastasiya.examstage.controller;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.container.Order;
import by.itstep.nemarskayaanastasiya.examstage.util.ByteStreamBuilder;
import by.itstep.nemarskayaanastasiya.examstage.util.CharStreamBuilder;
import by.itstep.nemarskayaanastasiya.examstage.util.HardcodeOrderBuilder;
import by.itstep.nemarskayaanastasiya.examstage.util.RandomOrderBuilder;
import by.itstep.nemarskayaanastasiya.examstage.util.exceptions.OrderFileNotFoundException;
import by.itstep.nemarskayaanastasiya.examstage.util.serialization.OrderSerializator;

import java.io.IOException;

public class SimpleOrderFactory {
    private static SimpleOrderFactory factory;

    private SimpleOrderFactory() {
    }

    public static SimpleOrderFactory getFactory() {
        if (factory == null) {
            factory = new SimpleOrderFactory();
        }
        return factory;
    }

    public Order create(int type) throws OrderFileNotFoundException, IOException {

        Order order = null;
        switch (type) {
            case 0:
                order = HardcodeOrderBuilder.createOrder();
                break;
            case 1:
                order = OrderSerializator.read();
                break;
            case 2:
                order = new ByteStreamBuilder("E:/Nastya/stream.dat").createOrder();
                break;
            case 3:
                order = new CharStreamBuilder("E:/Nastya/stream.dat").createOrder();
                break;
            default:
                order = RandomOrderBuilder.createOrder();
        }
        return order;
    }
}

package by.itstep.nemarskayaanastasiya.examstage.controller;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.container.Order;
import by.itstep.nemarskayaanastasiya.examstage.util.serialization.OrderSerializator;

public class SecondController extends AbstractController{
    @Override
    public Order createOrder() {
        return OrderSerializator.read();
    }
}

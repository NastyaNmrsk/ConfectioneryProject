package by.itstep.nemarskayaanastasiya.examstage.controller;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.container.Order;
import by.itstep.nemarskayaanastasiya.examstage.util.RandomOrderBuilder;

public class ThirdController extends AbstractController{

    @Override
    public Order createOrder() {
        return RandomOrderBuilder.createOrder();
    }
}

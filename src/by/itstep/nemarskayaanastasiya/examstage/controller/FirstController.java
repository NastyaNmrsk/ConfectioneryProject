package by.itstep.nemarskayaanastasiya.examstage.controller;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.container.Order;
import by.itstep.nemarskayaanastasiya.examstage.util.HardcodeOrderBuilder;

public class FirstController extends AbstractController{
    @Override
    public Order createOrder() {
        return HardcodeOrderBuilder.createOrder();
    }
}

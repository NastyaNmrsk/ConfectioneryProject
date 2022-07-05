package by.itstep.nemarskayaanastasiya.examstage.controller;

import java.util.HashMap;

public class ControllerSimpleFactory {
    public enum ControllerType {
        FIRST, SECOND, THIRD
    }

    private static HashMap<ControllerType, AbstractController> map;

    static {
        map = new HashMap<>();
        map.put(ControllerType.FIRST, new FirstController());
        map.put(ControllerType.SECOND, new SecondController());
        map.put(ControllerType.THIRD, new ThirdController());
    }

    public static AbstractController getController(ControllerType key) {
        return map.get(key);
    }

    public static void addController(ControllerType key, AbstractController value) {
        map.put(key, value);
    }
}

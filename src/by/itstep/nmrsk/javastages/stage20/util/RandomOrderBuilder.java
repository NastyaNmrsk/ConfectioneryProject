package by.itstep.nmrsk.javastages.stage20.util;

import by.itstep.nmrsk.javastages.stage20.model.entity.Cake;
import by.itstep.nmrsk.javastages.stage20.model.entity.Drink;
import by.itstep.nmrsk.javastages.stage20.model.entity.PuffPastry;
import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;
import by.itstep.nmrsk.javastages.stage20.model.entity.container.Order;

import java.util.Random;

public class RandomOrderBuilder {
    public static final int DEFAULT_MEAL_COUNT = 5;
    public static final double MAX_CAKE_PRICE = 14;
    public static final double MIN_CAKE_PRICE = 8;

    public static final double MAX_DRINK_PRICE = 88;
    public static final double MIN_DRINK_PRICE = 3;

    public static final double MAX_PUFFPASTRY_PRICE = 10;
    public static final double MIN_PUFFPASTRY_PRICE = 4;


    //есть ещё два параметра

    public enum MealType {
        CAKE, DRINK, PUFFPASTRY
    }

    public static Order createOrder() {
        Order order = new Order();
        for (int i = 0; i < DEFAULT_MEAL_COUNT; i++) {
            Meal meal = createMeal();
            order.add(meal);
        }

        return order;
    }

    private static Meal createMeal() {
        Random random = new Random();
        Meal meal = null;

        MealType type = MealType.values()[random.nextInt(MealType.values().length)];

        switch (type) {
            case CAKE:
                double price = random.nextDouble() * MAX_CAKE_PRICE;
                //есть ещё два параметра

                meal = new Cake(shape, flavor, price);
                break;
            case DRINK:
                double price = random.nextDouble() * MAX_DRINK_PRICE;
                //есть ещё два параметра

                meal = new Drink(type, additive, price);
                break;
            case PUFFPASTRY:
                double price = random.nextDouble() * MAX_PUFFPASTRY_PRICE;
                //есть ещё два параметра

                meal = new PuffPastry(kind, topping, price);
                break;
        }

        return meal;
    }
}

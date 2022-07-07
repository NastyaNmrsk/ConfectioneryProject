package by.itstep.nemarskayaanastasiya.examstage.util;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.MealType;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.container.Order;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.Cake;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.Drink;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.PuffPastry;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;

import java.util.Random;

public class RandomOrderBuilder {
    public static final int DEFAULT_MEAL_COUNT = 6;

    public static final double MAX_CAKE_PRICE = 14;
    public static final double MIN_CAKE_PRICE = 8;
    public static final String[] shapeofcakes = {"Cylinder", "Cone", "Cube", "Ball", "Apple"};
    public static final String[] flavorofcakes = {"Cheesecake", "Honeycake", "Pistachio-Passion fruit"
            , "Mango-Coconut", "Ice cream-Forest berries", "Chocolate-Hazelnuts", "Lychee-Raspberry"};
    public static final double MAX_CAKE_CALORIES = 400;
    public static final double MIN_CAKE_CALORIES = 100;

    public static final double MAX_DRINK_PRICE = 10;
    public static final double MIN_DRINK_PRICE = 3;
    public static final String[] sortofdrinks = {"Tea", "Coffee", "Cocoa"};
    public static final String[] additiveofdrinks = {"Milk", "Marshmallow", "Lemon"
            , "Lime", "Honey", "Cinnamon", "Almond milk"};
    public static final double MAX_DRINK_CALORIES = 150;
    public static final double MIN_DRINK_CALORIES = 50;

    public static final double MAX_PUFFPASTRY_PRICE = 12;
    public static final double MIN_PUFFPASTRY_PRICE = 4;
    public static final String[] kindofpuffpastries = {"Croissant", "Pain-au-chocolat", "Escargot"};
    public static final String[] toppingofpuffpastries = {"Pistachio", "Chocolate-Hazelnuts", "Lemon cream"
            , "Salmon", "Almond"};
    public static final double MAX_PUFFPASTRY_CALORIES = 450;
    public static final double MIN_PUFFPASTRY_CALORIES = 200;


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
            case CAKE -> {
                double price1 = Math.floor(random.nextDouble((MAX_CAKE_PRICE - MIN_CAKE_PRICE) + MIN_CAKE_PRICE));
                String shape = shapeofcakes[random.nextInt(shapeofcakes.length)];
                String flavor = flavorofcakes[random.nextInt(flavorofcakes.length)];
                double calorie1 = Math.floor(random.nextDouble((MAX_CAKE_CALORIES - MIN_CAKE_CALORIES) + MIN_CAKE_CALORIES));
                meal = new Cake(shape, flavor, price1, calorie1);
            }
            case DRINK -> {
                double price2 = Math.floor(random.nextDouble((MAX_DRINK_PRICE - MIN_DRINK_PRICE) + MIN_DRINK_PRICE));
                String sort = sortofdrinks[random.nextInt(sortofdrinks.length)];
                String additive = additiveofdrinks[random.nextInt(additiveofdrinks.length)];
                double calorie2 = Math.floor(random.nextDouble((MAX_DRINK_CALORIES - MIN_DRINK_CALORIES) + MIN_DRINK_CALORIES));
                meal = new Drink(sort, additive, price2, calorie2);
            }
            case PUFFPASTRY -> {
                double price3 = Math.floor(random.nextDouble((MAX_PUFFPASTRY_PRICE - MIN_PUFFPASTRY_PRICE) + MIN_PUFFPASTRY_PRICE));
                String kind = kindofpuffpastries[random.nextInt(kindofpuffpastries.length)];
                String topping = toppingofpuffpastries[random.nextInt(toppingofpuffpastries.length)];
                double calorie3 = Math.floor(random.nextDouble((MAX_PUFFPASTRY_CALORIES - MIN_PUFFPASTRY_CALORIES) + MIN_PUFFPASTRY_CALORIES));
                meal = new PuffPastry(kind, topping, price3, calorie3);
            }
        }

        return meal;
    }
}

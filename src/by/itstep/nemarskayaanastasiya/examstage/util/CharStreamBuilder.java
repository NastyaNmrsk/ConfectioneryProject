package by.itstep.nemarskayaanastasiya.examstage.util;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.container.Order;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.Cake;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.Drink;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.MealType;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.PuffPastry;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;
import by.itstep.nemarskayaanastasiya.examstage.util.exceptions.OrderFileNotFoundException;

import java.io.*;

public class CharStreamBuilder {
    private String fileName;

    public CharStreamBuilder(String fileName) {
        this.fileName = fileName;
    }

    public void saveOrder(Order order) throws OrderFileNotFoundException {
        if (fileName == null) {
            throw new OrderFileNotFoundException();
        }
        try (Writer stream = new BufferedWriter(new FileWriter(fileName))) {


            for (Meal meal : order) {
                if (meal instanceof Cake) {
                    Cake cake = (Cake) meal;
                    stream.write(MealType.CAKE.name() + " ");
                    stream.write(cake.getPrice() + " ");
                    stream.write(cake.getShape() + " ");
                    stream.write(cake.getFlavor() + "\n");
                } else if (meal instanceof Drink) {
                    Drink drink = (Drink) meal;
                    stream.write(MealType.DRINK.name() + " ");
                    stream.write(drink.getPrice() + " ");
                    stream.write(drink.getSort() + " ");
                    stream.write(drink.getAdditive() + "\n");
                } else if (meal instanceof PuffPastry) {
                    PuffPastry puffPastry = (PuffPastry) meal;
                    stream.write(MealType.PUFFPASTRY.name() + " ");
                    stream.write(puffPastry.getPrice() + " ");
                    stream.write(puffPastry.getKind() + " ");
                    stream.write(puffPastry.getTopping() + "\n");
                }
                stream.flush();
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public Order createOrder() throws OrderFileNotFoundException {
        if (fileName == null) {
            throw new OrderFileNotFoundException();
        }
        Order order = new Order();
        try (BufferedReader stream = new BufferedReader(new FileReader(fileName))) {
            Meal meal = null;
            String buf;
            while ((buf = stream.readLine()) != null) {

                String[] strings = buf.split(" ");
                MealType type = MealType.valueOf(strings[0]);
                switch (type) {
                    case CAKE: {
                        double price = Double.parseDouble(strings[1]);
                        String shape = strings[2];
                        String flavor = strings[3];
                        meal = new Cake(flavor, shape, price);
                    }
                    break;
                    case DRINK: {
                        double price = Double.parseDouble(strings[1]);
                        String sort = strings[2];
                        String additive = strings[3];
                        meal = new Drink(sort, additive, price);
                    }
                    break;
                    case PUFFPASTRY: {
                        double price = Double.parseDouble(strings[1]);
                        String kind = strings[2];
                        String topping = strings[3];
                        meal = new PuffPastry(kind, topping, price);
                    }
                    break;
                }
                order.add(meal);
            }

        } catch (IOException exception) {
            System.err.println(exception);
        }
        return order;
    }
}

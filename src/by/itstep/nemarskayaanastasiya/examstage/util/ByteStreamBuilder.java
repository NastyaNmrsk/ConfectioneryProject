package by.itstep.nemarskayaanastasiya.examstage.util;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.MealType;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.container.Order;
import by.itstep.nemarskayaanastasiya.examstage.util.exceptions.OrderFileNotFoundException;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.Cake;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.Drink;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.PuffPastry;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;

import java.io.*;

public class ByteStreamBuilder {
    private String fileName;

    public ByteStreamBuilder(String name) {
        this.fileName = name;
    }

    public void saveOrder(Order order) throws OrderFileNotFoundException {
        if (fileName == null) {
            throw new OrderFileNotFoundException();
        }
        DataOutputStream stream = null;
        try {
            stream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
            for (Meal meal : order) {
                if (meal instanceof Cake) {
                    Cake cake = (Cake) meal;
                    stream.writeInt(MealType.CAKE.ordinal());
                    stream.writeDouble(cake.getPrice());
                    stream.writeUTF(cake.getShape());
                    stream.writeUTF(cake.getFlavor());
                } else if (meal instanceof Drink) {
                    Drink drink = (Drink) meal;
                    stream.writeInt(MealType.DRINK.ordinal());
                    stream.writeDouble(drink.getPrice());
                    stream.writeUTF(drink.getSort());
                    stream.writeUTF(drink.getAdditive());
                } else if (meal instanceof PuffPastry) {
                    PuffPastry puffpastry = (PuffPastry) meal;
                    stream.writeInt(MealType.PUFFPASTRY.ordinal());
                    stream.writeDouble(puffpastry.getPrice());
                    stream.writeUTF(puffpastry.getKind());
                    stream.writeUTF(puffpastry.getTopping());
                }
            }
            stream.flush();
        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            if (stream == null) {
                try {
                    stream.close();
                } catch (IOException exception) {
                    System.err.println(exception);
                }
            }
        }
    }


    public Order createOrder() throws OrderFileNotFoundException, IOException {
        if (fileName == null) {
            throw new OrderFileNotFoundException();
        }
        Order order = new Order();
        DataInputStream stream = null;
        try {
            stream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
            while (stream.available() != 0) {
                Meal meal = null;
                int index = stream.readInt();
                MealType type = MealType.values()[index];
                switch (type) {
                    case CAKE: {
                        double price = stream.readDouble();
                        String shape = stream.readUTF();
                        String flavor = stream.readUTF();
                        meal = new Cake(shape, flavor, price);
                    }
                    break;
                    case DRINK: {
                        double price = stream.readDouble();
                        String sort = stream.readUTF();
                        String additive = stream.readUTF();
                        meal = new Drink(sort, additive, price);
                    }
                    break;
                    case PUFFPASTRY: {
                        double price = stream.readDouble();
                        String kind = stream.readUTF();
                        String topping = stream.readUTF();
                        meal = new PuffPastry(kind, topping, price);
                    }
                    break;
                }
                order.add(meal);
            }
        } catch (EOFException exception) {
//            System.err.println(exception);
        } finally {
            if (stream == null) {
                try {
                    stream.close();
                } catch (IOException exception) {
                    System.err.println(exception);
                }
            }
        }

        return order;
    }
}

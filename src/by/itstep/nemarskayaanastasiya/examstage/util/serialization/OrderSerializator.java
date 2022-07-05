package by.itstep.nemarskayaanastasiya.examstage.util.serialization;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;
import by.itstep.nemarskayaanastasiya.examstage.model.entity.container.Order;

import java.io.*;

public class OrderSerializator {
    private static String fileName;

    static {
        fileName = "E:/Nastya/meal.dat";
    }

    public static void write(Order order) {
        try (ObjectOutputStream stream
                     = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            stream.writeObject(order);
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public static Order read() {
        Order order = null;
        try (ObjectInputStream stream
                     = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
            order = (Order) stream.readObject();
        } catch (IOException | ClassNotFoundException exception) {
            System.err.println(exception);
        }
        return order;
    }
}

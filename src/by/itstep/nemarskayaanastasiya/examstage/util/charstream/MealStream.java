package by.itstep.nemarskayaanastasiya.examstage.util.charstream;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.Cake;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MealStream {
    public static void writeCakes(Cake[] cakes, String fileName) {
        Writer writer = null;


        try {
            writer = new BufferedWriter(new FileWriter(fileName));

            for (Cake cake : cakes) {
                writer.write(cake.getPrice() + " ");
                writer.write(cake.getFlavor() + " ");
                writer.write(cake.getShape() + "\n");
            }

            writer.flush();
        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException exception) {
                System.err.println(exception);
            }
        }
    }

    public static List<Cake> readCakes(String fileName) {
        List<Cake> list = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));


            String buf = reader.readLine();

            int count = 0;


            while (buf != null) {

                count++;
                {
                    String[] parameters = buf.split(" ");
                    Cake cake = new Cake();
                    double price = Double.parseDouble(parameters[0]);
                    String flavor = parameters[1];
                    String shape = parameters[2];
                    list.add(cake);
                    buf = reader.readLine();
                }

            }

            System.out.println("count = " + count);
        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                System.err.println(exception);
            }
        }

        return list;
    }
}

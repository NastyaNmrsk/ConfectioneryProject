package by.itstep.nemarskayaanastasiya.examstage.model.entity;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;
import by.itstep.nemarskayaanastasiya.examstage.model.exception.MealPriceWrongException;

import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

public class Cake extends Meal implements Serializable {
    private String shape;
    private String flavor;
    private static final long serialVersionUID = 1L;

    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.defaultWriteObject();
        out.writeDouble(getPrice());
    }

    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        try{setPrice(in.readDouble());
    }catch (MealPriceWrongException exception){
            System.err.println(exception);
        }
    }

    public Cake() {

    }

    public Cake(String shape, String flavor, double price, double calorie) {
        super(price, calorie);
        this.shape = shape;
        this.flavor = flavor;

    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cake)) return false;
        if (!super.equals(o)) return false;
        Cake cake = (Cake) o;
        return Objects.equals(shape, cake.shape) && Objects.equals(flavor, cake.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shape, flavor);
    }

    @Override
    public String toString() {
        return "Cake (" +
                "shape = " + shape + ", flavor = " + flavor +
                ", " + super.toString() +
                ")";
    }
}

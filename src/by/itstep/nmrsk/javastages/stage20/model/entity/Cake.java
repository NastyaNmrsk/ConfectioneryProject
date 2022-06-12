package by.itstep.nmrsk.javastages.stage20.model.entity;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;

import java.util.Objects;

public class Cake extends Meal {
    private String shape;
    private String flavor;

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

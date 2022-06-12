package by.itstep.nmrsk.javastages.stage20.model.entity;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;

import java.util.Objects;

public class Drink extends Meal {
    private String type;
    private String additive;

    public Drink() {

    }

    public Drink(String type, String additive, double price, double calorie) {
        super(price, calorie);
        this.type = type;
        this.additive = additive;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdditive() {
        return additive;
    }

    public void setAdditive(String additive) {
        this.additive = additive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drink)) return false;
        if (!super.equals(o)) return false;
        Drink drink = (Drink) o;
        return Objects.equals(type, drink.type) && Objects.equals(additive, drink.additive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, additive);
    }

    @Override
    public String toString() {
        return "Drink (" +
                "type = " + type + ", additive = " + additive +
                ", " + super.toString() +
                ")";
    }

}

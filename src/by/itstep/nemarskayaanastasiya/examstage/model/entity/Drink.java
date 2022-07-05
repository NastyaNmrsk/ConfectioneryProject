package by.itstep.nemarskayaanastasiya.examstage.model.entity;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;

import java.util.Objects;

public class Drink extends Meal {
    private String sort;
    private String additive;

    public Drink() {

    }

    public Drink(String sort, String additive, double price/*, double calorie*/) {
        super(price/*, calorie*/);
        this.sort = sort;
        this.additive = additive;

    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
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
        return Objects.equals(sort, drink.sort) && Objects.equals(additive, drink.additive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sort, additive);
    }

    @Override
    public String toString() {
        return "Drink (" +
                "sort = " + sort + ", additive = " + additive +
                ", " + super.toString() +
                ")";
    }

}

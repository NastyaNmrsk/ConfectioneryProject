package by.itstep.nmrsk.javastages.stage20.model.entity.abstracts;

import by.itstep.nmrsk.javastages.stage20.model.exception.MealPriceWrongException;

import java.util.Objects;

public class Meal implements Comparable<Meal> {
    private double price;
    private double calorie;

    public Meal() {

    }

    public Meal(double price, double calorie) {
        this.price = price;
        this.calorie = calorie;
    }
    public Meal(Meal meal) {
        price = meal.price;
        calorie = meal.calorie;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws MealPriceWrongException{
        if (price > 0) {
            this.price = price;
        }else {
            throw new MealPriceWrongException();
        }
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        if (calorie > 0) {
            this.calorie = calorie;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meal)) return false;
        Meal meal = (Meal) o;
        return Double.compare(meal.price, price) == 0 && Double.compare(meal.calorie, calorie) == 0;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode");
        return Objects.hash(price);
    }


    @Override
    public String toString() {
        return "price = " + price + " calorie = " + calorie;
    }

    @Override
    public int compareTo(Meal o) {
//        return Double.compare(o.price, price);
        return Double.compare(price, o.price);
//        if (price > o.price) {
//            return +1;
//        } else if (price < o.price) {
//            return -1;
//        } else {
//            return 0;
//        }
    }
}

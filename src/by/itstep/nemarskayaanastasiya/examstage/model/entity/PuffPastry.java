package by.itstep.nemarskayaanastasiya.examstage.model.entity;

import by.itstep.nemarskayaanastasiya.examstage.model.entity.abstracts.Meal;

import java.util.Objects;

public class PuffPastry extends Meal {
    private String kind;
    private String topping;

    public PuffPastry() {

    }

    public PuffPastry(String kind, String topping, double price, double calorie) {
        super(price, calorie);
        this.kind = kind;
        this.topping = topping;

    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drink)) return false;
        if (!super.equals(o)) return false;
        PuffPastry puffpastry = (PuffPastry) o;
        return Objects.equals(kind, puffpastry.kind) && Objects.equals(topping, puffpastry.topping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kind, topping);
    }

    @Override
    public String toString() {
        return "Puff pastry (" +
                "kind = " + kind + ", topping = " + topping +
                ", " + super.toString() +
                ")";
    }

}

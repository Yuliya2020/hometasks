package flowersAndAccessories;

import java.util.Objects;

public class Flower {

    int length;
    String color;
    double price;
    String freshness;

    public Flower(int length, String color, double price, String freshness) {
        super();
        this.length = length;
        this.color = color;
        this.price = price;
        this.freshness = freshness;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFreshness() {
        return freshness;
    }

    public void setFreshness(String freshness) {
        this.freshness = freshness;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "length=" + length +
                "color=" + color +
                "price=" + price +
                "freshness=" + freshness +
                '}';
    }

    public Flower() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return length == flower.length &&
                Double.compare(flower.price, price) == 0 &&
                Objects.equals(color, flower.color) &&
                Objects.equals(freshness, flower.freshness);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, color, price, freshness);
    }


    protected void compareTo(Flower flower) {
    }}



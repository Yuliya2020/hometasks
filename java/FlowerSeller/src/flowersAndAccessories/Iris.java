package flowersAndAccessories;

import java.util.Objects;

public class Iris extends Flower{
    int length;
    String color;
    double price =1.5;
    String freshness;

    public Iris( int length, String color, double price, String freshness ) {
        this.length = length;
        this.color = color;
        this.price = price;
        this.freshness = freshness;
    }

    public int getLength() {
        return length;
    }

    public void setLength( int length ) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor( String color ) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice( float price ) {
        this.price = price;
    }

    public String getFreshness() {
        return freshness;
    }

    public void setFreshness( String freshness ) {
        this.freshness = freshness;
    }

    @Override
    public String toString() {
        return "Iris{" +
                "length=" + length +
                ", color=" + color +
                ", price=" + price +
                ", freshness=" + freshness +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iris iris = (Iris) o;
        return length == iris.length &&
                freshness.equals(iris.freshness);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, freshness);
    }


}

package flowersAndAccessories;

import java.util.LinkedList;


    public class Packaging {
        String color;
        double price;

        public Packaging(String color, double price) {
            this.color = color;
            this.price = price;
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

        @Override
        public String toString() {
            return "Packaging{" +
                    "color=" + color +
                    ", price=" + price +
                    '}';
        }

    }

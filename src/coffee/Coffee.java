package coffee;

import java.util.Objects;

public class Coffee implements Comparable<Coffee> {
    private String type;
    private Double price;

    public Coffee(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return Double.compare(coffee.price, price) == 0 &&
                Objects.equals(type, coffee.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }

    @Override
    public int compareTo(Coffee coffee) {
        return price.compareTo(coffee.getPrice());
    }


    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return type + " " + price + "\n";
    }
}

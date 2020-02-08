package glasses;

import java.util.Objects;

public class Glasses implements Comparable<Glasses> {
    private String colour;
    private Double price;

    public Glasses(String colour, double price) {
        this.colour = colour;
        this.price = price;
    }


    public Double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Glasses glasses = (Glasses) o;
        return Objects.equals(colour, glasses.colour) &&
                Objects.equals(price, glasses.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, price);
    }

    @Override
    public int compareTo(Glasses glasses) {
        return price.compareTo(glasses.getPrice());
    }

    @Override
    public String toString() {
        return colour + " " + price + "\n";
    }
}

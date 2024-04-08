package entities;

import java.util.Objects;

public class Product3 {

    private String name;
    private Double price;

    public Product3(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product3 product3)) return false;
        return Objects.equals(name, product3.name) && Objects.equals(price, product3.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

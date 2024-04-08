package application;

import entities.Product3;

import java.util.HashMap;
import java.util.Map;

public class TesteMap2 {
    public static void main(String[] args) {

        Map<Product3, Double> stock = new HashMap<>();

        Product3 p1 = new Product3("Tv", 900.00);
        Product3 p2 = new Product3("Notebook", 1200.00);
        Product3 p3 = new Product3("Tablet", 400.00);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product3 ps = new Product3("Tv", 9000.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps)) ;
    }
}

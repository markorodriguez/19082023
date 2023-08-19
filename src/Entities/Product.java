package Entities;

public class Product {
    private String name;
    private double price;
    private int stock;
    private boolean isAvailableHere;

    // Constructor
    public Product(String name, double price, int stock, boolean isAvailableHere) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.isAvailableHere = isAvailableHere;
    }

    // Getters y Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isAvailableHere() {
        return isAvailableHere;
    }

    public void setAvailableHere(boolean availableHere) {
        isAvailableHere = availableHere;
    }
}

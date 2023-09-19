package util;

public class Product {
    
    private String name;
    private double price;
    private int quantity;
    
    //Grerar costrução
    public Product() {
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    //get e set
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
    public int getQuantity() {
        return quantity;
    }
    
    
    public double totalValueInstock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " unidades, Total: $ "
        + String.format("%.2f", totalValueInstock());
    }
}

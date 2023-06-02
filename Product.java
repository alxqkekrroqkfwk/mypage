package FEE;

public class Product extends Menu {
    double price;

    public Product(String name, double price, String explain)   {
        super(name, explain);
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " | " + price + " | " + explain;
    }

    public Product() {

    }

    public double getPrice(){ return this.price;}



}

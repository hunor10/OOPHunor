package oop.labor11;

public class Product implements Comparable<Product>{
    private final int id;
    private String name;
    private int amount;
    private int price;

    public Product(int id, String name, int amount, int price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }
    public void increaseAmount(int amount)
    {
        this.amount+=amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
    public int compareTo(Product o)
    {
        //return Integer.compare(this.id,o.id);
        return this.id-o.id;
    }
}

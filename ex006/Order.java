package ex006;

public class Order {
    
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    private int orderid;
    private static int counter;
    private double price;
    public void setPrice(double price) {
        this.price = price;
    }

    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    {
        orderid = ++counter;
    }

    public Order()
    {
        
    }

    public Order(String name,int price,int count)
    {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }
    public int getOrderid() {
        return orderid;
    }
    public double getPrice() {
        return price;
    }
    public int getCount() {
        return count;
    }

    public String toString()
    {
        return String.format("Заказ номер:%d",orderid);
    }

}

package ex006;

import java.util.Scanner;



public class ScanNewOrder{
    
    private Scanner scanner = new Scanner(System.in);
    private Order order;
    
    public ScanNewOrder()
    {
        order = new Order();
    }


    public void ScanOrder()
    {
        System.out.println("Ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Цена:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Колл-во:");
        int count = Integer.parseInt(scanner.nextLine());


        order.setCount(count);
        order.setName(name);
        order.setPrice(price);
    }
    

    public Order getOrder() {
        return order;
    }
}

package ex006;

public class Program
{
    public static void main(String[] args) {
        
        ScanNewOrder scanNewOrder = new ScanNewOrder();
        scanNewOrder.ScanOrder();
        Order order = scanNewOrder.getOrder();
        SaveOrder saveOrder = new SaveOrder(order);
        saveOrder.saveToJson();
    }
}

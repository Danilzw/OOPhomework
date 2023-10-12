package ex006;

import java.io.FileWriter;
import java.io.IOException;

public class SaveOrder extends ScanNewOrder{
    
    private Order order;

    public SaveOrder(Order order)
    {
        this.order = order;
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getName() + "\",\n");
            writer.write("\"qnt\":"+order.getCount()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}

package org.abbtech.Lessons.ExamModule1;

import java.io.Serializable;
import java.math.BigDecimal;

public class InventoryItem implements Serializable {
    private static int Id;
    private String name;
    private int quantity;
    private int price;

    public InventoryItem( String name, int quantity, int price) {
        Id++;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


   public int getId(){
       return Id;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

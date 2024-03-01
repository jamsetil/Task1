package org.abbtech.Lessons.ExamModule1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InventoryItem inventoryItem = new InventoryItem("iphone",2,200);
        InventoryManager inventoryManager = new InventoryManager();
        List<InventoryItem> inventoryItemList = new ArrayList<>();
        inventoryItemList.add(inventoryItem);

        try {
            inventoryManager.addInventoryItem(inventoryItem);
            inventoryManager.searchInventoryItemById(1);
            inventoryManager.writeInventoryItems(inventoryItemList);
           List<InventoryItem> inventoryItemList1= inventoryManager.readInventoryItems();


            for (InventoryItem i:inventoryItemList1
                 ) {
                System.out.println(i);
            }
        }catch (Exception ex){
            System.out.println("cannot find the item");
        }
    }
}

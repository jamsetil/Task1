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
            inventoryManager.updateInventoryItemById(3,"Asd",12,12);
           List<InventoryItem> inventoryItemList1= inventoryManager.readInventoryItems();


            for (InventoryItem i:inventoryItemList1
                 ) {
                System.out.println(i);
            }
        }catch (InvalidDataException e){
            System.out.println(e.getMessage());
        }catch (ItemNotFoundException e){
            System.out.println(e.getMessage());
        }

        catch (Exception ex){
            System.out.println("cannot find the item");
        }
    }
}

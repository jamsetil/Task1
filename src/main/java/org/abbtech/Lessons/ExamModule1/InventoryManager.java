package org.abbtech.Lessons.ExamModule1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InventoryManager {
    List<InventoryItem> inventoryItems=new ArrayList<>();

    private String FILE_NAME = "itemm.ser";
    void writeInventoryItems(List<InventoryItem> items){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            objectOutputStream.writeObject(items);
            System.out.println("Inventory items written to file successfully.");
        } catch (IOException e) {
            System.out.println("something went wrong");
        }
    }
    List<InventoryItem> readInventoryItems() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            List<InventoryItem>inventoryItemList= (List<InventoryItem>) objectInputStream.readObject();
            return inventoryItemList;
        } catch (IOException e) {
            System.out.println("something went wrong");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    };
    public void addInventoryItem(InventoryItem item) throws InvalidDataException {
        if (item==null)
            throw new InvalidDataException();
        inventoryItems.add(item);
    }
    public void searchInventoryItemById(int id) throws ItemNotFoundException {

       Optional<InventoryItem> optionalInventoryItem= inventoryItems
               .stream()
               .filter(inventoryItem -> inventoryItem.getId()==id)
               .findFirst();
        InventoryItem inventoryItem = optionalInventoryItem.orElseThrow(()->new ItemNotFoundException());
        System.out.println("Item found with id: "+optionalInventoryItem.get().getId()+" item name "+optionalInventoryItem.get().getName());

    }
    public void updateInventoryItemById(int id,String name,int price,int quantity) throws ItemNotFoundException {

        for (InventoryItem i: inventoryItems
             ) {
            if (i.getId()==id){
                i.setName(name);
                i.setPrice(price);
                i.setQuantity(quantity);
            }else throw new ItemNotFoundException();
        }
//       Optional<InventoryItem> optionalInventoryItem= inventoryItems
//               .stream()
//               .filter(inventoryItem -> inventoryItem.getId()==id)
//               .findFirst();
//        InventoryItem inventoryItem = optionalInventoryItem.orElseThrow(()->new ItemNotFoundException());
//        InventoryItem found = optionalInventoryItem.get();
//        found.setQuantity(quantity);
//        found.setPrice(price);
//        found.setName(name);
        System.out.println("Item updated successfully");
    }
    public void deleteInventoryItemById(int id) throws InvalidDataException {
        if (!inventoryItems.stream().filter(inventoryItem -> inventoryItem.getId()==id).findAny().isPresent()){
            throw new InvalidDataException();
        }
     inventoryItems.removeIf(inventoryItem -> inventoryItem.getId()==id);
        System.out.println("item deleted succesfully");

    }
}

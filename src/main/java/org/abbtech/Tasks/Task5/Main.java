package org.abbtech.Tasks.Task5;

public class Main {
    public static void main(String[] args) {
    GenericStorage<Person> genericStorage = new GenericStorage<>();

        //Needed methods
        genericStorage.addItem("Ilyas",24,false);
        genericStorage.addItem("Faiq",26,true);
        genericStorage.addItem("Rasim",22,true);
        genericStorage.addItem("Rustem",12,true);
        genericStorage.addItem("Adem",11,true);
        genericStorage.addItem("Anar",24,false);
        genericStorage.displayAllItems();
        genericStorage.removeItem(3);
        genericStorage.searchItem("Rasim");

        //additional methods
        genericStorage.displayRolesOfAllItems();
        genericStorage.FindItemByIdAndUpdate(7,"Samir",22);


    }
}

package org.abbtech.Tasks.Task5;

public class Main {
    public static void main(String[] args) {
    GenericStorage<Person> genericStorage = new GenericStorage<>();

    Teacher teacher = new Teacher("asim",22);
    Student student = new Student("fikret",32);
    genericStorage.addItem(teacher);
    genericStorage.addItem(student);
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
        genericStorage.displayAllItems();
//
//        //additional methods
//        genericStorage.displayRolesOfAllItems();
//        genericStorage.FindItemByIdAndUpdate(7,"Samir",22);


    }
}

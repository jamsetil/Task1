package org.abbtech.Tasks.Task5;

 class Person {
    private static int counter = 0;
    private int Id;

     public static int getCounter() {
         return counter;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public int getId() {
         return Id;
     }

     public String getName() {
         return name;
     }

     public int getAge() {
         return age;
     }

     private String name;
    private int age;
     Person( String name , int age){
         this.Id = ++counter;
         this.name = name;
         this.age = age;

     }

}

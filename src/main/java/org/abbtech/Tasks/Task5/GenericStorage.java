package org.abbtech.Tasks.Task5;



public class GenericStorage<T extends Person> {

    private int arrayIndex;

    private T[] item;

    public GenericStorage() {
        item = (T[]) new Person[5];
    }

    void addItem(String name,int age,boolean isStudent){
        //if the last index of elemnt is not null it means array is full so we have to resize array
        if (item[item.length-1]!=null){

           T[] newItem = (T[]) new Person[item.length*2];
            System.arraycopy(item,0,newItem,0,item.length);
            item=newItem;

        }
        if (isStudent){
            Student student = new Student(name,age);
            item[arrayIndex++]=(T) student;
        }else {
            Teacher teacher = new Teacher(name,age);
            item[arrayIndex++]=(T) teacher;
        }

        System.out.println("Person named "+name+" added to the system");
    };


    void removeItem(int id){
       for (int i = 0;i<item.length;i++){
           if (item[i]==null){
               System.out.println("cannot find the user ");
               break;
           }
           if (item[i].getId()==id){
               System.out.println("User: " +item[i].getName()+"  with id "+item[i].getId()+" is deleted");
               //asagida null obyektler massivin sonuna atilir
               item[i]=item[i+1];
               for (int j =i+1;j< item.length;j++){
                   if (item[j]==item[item.length-1])
                    item[j]=null;
                   else item[j]=item[j+1];
               }

               break;
           }

       }

    };
    void searchItem(String name){
        for (int i =0;i< item.length;i++){
            if (item[i].getName().equals(name)){
                System.out.println("Person found! "+ "\nId: "+ item[i].getId()+"\nName: "+item[i].getName()+"\nage: "+
                        item[i].getAge()+"\nrole:"+(item[i] instanceof Teacher?" Teacher":" Student"));
                break;
            }
            if (item[i+1]==null){
                System.out.println("Cannot find person with the name "+name);
                break;
            }
        }
    };


    void displayAllItems(){
        for (int i =0;i< item.length;i++){
            if (item[0]==null){
                System.out.println("There are no users in system");
                break;
            }
            System.out.println("Id: "+item[i].getId()+"\n"+"Name: "+item[i].getName()+"\n"+"age: "+item[i].getAge());
            System.out.println();
           if (item[i+1]==null){
               break;
           }


        }

    }

    void displayRolesOfAllItems() {
        if (item[0] == null) {
            System.out.println("No users on list");
        } else {
            for (int i = 0; i < item.length; i++) {
                if (item[i] instanceof Teacher) {
                    System.out.println("Teacher: " + item[i].getName());
                } else if (item[i] instanceof Student)System.out.println("Student: " + item[i].getName());
                else break;
            }
        }
    }

    void FindItemByIdAndUpdate(int id,String name,int age){
        for (int i = 0;i<item.length;i++){
            if (item[i].getId()==id){
                item[i].setName(name);
                item[i].setAge(age);
                break;
            }
            if (item[i+1]==null){
                System.out.println("No user matches with id"+id);
                break;
            }
        }
    }
}

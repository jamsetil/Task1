package org.abbtech.Lesson4;

public class Lesson4 {

    public static void main(String[] args) {
        Car car = new Car("Bmw",2012);
        car.startEngine();

        Person person = new Person("Ilyas",24);
        person.print();

        System.out.println(isValid("()[]{}"));
    }


    static public boolean isValid(String s) {
        char currentChar=' ';
        char secondChar= ' ';


        for(int i =0;i<=s.length()/2;i=i+2){
            currentChar = s.charAt(i);
            secondChar =s.charAt(i+1);
            if (currentChar=='('){
                if(currentChar!=--secondChar){
                    return false;
                }
            }else
                if (currentChar!=secondChar-2){
                return false;
            }



        }
        return true;

    }

}

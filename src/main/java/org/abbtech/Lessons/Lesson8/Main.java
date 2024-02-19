package org.abbtech.Lessons.Lesson8;

public class Main {

    public static void main(String[] args) {
        FuncInter<String,Integer> funcİnter = (a, b)->{
            System.out.println(Integer.parseInt(a)+b);
        };

        funcİnter.method("5",5);

    }
}

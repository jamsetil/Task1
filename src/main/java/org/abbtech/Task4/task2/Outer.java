package org.abbtech.Task4.task2;

import java.io.InputStream;

public class Outer {


    public static void main(String[] args) {
        Inner inner = new Inner();
        Inner inner1 = new Inner();
        System.out.println(Inner.count);
        //veya
       inner1.getCount();
    }


    private static class Inner {
        private static int count;
        public Inner(){
            count++;
        }
        public void getCount(){
            System.out.println(this.count);
        }


    }
}

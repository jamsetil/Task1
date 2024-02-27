package org.abbtech.Lessons.Lesson9;

public class Main {
    public static void main(String[] args) {
        int[] arrList=new int[10];

        try{
            for (int i =0; i<arrList.length+5;i++){
                System.out.println(arrList[i]);
            }

        }catch (ArrayIndexOutOfBoundsException customException){
            throw new CustomException("something went wrong");
        }finally {
            System.out.println(arrList.length);
        }
    }
}

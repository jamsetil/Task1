package org.abbtech.Lessons.Lesson9;

public class TestCustom {
    static void validate(int [] arr){
        if (arr.length>10){
            throw new CustomException("size is bigger");
        }else System.out.println();
    }
}

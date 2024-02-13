package org.abbtech.Tasks.Task3.task5;



class DayChecker{
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.SATURDAY;
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.isWeekend(dayOfWeek));
    }
}



public enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    boolean isWeekend(DayOfWeek dayOfWeek){
        switch (dayOfWeek){
            case SATURDAY ->{
                return true;
            }
            case SUNDAY -> {
            return true;
            }
            default -> {
                return false;
            }
        }
    };
}

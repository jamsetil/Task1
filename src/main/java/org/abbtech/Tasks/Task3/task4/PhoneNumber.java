package org.abbtech.Tasks.Task3.task4;


import java.util.Scanner;

class PhoneNumberFormatChecker{

    // nomre formata uygun daxil edilmelidi (boşluqlar və defislərdə nəzərə alınmalıdır!! +994 55 555-55-55
    public static void main(String[] args) {
        System.out.println("Please enter phone number for checking.(Example: +994 (50/51/55) 000-00-00");
        Scanner scanner = new Scanner(System.in);
        String numb = scanner.nextLine();
        PhoneNumber phoneNumber = new PhoneNumber(numb);
        //phoneNumber.setPhoneNumber("+994 51 580-80-99");
    }
}

public class PhoneNumber {
    private String phoneNumber;
    private final String regex ="\\+994\\s(?:50|51|55)\\s[0-9]{3}-[0-9]{2}-[0-9]{2}";
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches(regex)){
            this.phoneNumber = phoneNumber;
            System.out.println("Phone number is valid");
        }else System.out.println("wrong phone number format. It should be in this format +994 (50/51/55) xxx-xx-xx");

    }

    public PhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);

        //setter check edib özü initialize eləməlidir əslində aşağıdakı optionaldır
        this.phoneNumber = phoneNumber;
    }
}

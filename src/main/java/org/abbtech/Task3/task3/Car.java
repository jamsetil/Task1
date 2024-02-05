package org.abbtech.Task3.task3;



class CarInfo {


    public static void main(String[] args) {
        Car car = new Car("Wolksvagen","Touareg",2008,"95");
        System.out.println("Car details:");
        System.out.println("Brand: " + car.brand);
        System.out.println("Model: " + car.model);
        System.out.println("Year of Production: " + car.yearOfProduction);
        System.out.println("Fuel Type: " + car.fuelType);

        car.speed(100);
       car.slow(20);
       car.checkSpeed();
       car.stop();
    }
}






public class Car {
    String brand;
    String model;
    int yearOfProduction;
    String fuelType;
    double speed;

    public Car(String brand, String model, int yearOfProduction, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.fuelType = fuelType;
        this.speed = 0;
    }

    void speed(double amountOfSpeedIncrease){
        this.speed+=amountOfSpeedIncrease;
        System.out.println(this.brand+ " "+this.model+" is speed up to "+this.speed);
    }

    void slow(double amountOfSpeedReduction){
       if (this.speed>0){
           this.speed-=amountOfSpeedReduction;
           System.out.println("Car's speed has slowed. \nYour speed is now "+this.speed);
       }else System.out.println("Cant slow the car if its not moving");
    }

    void stop(){
        this.speed=0;
        System.out.println("Car "+this.brand+" "+this.model+" has stopped");
    }

    void checkSpeed(){
        if (this.speed>=100){
            System.out.println("Your speed is "+this.speed+" slow down you are going too fast!");
        }
        System.out.println("Your "+this.brand+" "+this.model+" speed is "+this.speed+" okay");
    }
}

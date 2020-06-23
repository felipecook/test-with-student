package com.felipecook;

public class PracticeProblems {


  public static void main(String[] args) {

    Car felipesCar = new Car();

    System.out.println("The current make of the car is: " + felipesCar.getMake());

    felipesCar.setMake("Toyota");

    System.out.println("Now the make of the car is: " + felipesCar.getMake());

    felipesCar.drive();

    Ford anasCar = new Ford();

    System.out.println("The make of this car is currently: " + anasCar.getMake());

    anasCar.drive();

  }



}

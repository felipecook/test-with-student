package com.felipecook;

/*

 */

public class Car {

  private String make = "Unknown";
  private String model = "Unknown";
  private int numberOfDoors = 4;

  public void drive(){
    System.out.println("This car is driving!");
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }


}

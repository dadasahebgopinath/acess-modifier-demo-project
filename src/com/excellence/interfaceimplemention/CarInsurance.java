package com.excellence.interfaceimplemention;

import java.util.*;

public class CarInsurance {

  private int price;
  private int age;
  private int capacity;
  private String location;
  private int idv;
  private int odp;
  private int ncb;

  public CarInsurance(int price, int age, int capacity, String location) {
    this.price = price;
    this.age = age;
    this.capacity = capacity;
    this.location = location;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public int getIdv() {
    return idv;
  }

  public void setIdv(int idv) {
    this.idv = idv;
  }

  public int getOdp() {
    return odp;
  }

  public void setOdp(int odp) {
    this.odp = odp;
  }

  public int getNcb() {
    return ncb;
  }

  public void setNcb(int ncb) {
    this.ncb = ncb;
  }

  public int calculateThirdPartyPremium() {
    int thirdPartyPremium = 0;
    if (capacity < 1000) {
      thirdPartyPremium = 2182;
    } else if (capacity >= 1000 && capacity <= 1500) {
      thirdPartyPremium = 3383;
    } else if (capacity > 1500) {
      thirdPartyPremium = 7890;
    }
    return thirdPartyPremium;
  }

  public void calculateComprehensivePremium() {
    double dc = 0.0;
    if (age == 1) {
      dc = 0.20;
    } else if (age == 2) {
      dc = 0.30;
    } else if (age == 3) {
      dc = 0.40;
    } else if (age == 4) {
      dc = 0.50;
    } else {
      dc = 0.0;
    }
    double idv = price - (dc * price);
    setIdv((int) idv);
    double odpPercent = 0.0;
    if (age <= 3) {
      odpPercent = 0.03127;
    } else {
      odpPercent = 0.03283;
    }
    double odp = odpPercent * idv;
    setOdp((int) odp);
    double ncb = 0.25 * odp;
    setNcb((int) ncb);

  }

  public int calculateComprehensivePremiumTotal() {
    int pac = 100;
    return pac + getNcb();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int price = scanner.nextInt();
    int age = scanner.nextInt();
    int capacity = scanner.nextInt();
    String location = scanner.next();
    CarInsurance carInsurance = new CarInsurance(price, age, capacity, location);
    System.out.println(
        carInsurance.getPrice() + " " + carInsurance.getAge() + " " + carInsurance.getCapacity() + " " + carInsurance
            .getLocation());
    System.out.println(carInsurance.calculateThirdPartyPremium());
    carInsurance.calculateComprehensivePremium();
    System.out.println(carInsurance.idv);
    System.out.println(carInsurance.odp);
    System.out.println(carInsurance.ncb);
    System.out.println(carInsurance.calculateComprehensivePremiumTotal());
  }
}

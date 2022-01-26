package com.De01;

public class MainAction {
    public static void main(String[] args) {
        ParkingArea KhuA = new ParkingArea(10);
        Car MercedesCar = new OilCar("Mercedes", "2020", 1000, NUMBER_WHEELS.FOUR, PETROL_NAME.A95);
        Car BMWCar = new OilCar("BMW", "2021", 1500, NUMBER_WHEELS.FOUR, PETROL_NAME.A95);
        KhuA.InsertCar(2, MercedesCar);
        KhuA.InsertCar(3, BMWCar);
        KhuA.showInfo();
        int sumOfCars = KhuA.GetNumOfAvailableCar();
        System.out.println("Sum of available cars in KhuA: " + sumOfCars);

        Car queryCar = KhuA.QueryCarByPosition(4);
        if (queryCar != null) {
            queryCar.showInfo();
        }
    }
}

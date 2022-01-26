package com.De01;

public class ParkingArea {
    private int MAX;
    private Car[] AvailableCar;
    private int SumOfAvailableCar = 0;

    public ParkingArea(int MAX) {
        this.MAX = MAX;
        this.AvailableCar = new Car[MAX];
    }

    public int getMAX() {
        return MAX;
    }

    public void setMAX(int MAX) {
        this.MAX = MAX;
    }

    public Car[] getAvailableCar() {
        return AvailableCar;
    }

    public void setAvailableCar(Car[] availableCar) {
        AvailableCar = availableCar;
    }

    public void showInfo() {
        for (int i = 0; i < this.MAX; i++) {
            if (AvailableCar[i] == null) {
                System.out.println("Position " + i + " is empty ...");
                continue;
            }

            AvailableCar[i].showInfo();
        }
    }



    public void InsertCar(int position, Car car) {
        if (position < 0 || position > this.MAX) {
            System.out.println("Invalid Position");
            return;
        }
//        this.AvailableCar[position] = car;
        if (this.AvailableCar[position] == null) {
            this.AvailableCar[position] = car;
            return;
        }

        System.out.println("Position is not available ... Choose another position !!!");
    }

    public int GetNumOfAvailableCar() {
        for (int i = 0; i < this.MAX; i++) {
            if (AvailableCar[i] == null) continue;
            this.SumOfAvailableCar ++;
        }
        return this.SumOfAvailableCar;
    }

    public Car QueryCarByPosition(int position) {

        try {
            Utils.checkPosition(position, this.MAX, this.getAvailableCar());
        } catch (InvalidPositionException e) {
//            e.printStackTrace();
            return null;
        }

        return this.AvailableCar[position];
    }
}

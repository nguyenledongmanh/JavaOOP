package com.De01;

public abstract class Car {
    private String BrandName, MFGYear;
    private double Volume;
    private NUMBER_WHEELS NumOfWheels;

    public Car(String brandName, String MFGYear, double volume, NUMBER_WHEELS numOfWheels) {
        BrandName = brandName;
        this.MFGYear = MFGYear;
        Volume = volume;
        NumOfWheels = numOfWheels;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getMFGYear() {
        return MFGYear;
    }

    public void setMFGYear(String MFGYear) {
        this.MFGYear = MFGYear;
    }

    public double getVolume() {
        return Volume;
    }

    public void setVolume(double volume) {
        Volume = volume;
    }

    public NUMBER_WHEELS getNumOfWheels() {
        return NumOfWheels;
    }

    public void setNumOfWheels(NUMBER_WHEELS numOfWheels) {
        NumOfWheels = numOfWheels;
    }

    public void showMutualInfo() {
        System.out.println("----------------------------");
        System.out.println("Brand Name: " + this.getBrandName());
        System.out.println("MFG Year: " + this.getMFGYear());
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Number of wheels: " + this.getNumOfWheels());
        System.out.println("----------------------------");
    }

    public abstract void showInfo();
}

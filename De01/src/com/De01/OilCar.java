package com.De01;

public class OilCar extends Car{
    private PETROL_NAME OilName;
    public OilCar(String brandName, String MFGYear, double volume, NUMBER_WHEELS numOfWheels, PETROL_NAME oilName) {
        super(brandName, MFGYear, volume, numOfWheels);
        this.OilName = oilName;
    }

    public PETROL_NAME getOilName() {
        return OilName;
    }

    public void setOilName(PETROL_NAME oilName) {
        OilName = oilName;
    }


    @Override
    public void showInfo() {
        this.showMutualInfo();
        System.out.println("Type of Oil: " + this.getOilName());
        System.out.println("*******************************************");
    }
}

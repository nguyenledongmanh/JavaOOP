package com.De01;

public class PetrolCar extends Car{
    private PETROL_NAME PetrolName;


    public PetrolCar(String brandName, String MFGYear, double volume, NUMBER_WHEELS numOfWheels, PETROL_NAME petrol_name) {
        super(brandName, MFGYear, volume, numOfWheels);
        this.PetrolName = petrol_name;
    }

    public PETROL_NAME getPetrolName() {
        return PetrolName;
    }

    public void setPetrolName(PETROL_NAME petrolName) {
        PetrolName = petrolName;
    }

    @Override
    public void showInfo() {
        this.showMutualInfo();
        System.out.println("Type of Petrol: " + this.getPetrolName());
        System.out.println("*******************************************");
    }
}

package com.De01;

public class Utils {
    public static void checkPosition(int position, int MAX_CAR, Car[] listCars) throws InvalidPositionException {
        if ((position < 0 || position > MAX_CAR) || (listCars[position] == null)) {
            throw  new InvalidPositionException("Invalid Position, choose another valid value...Thanks!");
        }
        System.out.println("Valid position");
    }
}

package com.De01;

public enum PETROL_NAME {
    A92, A95;

    public String toString() {
        switch (this) {
            case A92 -> {
                return "A92";
            }

            case A95 -> {
                return "A95";
            }
        }

        return null;
    }
}

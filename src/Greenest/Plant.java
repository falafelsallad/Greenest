package Greenest;

abstract class Plant implements Gardening {

    // Encapsulation
    protected double height;

    WaterType waterType;
    double waterDose;

    public Plant(double height, WaterType waterType, double waterDose) {
        this.height = height;
        this.waterType = waterType;
        this.waterDose = waterDose;

    }

}

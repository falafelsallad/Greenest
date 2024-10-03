package Greenest;

public class Palm extends Plant {


    public Palm(double height) {
        super(height, WaterType.TapWater, height * 0.5);
    }

    // this below is an example of polymorphism because the method with this name is in other classes, but they do different things
    @Override
    public double getWaterDose() {
        return waterDose;
    }

    public WaterType getWaterType() {
        return waterType;
    }


}

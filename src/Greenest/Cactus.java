package Greenest;

public class Cactus extends Plant {


    public Cactus(double height) {
        super(height, WaterType.MineralWater, 0.2);
    }

    @Override
    public double getWaterDose() {
        return waterDose;
    }

    public WaterType getWaterType() {
        return waterType;
    }

}

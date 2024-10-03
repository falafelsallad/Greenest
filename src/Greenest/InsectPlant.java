package Greenest;

public class InsectPlant extends Plant {


    public InsectPlant(double height) {
        super(height, WaterType.ProteinWater, 0.1 + (0.2 * height));
    }

    @Override
    public double getWaterDose() {
        return waterDose;
    }

    public WaterType getWaterType() {
        return waterType;
    }

}

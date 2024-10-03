package Greenest;

public enum WaterType {
    TapWater("Tap water"),
    ProteinWater("Protein water"),
    MineralWater("Mineral water");

    private final String waterType; // Private field to store the string representation of the water type

    // encapsulation
    WaterType(String waterType) {
        this.waterType = waterType; //initialize
    }

    public String getWaterTypeString() {
        return waterType;  // return the string representation of the water type
    }
}
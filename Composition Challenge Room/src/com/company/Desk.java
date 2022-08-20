package com.company;

public class Desk {
    private Material buildingMaterial;
    private Dimensions dimensions;

    public Desk(Material buildingMaterial, Dimensions dimensions) {
        this.buildingMaterial = buildingMaterial;
        this.dimensions = dimensions;
    }

    public Material getBuildingMaterial() {
        return buildingMaterial;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

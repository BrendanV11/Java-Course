package com.company;

public class Roof {
    private Material buildingMaterial;
    private String colour;
    private Dimensions dimensions;

    public Roof(Material buildingMaterial, String colour, Dimensions dimensions) {
        this.buildingMaterial = buildingMaterial;
        this.colour = colour;
        this.dimensions = dimensions;
    }

    public Material getBuildingMaterial() {
        return buildingMaterial;
    }

    public String getColour() {
        return colour;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

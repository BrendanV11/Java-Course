package com.company;

public class Door {
    private Material buildingMaterial;
    private Dimensions dimensions;
    private String colour;

    public Door(Material buildingMaterial, Dimensions dimensions, String colour) {
        this.buildingMaterial = buildingMaterial;
        this.dimensions = dimensions;
        this.colour = colour;
    }

    public void openDoor()
    {
        System.out.println("Door has been opened");
    }

    public void closeDoor()
    {
        System.out.println("Door has been closed");
    }

    public Material getBuildingMaterial() {
        return buildingMaterial;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColour() {
        return colour;
    }
}

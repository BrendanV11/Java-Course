package com.company;

public class Window {
    private Dimensions dimensions;
    private Material buildingMaterial;
    private int size;

    public Window(Dimensions dimensions, Material buildingMaterial, int size) {
        this.dimensions = dimensions;
        this.buildingMaterial = buildingMaterial;
        this.size = size;
    }

    public void openWindow()
    {
        System.out.println("The window has been opened");
    }

    public void closeWindow()
    {
        System.out.println("The window has been closed");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Material getBuildingMaterial() {
        return buildingMaterial;
    }

    public int getSize() {
        return size;
    }
}

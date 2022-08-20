package com.company;

public class TV {
    private String model;
    private String manufacturer;
    private String size;
    private Dimensions dimensions;

    public TV(String model, String manufacturer, String size, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.dimensions = dimensions;
    }

    public void pressPowerButton()
    {
        System.out.println("The power button has been pressed");
    }


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSize() {
        return size;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

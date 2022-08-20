package com.company;

import java.util.Locale;

public class Car
{
    private int doors;    //private is used to indicate that the variables are
                          //private for this class
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera")||validModel.equals("commodore"))
        {
            this.model=model;
        }
        else
        {
            this.model="Unknown";
        }
        //this.model refers to the top declared variable
        // model refers to the parameter
        //this.model is given the value of the parameter
    }

    public String getModel()
    {
        return this.model;
    }

}

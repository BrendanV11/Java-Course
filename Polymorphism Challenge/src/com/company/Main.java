package com.company;


class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine()
    {
        return "Car engine has been started";
    }

    public String accelerate()
    {
        return "Car is accelerating";
    }

    public String brake(){
        return "Car is braking";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Ferrari extends Car{
    public Ferrari() {
        super("Ferrari",12);
    }

    @Override
    public String startEngine() {
        return "Starting Ferrari engine";
    }

    @Override
    public String accelerate() {
        return "Ferrari is accelerating";
    }

    @Override
    public String brake() {
        return "Ferrari is braking";
    }
}

class GWM extends  Car{
    public GWM() {
        super("GWM",6);
    }

    @Override
    public String startEngine() {
        return "Staring GWM engine";
    }

    @Override
    public String accelerate() {
        return "GWM is accelerating";
    }

    @Override
    public String brake() {
        return "GWM is braking";
    }
}

class Toyota extends Car{
    public Toyota() {
        super("Hilux",8);
    }

    @Override
    public String startEngine() {
        return "Hilux engine starting";
    }

    @Override
    public String accelerate() {
        return "Hilux is accelerating";
    }

    @Override
    public String brake() {
        return "Hilux is braking";
    }
}

class OtherCar extends Car{
    public OtherCar() {
        super("Other",2);
    }
}


public class Main {

    public static void main(String[] args)
    {

        for(int i=1;i<11;i++){
            Car car = randomCar();
            System.out.println("Car #"+i+": "+car.getName()+"\n"+
                    "Start status: "+car.startEngine()+"\n"+
                    "Accelerate status: "+car.accelerate()+"\n"+
                    "Braking status: "+car.brake()+"\n\n");
        }
    }

    public static Car randomCar()
    {
        int randomNum = (int) (Math.random() * 4) +1;
        System.out.println("Random number was: "+randomNum);

        switch(randomNum){
            case 1:
                return new Ferrari();
            case 2:
                return new GWM();
            case 3:
                return new Toyota();
            case 4:
                return new OtherCar();
        }
        return null;
    }

}

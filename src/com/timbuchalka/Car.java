package com.timbuchalka;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("holden")){
            this.model = model;
        }

        else this.model = "Unknown";
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel(){
        return this.model;
    }



}

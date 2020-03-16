package com.timbuchalka;


public class SpeedConverter {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(25.42));
        printConversion(0.0);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        long milesPerHour;
        if (kilometersPerHour < 0) return -1;

        milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometersperHour){
        if (kilometersperHour < 0)
            System.out.println("Invalid value");
        else {
            System.out.println(kilometersperHour + " km/h = " +
                    toMilesPerHour(kilometersperHour) + " mi/h");
        }
    }
}



package com.timbuchalka;


public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
        System.out.println(calcFeetAndInchesToCentimeters(6,2));
        System.out.println(calcFeetAndInchesToCentimeters(20));
    }

    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2, double d3){
        return true;
    }

    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2){
        int i1, i2 = 0;
        i1 = (int)(d1*1000);
        i2 = (int)(d2*1000);
        System.out.println(i1 +" "+ i2);

        return i1 == i2;
    }
    public static double calcFeetAndInchesToCentimeters(int feet, int inch){
        return (feet*12 + inch)*2.54;
    }

    public static double calcFeetAndInchesToCentimeters(int inch){
        return inch*2.54;
    }
}

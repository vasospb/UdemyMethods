package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println(sumDigits(125));
        System.out.println(1/10);
        System.out.println(sumDigits(1111111111));
    }

    public static int sumDigits(int pNumber){
        int rValue =0;
        if (pNumber<10) {
            rValue = -1;
            return rValue;
        }

        int sum = 0;
        while ((double)pNumber / 10 >= 1){
            sum = sum + pNumber % 10;
            pNumber = pNumber/10;
        }
        sum = sum + pNumber;
        return sum;
    }
}

package com.timbuchalka;

public class Largestprime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(8));
    }

    public static int getLargestPrime(int number){
        int largestprime = -1;

        for (int i=1; i<=number; i++){
            boolean isPrime = true;
            for (int y=2; y<i; y++){
                if (i % y == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) largestprime = i;
        }
        return largestprime;
    }
}

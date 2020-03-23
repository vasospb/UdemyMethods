package com.timbuchalka;

public class Largestprime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number){
        int largestprime = -1;
        if (number <= 1) return largestprime;
        boolean isPrime;
        for (int i=1; i<=number; i++){
            isPrime = true;
            for (int y=2; y<i; y++){
                if (i % y == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (number % i == 0)
                    largestprime = i;
            }
        }
        return largestprime;
    }
}

package com.timbuchalka;

public class forLoop {

    public static void main(String[] args) {


        for (int i=1; i<=10; i++){
            System.out.println("10000 at "+ i + " interest= " + String.format("%.1f",calculateIntereset(10000, i) ));
        }
        int c = 0;
        for (int i=2; i<102; i++){

            if(isPrime(i) ) {
                c++;
                System.out.println(i);
                if (c == 3)
                    break;
            }
        }
    }


    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }

        for (int i=2; i<=n/2; i++){
            if (n % i ==0)
                return false;
        }
        return true;
    }

    public static double calculateIntereset(double amount, double interestrate){
        return (amount*(interestrate/100));
    }
}

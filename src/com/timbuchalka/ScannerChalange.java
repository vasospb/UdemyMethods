package com.timbuchalka;

import java.util.Scanner;

public class ScannerChalange {

    public static void main(String[] args) {
        int counter=0;
        boolean isInt;
        int sum=0;
        int value;
        Scanner scanner = new Scanner(System.in);
        while (counter <10){
            counter++;
            System.out.println("Enter number #"+counter);
            isInt = scanner.hasNextInt();
            if (isInt){

                value = scanner.nextInt();
                sum+=value;



            } else{
                System.out.println("You have entered not int number. Try again");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println(sum);
    }
}

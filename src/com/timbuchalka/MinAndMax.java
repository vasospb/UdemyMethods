package com.timbuchalka;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;

        int min=0;
        int max=0;

        while (true){


            System.out.println("Please enter number:");
            boolean isInt = scanner.hasNextInt();
            if (isInt){

                int value = scanner.nextInt();
                if (count == 0){
                    max=value;
                    min=value;
                }
                if (value<min){
                    min=value;
                } else if (value>max) {
                    max=value;
                }
                count++;


            } else {
                System.out.println("Wrong number. Min is:"+min
                +". Maximum is: " + max);
                break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}

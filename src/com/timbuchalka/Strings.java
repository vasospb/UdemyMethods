package com.timbuchalka;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        String numberAsString = "2018";
        Scanner scan = new Scanner(System.in);
//        String i = scan.nextLine();

        System.out.println("String: " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        numberAsString += 1;
        number +=1;

        System.out.println( number + " "+ numberAsString);

    }
}

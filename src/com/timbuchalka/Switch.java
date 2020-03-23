package com.timbuchalka;

public class Switch {
    public static void main(String[] args) {

        char sw = 'U';

        switch (sw){
            case 'A':
                System.out.println("1");
                break;

            case 'B':
                System.out.println("2");
                break;

case 'C':
    case 'D':
                System.out.println("3 4");
            default:
                System.out.println("Not found");
        }
    }
}

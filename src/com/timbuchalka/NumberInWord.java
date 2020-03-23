package com.timbuchalka;

public class NumberInWord {
    public static void main(String[] args) {
printNumberInWord(2);
    }

    public static void printNumberInWord(int i){
        String[] digits;
        if (i>9 || i<0) {
            System.out.println("other");
            return;
        }
        digits = new String[] {"ZERRO", "ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        System.out.println(digits[i]);
        }

}

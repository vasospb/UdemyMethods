package com.company;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;

        number = Math.abs(number);
        int initialValue = number;
        while (number>0){
            int last = number % 10;
            reverse = reverse*10 + last;
            number /=10;
        }
        if (initialValue == reverse) return true;
        else return false;
    }

}

package com.timbuchalka;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printBytesAndkiloBytes(2500);
    }
    public static void printBytesAndkiloBytes(int kiloBytes){
        int megaBytes, kilobytesleft = 0;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            kilobytesleft = kiloBytes % 1024;
            megaBytes = (kiloBytes - kilobytesleft) / 1024;
            System.out.println(kiloBytes + " KB = "+
                    megaBytes + " MB and "+
                    kilobytesleft + " KB");
        }
    }
}

package com.valts;

public class Main {

    public static void main(String[] args) {

        String[] arrayOfNames = {"John", "Davis", "Niko"};

        System.out.println(funcConc(arrayOfNames));
    }

    private static String funcConc(String[] array) {
        String names = "";
        for (int i = 0; i < array.length; i++) {
            names += array[i];

            if (i != array.length - 1) {
                names += " ";
            }

        }

        return names;
    }
}

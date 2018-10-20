package com.company;

public class Dodawanie {
    public static void main(String[] args) {

        System.out.println(dodaj(12,13,13));
        System.out.println(dodaj(23.3,7.6));
    }
    static int dodaj (int a, int b){
        return a+b;
    }

    static double dodaj (double a, double b){
        return a+b;
    }

    static int dodaj (int a, int b, int c){
        return a+b+c;
    }
}

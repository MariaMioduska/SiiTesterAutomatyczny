package com.company;

public class Mnożenie {

    public static void main(String[] args) {

        System.out.println(pomnóż(3,8));
        System.out.println(pomnóż(3,4,5));
        System.out.println(pomnóż(1,2,3,4));
    }
    static int pomnóż (int a, int b){
        return a*b;
    }

    static int pomnóż (int a, int b, int c){
        return a*b*c;
    }

    static int pomnóż (int a, int b, int c, int d){
        return a*b*c*d;
    }
}

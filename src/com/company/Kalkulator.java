package com.company;

import java.util.Scanner;

public class Kalkulator {


    public static double oblicz(double a,double b, String c) {

        if (c == "+") {
            return a + b;
        } else if (c == "-") {
            return a - b;
        } else if (c == "*") {
            return a * b;
        } else if (c == "/" && b != 0) {
            return a / b;
        }else{
            return 0;
        }

    }



    public static void main(String[] args) {



    }
}



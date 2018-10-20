package com.company;

import javax.naming.Name;
import javax.swing.plaf.basic.BasicArrowButton;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("jak masz na imię?");
        String name=x.nextLine();


        switch (name){
            case "Asia":
                System.out.println("cześć " + name);
                break;
            case "Ola":
                System.out.println("cześć " + name);
                break;
            default:
                System.out.println("Przykto mi, ale Cię nie znam");

        }
    }
}
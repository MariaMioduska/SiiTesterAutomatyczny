package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zadania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int licznik42 = 0;
        int licznik = 0;
        List <Integer> wejsc = new LinkedList <>();
        wejsc.add(scanner.nextInt());
        do {
            licznik++;
            int zmienna = scanner.nextInt();
            wejsc.add(zmienna);
            if (zmienna == 42) {
                if (wejsc.get(licznik - 1) != 42) {
                    licznik42++;
                }
            }
            if (licznik42 == 3) {
                break;
            }
        } while (licznik > 0);
        for (int i : wejsc) {
            System.out.println(i);
        }

    }
}
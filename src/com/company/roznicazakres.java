
package com.company;

import java.util.Scanner;

public class roznicazakres {
    public static void main(String[] args) {
        int p = 0;
        int  n=0;
        int r;
        System.out.println("podaj liczbę z początku zakresu: ");
        Scanner scanner=new Scanner(System.in);
        Integer a = scanner.nextInt();

        System.out.println("podaj liczbę z końca zakresu: ");
        Scanner scanner1=new Scanner(System.in);
        Integer b = scanner1.nextInt();


        for ( int i =  a; i<=b; i++) {
            if (i % 2 == 0) {
                p = p + i;
            }
        }


        for ( int i = a; i<=b; i++) {
            if (i % 2 != 0) {
                n = n + i;
            }
        }

        r= n-p;
        System.out.println("Różnica sumy liczb parzystych i nieparzystych w zakresie od "+ a + " do " + b+ " wynosi: "+r);
    }


}


package com.company.dowolny;
import java.util.Scanner;

public class dowolnypierwsze {
    public static void main(String[] args) {
        int i;
        int j;

        System.out.println("podaj liczbę z początku zakresu: ");
        Scanner scanner=new Scanner(System.in);
        Integer a = scanner.nextInt();

        System.out.println("podaj liczbę z końca zakresu: ");
        Scanner scanner1=new Scanner(System.in);
        Integer b = scanner1.nextInt();

        for(  i=a; i<=b; i++){
            if (i == 0 || i == 1){
                continue;
                //sprawdza czy czy i jest zerem lub jedynką, jeśli tak wychodzi z tego warunku i wchodzi na nowo w pętlę pobiera i +1
            }
            else {
                for (j =2 ; j <= i; j++)
                    if (i == j){
                        System.out.println(i);
                    }
                    else {
                        if ( i % j == 0){
                            break;
                        }
                    }


            }
        }
    }
}

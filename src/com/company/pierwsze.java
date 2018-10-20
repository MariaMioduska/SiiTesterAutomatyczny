package com.company;

public class pierwsze {
    public static void main(String[] args) {
        int i,k;
        for (i = 1; i <= 100; i++)
            if (i == 1) {
                continue;
            } else {
                for (k = 2; k <= i; k++)
                    if (i == k) {
                        System.out.println(i);
                    } else {
                        if (i % k == 0) {
                            break;
                        }


                    }
            }
    }
}

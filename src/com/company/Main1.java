package com.company;



class Samochów {

    int iloscKol;
    String color;

    public void jedzie() {
        System.out.println("Brum");
    }

    public int getIloscKol() {
        return iloscKol;
    }

    public String getColor() {
        return color;
    }

    public void setIloscKol(int ileJestKol) {
        iloscKol=ileJestKol;
    }
}


public class Main1 {

    public static void main(String[] args) {
        Samochów samochod = new Samochów();
        samochod.setIloscKol(5);
        System.out.println(samochod.iloscKol);
        samochod.color="biały";
        System.out.println(samochod.color);
        samochod.jedzie();

    }
}

package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Pracownik {

    String imię;
    String nazwisko;
    int wiek;

    Pracownik(String imię, String nazwisko, int wiek ) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    ;

    public String getImię() {
        return imię;
    }

    public void setImię(String podajImię) {
        imię = podajImię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String podajNazwisko) {
        nazwisko = podajNazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int ileLat) {
        wiek = ileLat;
    }

    public void pobierzDane() {
        System.out.println(getImię() + " " + getNazwisko() + " " + getWiek());
    }
}


public class Firma {

    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Jan", "Kowalski", 45);
        Pracownik pracownik2 = new Pracownik("Anna", "Nowak", 34);
        Pracownik pracownik3= new Pracownik("Maria","Mioduska",89);

       pracownik1.pobierzDane();
       pracownik2.pobierzDane();
       pracownik3.pobierzDane();

      /*  pracownik1.setWiek(23);
        pracownik1.setNazwisko("Kowalski");
        pracownik1.setImię("Jan");

        Pracownik pracownik2 = new Pracownik();
        pracownik2.setWiek(45);
        pracownik2.setNazwisko("Nowak");
        pracownik2.setImię("Anna");

        pracownik1.pobierzDane();
        pracownik2.pobierzDane();*/
    }

}


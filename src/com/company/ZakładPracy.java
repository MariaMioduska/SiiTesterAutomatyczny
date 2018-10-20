package com.company;

class Pracownik1{
    String imie;
    String nazwisko;
    int wiek;

    public Pracownik1() {
    }

    public Pracownik1(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;


    }
}

class Szef extends Pracownik1{
    int premia;
   Szef(String imie,String nazwisko, int wiek, int premia){
       this.imie=imie;
       this.nazwisko=nazwisko;
       this.wiek=wiek;
       this.premia=premia;
   }

}



public class ZakładPracy {
    public static void main(String[] args) {
        Pracownik1 pracownik= new Pracownik1("jan","kowalski", 54);
        Szef szef= new Szef("tadeusz", "nowacki", 39,2000);
    }
}

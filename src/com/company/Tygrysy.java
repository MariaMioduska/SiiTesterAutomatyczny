package com.company;

class Kot{
    int lapy;
    String kolor;
    String rasa;
    boolean czyLadny;
    double predkosc;

    Kot(boolean czyLadny1, String kolor1, String rasa1, int lapy1, double predkosc1){
        lapy=lapy1;
        kolor=kolor1;
        czyLadny=czyLadny1;
        rasa=rasa1;
        predkosc=predkosc1;
    }
    Kot(){}
}

public class Tygrysy {
    public static void main(String[] args) {
        Kot kot=new Kot(true, "rudy tygrysio pregowany","norweski lesny", 4, 35.5);

        System.out.println(kot.kolor);
    }
}

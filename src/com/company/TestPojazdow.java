package com.company;

abstract class Pojazd {
    abstract public void jazda(int predkosc);

    abstract public void stop();

    void dajGlos() {
        System.out.println("Bziummm");
    }
}


class Auto extends Pojazd {
    public void jazda(int predkosc) {
        System.out.println("auto porusza się z prędkością " + predkosc);
    }

    @Override
    public void stop() {
        System.out.println("auto zatrzymuje się");
    }
}

class Rower extends Pojazd {

    @Override
    public void jazda(int predkosc) {
        System.out.println("rower porusza się z prędkoscia " + predkosc);
    }

    @Override
    public void stop() {
        System.out.println("rower zatrzymuje się");

    }
}

public class TestPojazdow {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.jazda(80);
        auto.stop();
        Rower rower = new Rower();
        rower.jazda(25);
        rower.stop();
        auto.dajGlos();
        rower.dajGlos();
    }
}

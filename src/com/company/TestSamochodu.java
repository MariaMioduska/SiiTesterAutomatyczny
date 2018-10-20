package com.company;

interface Samochod{
    int maxPredkosc();
}

abstract class cechySamochodow implements Samochod{
    int cena;
    String kolor;
}
class Mercedes implements Samochod{

    @Override
    public int maxPredkosc() {
        return 200;
    }
}

class BMW implements Samochod{

    @Override
    public int maxPredkosc() {
        return 220;
    }
}

class Audi implements Samochod{

    @Override
    public int maxPredkosc() {
        return 180;
    }
}

class FabrykaSamochodow{
    public static  Samochod pobierzSamochod(int predkosc ){
        Samochod samochod=null;
        switch (predkosc){
            case 200 : samochod=new Mercedes();
                break;
            case 220 : samochod=new BMW();
                break;
            case 180 : samochod=new Audi();
                break;
        }
        return samochod;
    }
}

public class TestSamochodu {
    public static void main(String[] args) {
        Samochod samochod=FabrykaSamochodow.pobierzSamochod(200);
        System.out.println(samochod.getClass().toString());
    }
}


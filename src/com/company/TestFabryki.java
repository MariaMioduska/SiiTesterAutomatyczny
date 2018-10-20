package com.company;


interface Zwierze{
    String dajGlos();
}

class Pies implements Zwierze{


    @Override
    public String dajGlos() {
        return "hau";
    }
}

class Kotek implements Zwierze{

    @Override
    public String dajGlos() {
        return "miauuu";
    }
}

class Kon implements Zwierze{
    @Override
    public String dajGlos() {
        return "ihaha";
    }
}

class FabrykaZwierzat{
    public static  Zwierze pobierzZwierze(String glos){
        Zwierze zwierze=null;
        switch (glos){
            case "hau" : zwierze=new Pies();
            break;
            case "miauuu" : zwierze=new Kotek();
            break;
            case "ihaha" : zwierze=new Kon();
            break;
        }
        return zwierze;
    }
}
public class TestFabryki {
    public static void main(String[] args) {
        Zwierze zwierze=FabrykaZwierzat.pobierzZwierze("hau");
        System.out.println(zwierze.getClass().toString());
    }

}

package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

class Dziadkowie{
    String geny;

    public Dziadkowie(){}

    public Dziadkowie(String geny){
        this.geny=geny;

    }
}

class Rodzice extends Dziadkowie {
    boolean praca;

    Rodzice(String geny, boolean praca) {
        super(geny);
        this.praca = praca;
    }
    Rodzice(){}
}
    class Dzieci extends Rodzice{
        boolean mlodosc;
        Dzieci(String geny, boolean praca, boolean mlodosc){
           super(geny,praca);
            this.mlodosc=mlodosc;
        }
    }

public class Rodzina {
    public static void main(String[] args) {
        Dziadkowie dziadek=new Dziadkowie("dobre");
        Rodzice mama= new Rodzice("dobre", true);
        Dzieci córka=new Dzieci("dobre",true, true);

        System.out.println(dziadek.geny);
        System.out.println(mama.praca);
        System.out.println(córka.mlodosc);
    }
}








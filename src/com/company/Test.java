package com.company;

import java.util.ArrayList;
import java.util.List;

interface Owoce{
   public double pobierzCena();

    public double pobierzWaga();
}
abstract class owoceHelper implements Owoce{
    double cena;
    double waga;
    String kolor;}

class Pomarancze extends owoceHelper {

    public double pobierzCena() {
        return cena;
    }

    public double pobierzWaga() {
        return waga;
    }

}


    class Banan extends owoceHelper {

        public double pobierzCena() {
            return cena;
        }


        public double pobierzWaga() {
            return waga;
        }
    }
        class Jablka extends owoceHelper{


            public double pobierzCena(){
                return cena;
            };
            public double pobierzWaga(){
                return waga;
            };

}



public class Test {
    public static void main(String[] args) {
        Owoce pomarancze= new Pomarancze();
        ((Pomarancze) pomarancze).cena=2;
        Owoce banan=new Banan();
        ((Banan) banan).cena =3;

        List<Owoce> skrzynka= new ArrayList();
        skrzynka.add(pomarancze);
        skrzynka.add(banan);

        for(Owoce o:skrzynka){
            o.pobierzCena();
            System.out.println(o.pobierzCena());
        }
    }
}

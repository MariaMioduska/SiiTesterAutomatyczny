package com.company;

public class ZarobkiNettoNaFakture {
    final double taxRate = 1.23;
    final double IncomTaxRate=1.18;
    double zarobkiBrutto;
    double zus;
    Kalkulator kalkulator;
    private double zarobkiNetto;
    private double ZarobkiNettoBezZus;

    public double getZarobkiNaReke(double zarobkiBrutto, double zus){
        zarobkiNetto = getZarobkiNetto(zarobkiBrutto);
        ZarobkiNettoBezZus= getZarobkiNettoBezZus(zarobkiNetto,zus);
       return getZarobkiPoPodatkuPit();

    }

    private double getZarobkiPoPodatkuPit() {
        return kalkulator.oblicz(ZarobkiNettoBezZus,IncomTaxRate,"/");
    }

    private double getZarobkiNettoBezZus(double zarobkiNetto,double zus) {
        return kalkulator.oblicz(zarobkiNetto, zus, "-");
    }

    private double getZarobkiNetto(double zarobkiBrutto) {
        return kalkulator.oblicz(zarobkiBrutto, taxRate, "/");
    }

}



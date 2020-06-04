package com.company;

interface Krztalt {

    kwadrat kwadrat1 = new kwadrat(4, 0, 0);
    public double obliczPowierzchnie();
    public double obliczObwod();
}

class kwadrat implements Krztalt{
    double dlugoscBoku;
    double pole;
    double obwod;

    kwadrat (double dlugoscBoku, double pole, double obwod) {
        this.dlugoscBoku = 6;
        this.pole = 0;
        this.obwod = 0;
    }

    public double obliczPowierzchnie(){
        pole = dlugoscBoku * dlugoscBoku;
        System.out.println("Pole krztałtu to " + pole);
        return pole;
    }

    public double obliczObwod(){
        obwod = 4 * dlugoscBoku ;
        System.out.println("Obwód krztałtu to " + obwod);
        return obwod;
    }
}

class Trójkąt implements Krztalt{
    double a;
    double b;
    double c;
    double p = (a/2) + (b/2) + (c/2);
    double pole;
    double obwod;

    Trójkąt(double a, double b, double c){
        this.a = 5;
        this.b = 4;
        this.c = 2;
    }

    public double obliczPowierzchnie(){
        pole = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Pole krztałtu to " + pole);
        return pole;
    }
    public double obliczObwod(){
        obwod = a + b + c;
        System.out.println("Obwód krztałtu to " + obwod);
        return obwod;
    }
}

public class Main {
    public static void main(String[] args) {
        kwadrat kwadrat1 = new kwadrat(4,0,0);
        kwadrat1.obliczPowierzchnie();
        kwadrat1.obliczObwod();

        Trójkąt trójkąt1 = new Trójkąt(6,5,2);
        trójkąt1.obliczPowierzchnie();
        trójkąt1.obliczObwod();
    }
}

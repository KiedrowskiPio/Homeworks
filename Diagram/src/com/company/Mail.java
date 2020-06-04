package com.company;

import java.sql.Timestamp;

public class Mail{
    private String temat;
    private String treść;
    private String nadawca;
    private String odbiorca;
    private Zalacznik załącznik;
    private Uzytkownik właściciel;

    Timestamp godzina = new Timestamp(System.currentTimeMillis());

    Mail(String dTemat, String dTreść, String dNadawca, String dOdbiorca){
        temat = dTemat;
        treść = dTreść;
        nadawca = dNadawca;
        odbiorca = dOdbiorca;
    }

    void pokażMail(){
        System.out.println("----------------MAIL-----------------");
        System.out.println("godzina: " + godzina);
        System.out.println("od: " + nadawca);
        System.out.println("do: " + odbiorca);
        System.out.println("temat: " + temat);
        System.out.println("treść: " + treść);
        System.out.println("\n");
    }

}

package com.company;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<CzarnaLista> czarna_lista = new ArrayList<CzarnaLista>();
        CzarnaLista czarnaLista1 = new CzarnaLista("LubięPierogi123@gmail.com");
        czarna_lista.add(czarnaLista1);


        ArrayList<Ustawienia> ustawienia = new ArrayList<Ustawienia>();
        ArrayList<String> kolory1 = new ArrayList<String>();
        kolory1.add("niebieski");
        Ustawienia ustawienia1 = new Ustawienia(kolory1,"Podstawowe", "Polski", "Bazowe");
        ustawienia.add(ustawienia1);

        Mail mail1 = new Mail("Zadanie domowe", "Cześć, z tej strony Mariusz","MariuszP@gmail.com","MariannaP@gmail.com");
        ArrayList<Mail> folder = new ArrayList<Mail>();
        Folder folder1 = new Folder("Folder123");
        folder.add(mail1);

        Dzial dzial = new Dzial("Zarząd",1,"Zarząd");
        ArrayList kontakty = new ArrayList();
        Kontakt kontakt1 = new Kontakt("Maciej","Pazlacki",563728129,345434326,543266437,"Pan Maciej",folder1,"MaciejP@gmail.com","MaciejP@wp.pl");
        kontakty.add(kontakt1);

        Uzytkownik użytkownik = new Uzytkownik("Marian", "Admin123", czarna_lista, dzial, ustawienia1, kontakty);


        użytkownik.wyswietlDaneUzytkownika();
        czarnaLista1.pokazCzarnaListe();
        kontakt1.pokażKontakt();
        dzial.pokazDzial();
        mail1.pokażMail();
        folder1.pokażFolder();
    }
}

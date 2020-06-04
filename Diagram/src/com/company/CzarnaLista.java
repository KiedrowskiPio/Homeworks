package com.company;

public class CzarnaLista{
    private Uzytkownik użytkownik;
    private String Adres_email;

    CzarnaLista(String dAdres_email){
        Adres_email= dAdres_email;
    }
    public void pokazCzarnaListe(){
        System.out.println("---------CZARNA LISTA---------");
        System.out.println("Adres email: " + Adres_email);
        System.out.println("\n");
    }
}

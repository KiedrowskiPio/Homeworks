package com.company;

import com.company.CzarnaLista;
import com.company.Dzial;
import com.company.KsiazkaAdresowa;
import com.company.Ustawienia;

import java.util.ArrayList;
import java.util.List;

public class Uzytkownik{
    private String login;
    private String haslo;
    private List<CzarnaLista> czarna_lista;
    private Dzial działy;
    private Ustawienia ustawienia;
    private ArrayList<KsiazkaAdresowa> książkaAdresowa;

    Uzytkownik(String log, String pass, List<CzarnaLista> dczarna_lista, Dzial ddziały, Ustawienia dustawienia, ArrayList<KsiazkaAdresowa> dksiążkaAdresowa){
        login = log;
        haslo = pass;
        czarna_lista = dczarna_lista;
        działy = ddziały;
        ustawienia= dustawienia;
        książkaAdresowa = dksiążkaAdresowa;
    }


    void wyswietlDaneUzytkownika(){
        System.out.println("-------------UŻYTKOWNIK--------------");
        System.out.println("login: " + login);
        System.out.println("hasło: " + haslo);
        System.out.println("czarna lista: " + czarna_lista);
        System.out.println("działy: " + działy);
        System.out.println("ustawienia " + ustawienia);
        System.out.println("książka adresowa: " + książkaAdresowa);
        System.out.println("\n");
    }
}
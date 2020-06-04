package com.company;

import java.util.ArrayList;

public class Folder{
    private String nazwa;
    private Uzytkownik właściciel;

    Folder(String dnazwa){
        nazwa = dnazwa;
    }

    public void pokażFolder(){
        System.out.println("--------Folder------");
        System.out.println("nazwa: " + nazwa);
        System.out.println("\n");
    }
}

package com.company;

import java.sql.SQLClientInfoException;

public class Dzial {
    private String nazwa;
    private int ID;
    private String opis;

    Dzial(String dnazwa, int dID, String dopis){
        nazwa = dnazwa;
        ID = dID;
        opis = dopis;
    }
    public void pokazDzial(){
        System.out.println("-----------DZIAL----------");
        System.out.println("nazwa: " + nazwa);
        System.out.println("ID " + ID);
        System.out.println("opis " + opis);
        System.out.println("\n");
    }
}

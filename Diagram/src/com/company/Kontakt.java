package com.company;

import java.util.Arrays;

public class Kontakt{
    private String imię;
    private String nazwisko;
    private int telefonGSM;
    private int telefonDOM;
    private int telefonPRACA;
    private String opis;
    private Folder folder;
    private String email;
    private String alternatywny_email;

    Kontakt(String dimię, String dnazwisko,int dtelefonGSM,int delefonDOM, int dtelefonPRACA, String dopis, Folder dfolder, String demail, String dalternatywny_email){
        imię = dimię;
        nazwisko = dnazwisko;
        telefonGSM = dtelefonGSM;
        telefonDOM = delefonDOM;
        telefonPRACA = dtelefonPRACA;
        opis = dopis;
        Folder folder1 = new Folder("folder");
        folder = dfolder;
        email = demail;
        alternatywny_email = dalternatywny_email;
    }
    public void pokażKontakt(){
        System.out.println("-------------KONTAKT--------------");
        System.out.println("imię: " + imię);
        System.out.println("nazwisko: " + nazwisko);
        System.out.println("telefonGSM: " + telefonGSM);
        System.out.println("telefonDOM: " + telefonDOM);
        System.out.println("telefonPRACA: " + telefonPRACA);
        System.out.println("opis: " + opis);
        System.out.println("folder: " + folder);
        System.out.println("email: " + email);
        System.out.println("alternatywny email " + alternatywny_email);
        System.out.println("\n");

    }
}

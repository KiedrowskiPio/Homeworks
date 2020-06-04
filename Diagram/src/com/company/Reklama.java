package com.company;

import java.util.List;

public class Reklama{
    private String treść;
    public List<Dzial> grupy_dedykowane;
    Reklama(String dtreść, List<Dzial> dgrupy_dedykowane){
        treść = dtreść;
        grupy_dedykowane = dgrupy_dedykowane;
    }
}


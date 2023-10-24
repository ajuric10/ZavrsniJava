/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.util;

import evidencija.model.Operater;

/**
 *
 * @author Ana Jurić
 */
public class Alati {
    
     public static final String NAZIV_APP = "Evidencija APP";
     public static Operater OPERATER;
    
    public static String getOperater(){
        return OPERATER.getIme() + " " + OPERATER.getPrezime() + " (" + OPERATER.getUloga() + ")";
    }
    
}

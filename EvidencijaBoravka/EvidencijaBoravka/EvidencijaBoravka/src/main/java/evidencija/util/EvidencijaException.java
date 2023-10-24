/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.util;

/**
 *
 * @author Ana Jurić
 */
public class EvidencijaException extends Exception{
    private String poruka;
    
    
    public EvidencijaException(String poruka){
        super(poruka);
        this.poruka=poruka;
        
    }
    
     public String getPoruka() {
        return poruka;
    }
}

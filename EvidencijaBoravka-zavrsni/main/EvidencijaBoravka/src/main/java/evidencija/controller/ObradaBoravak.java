/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.controller;

import evidencija.model.Boravak;
import evidencija.model.Odjel;
import evidencija.util.EvidencijaException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author petar
 */
public class ObradaBoravak extends Obrada<Boravak>{

    @Override
    protected void kontrolaUnos() throws EvidencijaException {
        if(entitet.getOdjel()==null){
            throw new EvidencijaException("Odjel mora biti definiran");
        }
    }
    

    @Override
    protected void kontrolaPromjena() throws EvidencijaException {
        kontrolaUnos();
    }

    @Override
    protected void kontrolaBrisanje() throws EvidencijaException {
        
    }

    @Override
    public List<Boravak> read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}

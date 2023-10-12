/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.controller;

import evidencija.model.Lijecnik;
import evidencija.util.EvidencijaException;
import java.util.List;

/**
 *
 * @author petar
 */
public class ObradaLijecnik extends Obrada<Lijecnik>{

    @Override
    protected void kontrolaUnos() throws EvidencijaException {
        if (!Character.isUpperCase(entitet.getIme().charAt(0))) {
        throw new EvidencijaException("Prvo slovo imena mora biti veliko");
        }
        if (!Character.isUpperCase(entitet.getPrezime().charAt(0))) {
        throw new EvidencijaException("Prvo slovo prezimena mora biti veliko");
        }
        if(entitet.getPacijenti()==null){
            throw new EvidencijaException("Pacijent mora biti definiran");
        }
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
    public List<Lijecnik> read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

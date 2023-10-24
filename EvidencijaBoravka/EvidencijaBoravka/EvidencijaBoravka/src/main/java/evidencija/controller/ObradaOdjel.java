/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.controller;

import evidencija.model.Odjel;
import evidencija.util.EvidencijaException;
import java.util.List;

/**
 *
 * @author Ana Jurić
 */
public class ObradaOdjel extends Obrada<Odjel>{

    @Override
    protected void kontrolaUnos() throws EvidencijaException {
       if(entitet.getNaziv()==null || entitet.getNaziv().isEmpty()){
           throw new EvidencijaException("Naziv obavezno");
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
    public List<Odjel> read() {
        List<Odjel> lista=session.createQuery("from Odjel",Odjel.class).list();
        return lista;
    }

    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.controller;

import evidencija.model.Pacijent;
import evidencija.util.EvidencijaException;
import java.util.List;

/**
 *
 * @author Ana Jurić
 */
public class ObradaPacijent extends Obrada<Pacijent>{

    @Override
    protected void kontrolaUnos() throws EvidencijaException {
        if (!Character.isUpperCase(entitet.getIme().charAt(0))) {
        throw new EvidencijaException("Prvo slovo imena mora biti veliko");
        }
        if (!Character.isUpperCase(entitet.getPrezime().charAt(0))) {
        throw new EvidencijaException("Prvo slovo prezimena mora biti veliko");
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
    public List<Pacijent> read() {
        List<Pacijent> lista= session.createQuery("from Pacijent",Pacijent.class).list();
        return lista;
    }

    
    
    
}

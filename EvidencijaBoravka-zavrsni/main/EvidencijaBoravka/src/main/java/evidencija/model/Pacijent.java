/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.model;

import jakarta.persistence.Entity;

/**
 *
 * @author petar
 */

@Entity
public class Pacijent extends Entitet{
    private String ime;
    private String prezime;

    public Pacijent(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Pacijent() {
    }

    
    
    
    
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
    
    
}

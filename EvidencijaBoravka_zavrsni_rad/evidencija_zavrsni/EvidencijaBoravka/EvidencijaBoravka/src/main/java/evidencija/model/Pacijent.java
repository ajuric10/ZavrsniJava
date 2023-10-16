/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author Ana Jurić
 */

@Entity
public class Pacijent extends Entitet{
    private String ime;
    private String prezime;
    
    @ManyToOne
    private Lijecnik lijecnik;

    public Pacijent(String ime, String prezime, Lijecnik lijecnik, Integer sifra) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.lijecnik = lijecnik;
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

    public Lijecnik getLijecnik() {
        return lijecnik;
    }

    public void setLijecnik(Lijecnik lijecnik) {
        this.lijecnik = lijecnik;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
    

   
    
    
}

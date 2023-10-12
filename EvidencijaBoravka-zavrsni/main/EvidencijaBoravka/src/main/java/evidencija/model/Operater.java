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
public class Operater extends Entitet{
    
    private String ime;
    private String prezime;
    private String email;
    private String lozinka;
    private String uloga;

    
    
    public Operater() {
    }

    public Operater(String ime, String prezime, String email, String lozinka, String uloga, Integer sifra) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.lozinka = lozinka;
        this.uloga = uloga;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getUloga() {
        return uloga;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }
    

    
}

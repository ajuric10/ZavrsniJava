/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 *
 * @author petar
 */

@Entity
public class Lijecnik extends Entitet{
    private String ime;
    private String prezime;
    @ManyToOne
    private Odjel odjel;
    @OneToMany
    private List<Pacijent> pacijenti;

    public Lijecnik(String ime, String prezime, Odjel odjel, List<Pacijent> pacijenti, Integer sifra) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.odjel = odjel;
        this.pacijenti = pacijenti;
    }

    public Lijecnik() {
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

    public Odjel getOdjel() {
        return odjel;
    }

    public void setOdjel(Odjel odjel) {
        this.odjel = odjel;
    }

    public List<Pacijent> getPacijenti() {
        return pacijenti;
    }

    public void setPacijenti(List<Pacijent> pacijenti) {
        this.pacijenti = pacijenti;
    }

  
    
    
    
}

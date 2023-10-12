/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.model;


import jakarta.persistence.Entity;
import java.util.Date;

/**
 *
 * @author petar
 */
@Entity
public class Boravak extends Entitet{
    private Date datumPrimitka;
    private Date datumOtpusta;
    
    private Odjel odjel;

    public Boravak(Date datumPrimitka, Date datumOtpusta, Odjel odjel, Integer sifra) {
        super(sifra);
        this.datumPrimitka = datumPrimitka;
        this.datumOtpusta = datumOtpusta;
        this.odjel = odjel;
    }

    public Boravak() {
    }

    
    
    
    
    public Date getDatumPrimitka() {
        return datumPrimitka;
    }

    public void setDatumPrimitka(Date datumPrimitka) {
        this.datumPrimitka = datumPrimitka;
    }

    public Date getDatumOtpusta() {
        return datumOtpusta;
    }

    public void setDatumOtpusta(Date datumOtpusta) {
        this.datumOtpusta = datumOtpusta;
    }

    public Odjel getOdjel() {
        return odjel;
    }

    public void setOdjel(Odjel odjel) {
        this.odjel = odjel;
    }
    
    
}

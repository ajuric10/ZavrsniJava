/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.model;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.util.Date;

/**
 *
 * @author Ana Jurić
 */
@Entity
public class Boravak extends Entitet{
    private Date datumPrimitka;
    private Date datumOtpusta;
    @ManyToOne
    private Odjel odjel;

    public Boravak() {
    }

    public Boravak(Date datumPrimitka, Date datumOtpusta, Integer sifra) {
        super(sifra);
        this.datumPrimitka = datumPrimitka;
        this.datumOtpusta = datumOtpusta;
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

    @Override
    public String toString() {
        return getDatumPrimitka() + " " +getOdjel();
    }

    

    
    
}

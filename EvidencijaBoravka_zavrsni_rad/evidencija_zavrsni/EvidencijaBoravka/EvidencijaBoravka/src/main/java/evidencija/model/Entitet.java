/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

/**
 *
 * @author Ana Jurić
 */
@MappedSuperclass
public abstract class Entitet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sifra;

    public Entitet() {
    }

    public Entitet(Integer sifra) {
        this.sifra = sifra;
    }

    public Integer getSifra() {
        return sifra;
    }

    public void setSifra(Integer sifra) {
        this.sifra = sifra;
    }
}

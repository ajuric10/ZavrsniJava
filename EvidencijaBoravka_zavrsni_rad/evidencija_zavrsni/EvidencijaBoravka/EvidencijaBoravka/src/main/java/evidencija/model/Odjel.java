package evidencija.model;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Odjel extends Entitet {
    private String naziv;
    
    @OneToMany(mappedBy = "odjel")
    private List<Boravak> boravci;
    
    @OneToMany(mappedBy = "odjel")
    private List<Lijecnik> lijecnici;
    
   

    public Odjel(String naziv, Integer sifra) {
        super(sifra);
        this.naziv = naziv;
        this.boravci = new ArrayList<>();
    }

    public Odjel() {
        this.boravci = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Boravak> getBoravci() {
        return boravci;
    }

    public void setBoravci(List<Boravak> boravci) {
        this.boravci = boravci;
    }

   

    @Override
    public String toString() {
        return naziv;
    }
    
    

}

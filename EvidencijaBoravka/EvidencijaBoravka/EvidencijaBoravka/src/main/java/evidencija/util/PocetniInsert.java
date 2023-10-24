/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.util;

import com.github.javafaker.Faker;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import evidencija.controller.ObradaOperater;
import evidencija.model.Boravak;
import evidencija.model.Lijecnik;
import evidencija.model.Odjel;
import evidencija.model.Operater;
import evidencija.model.Pacijent;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Ana Jurić
 */
public class PocetniInsert {
    
    private static final int BROJ_ODJELA=5;
    private static final int BROJ_BORAVKA=25;
    private static final int BROJ_PACIJENATA=20;
    private static final int BROJ_LIJECNIKA=5;
    
    private Faker faker;
    private Session session;
    private List<Odjel> odjeli;
    private List<Boravak> boravci;
    private List<Pacijent> pacijenti;
    private List<Lijecnik> lijecnici;
    
    
    public PocetniInsert() {
        faker = new Faker();
        session = HibernateUtil.getSession();
        odjeli= new ArrayList<>();
        boravci= new ArrayList<>();
        pacijenti= new ArrayList<>();
        lijecnici= new ArrayList<>();
        session.getTransaction().begin();
        kreirajOdjele();
        kreirajBoravke();
        kreirajLijecnike();
        kreirajPacijente();
        session.getTransaction().commit();
        lozinka();
    }

    private void kreirajOdjele() {
        Odjel o;
        for (int i = 0; i < BROJ_ODJELA; i++) {
            o= new Odjel();
            o.setNaziv(faker.name().name());
            session.persist(o);
            odjeli.add(o);
        
        }
    }

    private void kreirajBoravke() {
        Boravak b;
        for (int i = 0; i < BROJ_BORAVKA; i++) {
            b = new Boravak();
            b.setDatumPrimitka(faker.date().birthday());
            b.setDatumOtpusta(faker.date().birthday());
            b.setOdjel(odjeli.get(faker.number().numberBetween(0, BROJ_ODJELA-1)));
            session.persist(b);
            boravci.add(b);
        }
    }
    
    private void kreirajLijecnike() {
        Lijecnik l;
        for (int i = 0; i < BROJ_LIJECNIKA; i++) {
            l=new Lijecnik();
            l.setIme(faker.name().firstName());
            l.setPrezime(faker.name().lastName());
            l.setOdjel(odjeli.get(faker.number().numberBetween(0, BROJ_ODJELA-1)));
            session.persist(l);
            lijecnici.add(l);
            
        }
    }

    private void kreirajPacijente() {
        Pacijent p;
        for (int i = 0; i < BROJ_PACIJENATA; i++) {
            p= new Pacijent();
            p.setIme(faker.name().firstName());
            p.setPrezime(faker.name().lastName());
            p.setLijecnik(lijecnici.get(faker.number().numberBetween(0,BROJ_LIJECNIKA-1)));
            session.persist(p);
            pacijenti.add(p);
            
        }
    }
    
    private static void lozinka(){
         // factory pattern
        Argon2 argon2 = Argon2Factory.create();
        
        String hash = argon2.hash(10, 65536, 1, "evidencija".toCharArray());
        
        ObradaOperater oo = new ObradaOperater();
        Operater o = new Operater();
        o.setIme("Ana");
        o.setPrezime("Jurić");
        o.setEmail("ana@evidencija.hr");
        o.setUloga("oper");
        o.setLozinka(hash);
        
        oo.setEntitet(o);
        
        try {
            oo.create();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
    
}
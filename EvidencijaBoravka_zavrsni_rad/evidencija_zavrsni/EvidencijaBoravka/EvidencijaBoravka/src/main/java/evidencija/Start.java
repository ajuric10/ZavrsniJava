/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package evidencija;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import evidencija.controller.ObradaOperater;
import evidencija.model.Operater;
import evidencija.util.HibernateUtil;
import evidencija.util.PocetniInsert;
import evidencija.view.Autorizacija;
import evidencija.view.SplashScreen;

/**
 *
 * @author Ana Jurić
 */
public class Start {

    public static void main(String[] args) {
        
        new SplashScreen().setVisible(true);
       //lozinka();
        //new Autorizacija().setVisible(true);
      //new PocetniInsert();
       // HibernateUtil.getSession();
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

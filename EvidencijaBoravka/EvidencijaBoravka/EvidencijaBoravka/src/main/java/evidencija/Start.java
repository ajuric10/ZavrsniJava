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
        
        //new Autorizacija().setVisible(true);
       // new PocetniInsert();
        //HibernateUtil.getSession();
    }
    
    
    
}

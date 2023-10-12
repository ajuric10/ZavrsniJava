/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencija.controller;

import evidencija.model.Entitet;
import evidencija.util.EvidencijaException;
import evidencija.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author petar
 */
public abstract class Obrada <T extends Entitet> {
    protected T entitet;
    protected Session session;
    public abstract List<T> read();
    protected abstract void kontrolaUnos() throws EvidencijaException;
    protected abstract void kontrolaPromjena() throws EvidencijaException;
    protected abstract void kontrolaBrisanje() throws EvidencijaException;
    
    public Obrada() {
        session = HibernateUtil.getSession();
    }

    public Obrada(T entitet) {
        this();
        this.entitet = entitet;
        
    }
    
    public void create() throws EvidencijaException{
        kontrolaNull();
        entitet.setSifra(null);
        kontrolaUnos();
        persist();
    }
    
    public void update() throws EvidencijaException{
        kontrolaNull();
        kontrolaPromjena();
        persist();
    }
    
    public void delete() throws EvidencijaException{
        kontrolaNull();
        kontrolaBrisanje();
        session.beginTransaction();
        session.remove(entitet);
        session.getTransaction().commit();
    }
    
    private void persist(){
        session.beginTransaction();
        session.persist(entitet);
        session.getTransaction().commit();
    }
    
    private void kontrolaNull() throws EvidencijaException{
       if(entitet==null){
            throw new EvidencijaException("Entitet je null");
        } 
       
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
            
    
}

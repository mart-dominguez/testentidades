/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.testentidades.bean;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.martin.testentidades.ClaveQ;
import org.martin.testentidades.ClaveR;
import org.martin.testentidades.EntidadQ;
import org.martin.testentidades.EntidadR;

/**
 *
 * @author mdominguez
 */
@ApplicationScoped
@Named("miTestBean")
@Transactional
public class TestBean {
    
    @PersistenceContext(unitName = "testpu")
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    private List<EntidadQ> entidades1;
    private List<EntidadR> entidades2;

    private EntidadQ entidad1;
    private EntidadR entidad2;
    
    public String cargarEntidades(){
        ClaveQ cq = new ClaveQ();
        cq.setPk1(1);
        cq.setPk1(1);
        EntidadQ eq1 =em.find(EntidadQ.class, cq);
        System.out.println(eq1);
        entidad1=eq1;
        ClaveR cr = new ClaveR();
        cr.setC(3);
        cr.setEntidadQ(entidad1);
        EntidadR er1 =em.find(EntidadR.class, cr);
        System.out.println(er1);
        entidad2=er1;
        return null;
    }
    
    
}

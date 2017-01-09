/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.testentidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 *
 * @author mdominguez
 */
@Embeddable
public class ClaveR  implements Serializable{
    
    @Column(name = "A")
    private Integer C;
    
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name="D", referencedColumnName = "C", insertable = false, updatable = false ),
        @JoinColumn(name="E", referencedColumnName = "E", insertable = false, updatable = false)
    })
    private EntidadQ entidadQ;

    public Integer getC() {
        return C;
    }

    public void setC(Integer C) {
        this.C = C;
    }

    public EntidadQ getEntidadQ() {
        return entidadQ;
    }

    public void setEntidadQ(EntidadQ entidadQ) {
        this.entidadQ = entidadQ;
    }
    
}

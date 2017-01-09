/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.testentidades;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 *
 * @author mdominguez
 */
@Embeddable
public class ClaveR  implements Serializable{
    
    @Column(name = "C")
    private Integer C;
    
    @Embedded
   @AttributeOverrides({
        @AttributeOverride(name="pk1",
                           column=@Column(name="D")),
        @AttributeOverride(name="pk2",
                           column=@Column(name="E"))
    })
    private ClaveQ claveq;

    public ClaveQ getClaveq() {
        return claveq;
    }

    public void setClaveq(ClaveQ claveq) {
        this.claveq = claveq;
    }
    
    public Integer getC() {
        return C;
    }

    public void setC(Integer C) {
        this.C = C;
    }

        
}

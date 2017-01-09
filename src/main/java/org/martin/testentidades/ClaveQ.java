/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.testentidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author mdominguez
 */
@Embeddable
public class ClaveQ  implements Serializable{
    

 
    @Column(name = "A")
    private Integer pk1;
 
    @Column(name = "B")
    private Short pk2;

    public Integer getPk1() {
        return pk1;
    }

    public void setPk1(Integer pk1) {
        this.pk1 = pk1;
    }

    public Short getPk2() {
        return pk2;
    }

    public void setPk2(Short pk2) {
        this.pk2 = pk2;
    }
 

}

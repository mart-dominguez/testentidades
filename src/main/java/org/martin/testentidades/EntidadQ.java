/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.testentidades;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mdominguez
 */
@Entity
@Table(name = "TABLA_Q")
public class EntidadQ {
    @EmbeddedId
    private ClaveQ clave;
    private Integer data;

    public ClaveQ getClave() {
        return clave;
    }

    public void setClave(ClaveQ clave) {
        this.clave = clave;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

        
    
}

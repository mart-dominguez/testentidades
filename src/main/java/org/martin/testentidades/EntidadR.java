/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.testentidades;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

/**
 *
 * @author mdominguez
 */
@Entity
@Table(name = "TABLA_R")
public class EntidadR {
    @EmbeddedId
    private ClaveR clave;
    
    @MapsId("claveq")
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "D", referencedColumnName = "A"),
        @JoinColumn(name = "E", referencedColumnName = "B"),
    })
    private EntidadQ entidadQ;
    
    @Column(name = "DATA2")
    private Integer data;

    public ClaveR getClave() {
        return clave;
    }

    public void setClave(ClaveR clave) {
        this.clave = clave;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
    
    
}

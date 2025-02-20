package com.ProyectoVeranoAudiencia.ProyectoVerano.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "distrito_judicial")
@Data
public class Distrito {

    @Id
    @Column(name = "dis_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int disId;

    @Column (name = "dis_nombre")
    private String disNombre;

    public Distrito(){

    }

    public int getDisId() {
        return disId;
    }

    public void setDisId(int disId) {
        this.disId = disId;
    }

    public String getDisNombre() {
        return disNombre;
    }

    public void setDisNombre(String disNombre) {
        this.disNombre = disNombre;
    }
}
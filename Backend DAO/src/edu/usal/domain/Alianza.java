package edu.usal.domain;

import java.io.Serializable;

public class Alianza implements Serializable {

    private String nombreAlianza;

    public Alianza(String nombre){
        this.nombreAlianza = nombre;
    }

    public String getNombreAlianza() {
        return nombreAlianza;
    }

    public void setNombreAlianza(String nombreAlianza) {
        this.nombreAlianza = nombreAlianza;
    }
}

package edu.usal.dao.interfaces;

import edu.usal.domain.Alianza;

import java.util.ArrayList;

public interface AlianzaDAO {
    static ArrayList<Alianza> alianzasCargadas = new ArrayList<Alianza>();

    public ArrayList<Alianza> ReadList();
    public Alianza BuscarPorNombre(String nombre);
}

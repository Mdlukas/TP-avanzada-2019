package edu.usal.dao.interfaces;

import java.util.ArrayList;
import java.util.List;

import edu.usal.domain.Alianza;
import edu.usal.domain.Provincia;

public interface ProvinciaDAO {


	static ArrayList<Provincia> provinciasCargadas = new ArrayList<Provincia>();

	public ArrayList<Provincia> ReadList();
	public Provincia BuscarPorNombre(String nombre);

}

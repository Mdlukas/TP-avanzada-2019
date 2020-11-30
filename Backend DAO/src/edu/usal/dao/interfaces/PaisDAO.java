package edu.usal.dao.interfaces;

import java.io.IOException;
import java.util.List;

import edu.usal.domain.Pais;

public interface PaisDAO {
	
	
	public Pais ObtenerPais (Pais obtener);
	public List<Pais> listadodePaises () throws IOException, ClassNotFoundException;;
	public void AltadePais(Pais AltaPais)throws IOException, ClassNotFoundException;;
	public void ModificaciondePais (Pais ModificarPais) throws IOException, ClassNotFoundException;;
	public void BajadePais (Pais  BajaPais) throws IOException, ClassNotFoundException;;

	

}

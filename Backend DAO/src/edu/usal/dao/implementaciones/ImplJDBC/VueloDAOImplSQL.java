package edu.usal.dao.implementaciones.ImplJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.usal.dao.interfaces.VueloDAO;
import edu.usal.domain.Aerolinea;
import edu.usal.domain.Aeropuerto;
import edu.usal.domain.Vuelo;
import edu.usal.util.ConexionSQLServer;

public class VueloDAOImplSQL implements VueloDAO {

	@Override
	public Vuelo ConsultadeVuelo(Vuelo obtener) {
		return null;
	}

	
	@Override
	public List<Vuelo> listadodeVuelos() {
		return null;
	}


	@Override
	public void AltadeVuelo(Vuelo alta) {
	}

	@Override
	public void ModificaciondeVuelo(Vuelo modificar) {
	}

	@Override
	public void BajadeVuelo(Vuelo baja) {
	}
	
	

}

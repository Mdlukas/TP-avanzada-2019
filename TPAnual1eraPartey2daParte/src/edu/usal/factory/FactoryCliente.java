package edu.usal.factory;


import java.io.IOException;

import edu.usal.ImplJDBC.ClienteDAOImplSQLStatement;
import edu.usal.ImplStreamYString.ClienteDAOimplSTRING;
import edu.usal.ImplStreamYString.ClienteDAOimplSerializacion;
import edu.usal.dao.interfaces.ClienteDAO;


public class FactoryCliente {
	
	
	
	public static ClienteDAO GetImplementacion(String dao) throws IOException
	{	
		
		if (dao.equals("archivo"))
		{		
		return new ClienteDAOimplSTRING();
		}		
		
		else if (dao.equals("serializacion"))
		{			
			return new ClienteDAOimplSerializacion();
		}
		else if (dao.equals("sql"))
		{
			
			
			return new ClienteDAOImplSQLStatement();
		}
		
		
		
		
		return null;
		
	}

	
	
	/*
	
	public static ClienteDAO getImplementacion() throws FileNotFoundException, IOException
	{
		String source1 = PropertiesUtil.getInstance().getPropertyCliente();
		
		if (source1.equals("archivo"))
		{
			
			return new ClienteDAOimplArchivo();
			
		}else if (source1.equals("serializacion")){
			
			
       return new ClienteDAOimplSerializacion();
			
		}
		
		return null;
			
		
	}
	
	*/
	

}

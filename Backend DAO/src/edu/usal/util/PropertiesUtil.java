package edu.usal.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	private static Properties properties;

	
	public static String getString (String string)
	{
			InputStream input;
			properties = new Properties ();
			try {
			//input = new FileInputStream ("config.properties"); //para DAO
			input = PropertiesUtil.class.getClassLoader().getResourceAsStream("config.properties");  //para MVC
				if (input != null) {
					properties.load(input);
				}
				input.close();
				return properties.getProperty(string);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
	}
	
	
	
	
	
}
	
	/*
	private static Properties properties = new Properties();
	private static PropertiesUtil objeto = null;
	
	
	private PropertiesUtil () throws FileNotFoundException, IOException
	{
		
		properties.load(new FileReader("Config.Properties"));
		
		
	}
	
	
	public static PropertiesUtil getInstance() throws FileNotFoundException, IOException
	{
		  if ( objeto == null)
		  {
		
			  objeto = new PropertiesUtil();			  
		  }
		
		
		return objeto;
	}
	
	
	public String getPropertyCliente()
	{
	
		return properties.getProperty("pathCliente");
	}
	*/
	



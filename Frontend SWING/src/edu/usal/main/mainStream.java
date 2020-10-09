package edu.usal.main;




import edu.usal.controlador.consola.ControladorClienteStream;
import edu.usal.vista.consola.VistaClienteStream;

public class mainStream {

	
	public static void main(String[] args) {
		
		
		VistaClienteStream vista = new VistaClienteStream();
		
		
	   ControladorClienteStream controladorcliente = new ControladorClienteStream(vista);
	
	    	 
			controladorcliente.MiMenu();
	}

	
	
	
	
	
	
	
	
	
}

package edu.usal.domain;

public enum TipoPago {
	

	tarjetaCredito,tarjetaDebito,Efectivo;
	public static String getPago(String Modo) {
		
		if ( Modo.equalsIgnoreCase("Tarjeta de Credito"))
		{
			
			return "TipoPago.tarjetaCredito;";
		}
		
		else if (Modo.equalsIgnoreCase("Tarjeta de Debito"))
		 {
			 
			return "TipoPago.tarjetaDebito;";
		}
		
		else if (Modo.equalsIgnoreCase("Efectivo"))
		{
			
			return "TipoPago.Efectivo;";
			
		}
		return null;
	
	
	}
	
	
	
	

}

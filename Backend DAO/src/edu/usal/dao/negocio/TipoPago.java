package edu.usal.dao.negocio;

public enum TipoPago {
	

	tarjetaCredito,tarjetaDebito,Efectivo;
	public static TipoPago getPago(String Modo) {
		
		if ( Modo.equalsIgnoreCase("Tarjeta de Credito"))
		{
			
			return TipoPago.tarjetaCredito;
		}
		
		else if (Modo.equalsIgnoreCase("Tarjeta de Debito"))
		 {
			 
			return TipoPago.tarjetaDebito;	
		}
		
		else if (Modo.equalsIgnoreCase("Efectivo"))
		{
			
			return TipoPago.Efectivo;
			
		}
		return null;
	
	
	}
	
	
	
	

}

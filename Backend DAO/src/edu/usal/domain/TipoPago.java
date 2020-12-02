package edu.usal.domain;

public enum TipoPago {


    tarjetaCredito, tarjetaDebito, Efectivo;

    public static String getPago(String Modo) {

        if (Modo.equalsIgnoreCase("Credito")) {
            return "Tarjeta de Credito";
        } else if (Modo.equalsIgnoreCase("Debito")) {

            return "Tarjeta de Debito";
        } else if (Modo.equalsIgnoreCase("Efectivo")) {

            return "Efectivo";

        }
        return null;


    }


}

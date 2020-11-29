package edu.usal.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexionSQLServer {

    public static EntityManagerFactory entityManagerFactory = null;


    //Inicializo la conexion al server sql!
    public static EntityManagerFactory ConnectToSqlDatabase(){
        try{
            System.out.println("Inicializando conexion a la base de datos!");
            entityManagerFactory = Persistence.createEntityManagerFactory("PersistenciaAerolineas");
            System.out.println("Se ha podido conectar de forma correcta!");
            return entityManagerFactory;
        } catch (Exception e){
            System.out.println("Ocurrio un problema al realizar la conexion a la base de datos!");
            e.printStackTrace();
            return null;
        }
    }

}

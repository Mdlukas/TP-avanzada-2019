package edu.usal.util;

import java.io.*;
import java.util.ArrayList;

public class FileHelper {

    // Metodo escribir un texto simple
    public static boolean EscribirArchivo(String texto, String path, boolean continuarAbajo) {
        File f1 = new File(path);
        try {
            if (!f1.exists()) {
                f1.createNewFile();
            }
            FileWriter fw = new FileWriter(f1, continuarAbajo);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(texto + "");
            pw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Metodo que toma una ArrayList de Strings, lo convierte a solamente un String separado por simbolos.
    public static boolean EscribirArchivoObjetoConAtributos(ArrayList<String> atribs, String separador,
                                                            String path, boolean continuarAbajo) {
        File f1 = new File(path);
        try {
            if (!f1.exists()) {
                f1.createNewFile();
            }
            FileWriter fw = new FileWriter(f1, continuarAbajo);
            PrintWriter pw = new PrintWriter(fw);
            String cadena = "";
            for (String str : atribs) {
                cadena = cadena + str + ";";
            }
            pw.print(cadena + "\n");
            pw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Usado para escribir una lista de strings!
    public static boolean EscribirArchivo(ArrayList<String> listaTextos, String ruta, boolean continuarAbajo) {
        File f1 = new File(ruta);
        try {
            if (!f1.exists()) {
                f1.createNewFile();
            }
            FileWriter fw = new FileWriter(f1, continuarAbajo);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String string : listaTextos) {
                bw.write(string + "\n");
            }
            bw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Metodo leer una sola linea de texto de un archivo.
    public static String LeerArchivo(String ruta) {
        File f2 = new File(ruta);
        try {
            if (!f2.exists()) {
                return null;
            }
            FileReader fr = new FileReader(f2);
            BufferedReader br = new BufferedReader(fr);
            String linea = null;
            linea = br.readLine();
            br.close();
            fr.close();
            return linea;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Metodo leer una lista de textos simples de un archivo
    public static ArrayList<String> LeerArchivoLista(String ruta) {
        File f2 = new File(ruta);
        try {
            if (!f2.exists()) {
                return null;
            }
            FileReader fr = new FileReader(f2);
            BufferedReader br = new BufferedReader(fr);
            ArrayList<String> lista = new ArrayList<String>();
            String linea = null;
            while (br.ready()) {
                linea = br.readLine();
                lista.add(linea);
            }
            br.close();
            fr.close();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo leer la lista del archivo: " + ruta);
            return  null;
        }
    }

}

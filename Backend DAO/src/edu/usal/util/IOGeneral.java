package edu.usal.util;
import java.util.*;

public class IOGeneral {
	
	public static void pritln(String frase){
		System.out.println(frase);
	}
	
	public static int leerInt(String msjInicio, String msjError){
		IOGeneral.pritln(msjInicio);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(!scan.hasNextInt()){
			IOGeneral.pritln(msjError);
			scan.next();
		}
		return scan.nextInt();
	}
	
	public static float leerFloat(String msjInicio, String msjError){
		IOGeneral.pritln(msjInicio);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(!scan.hasNextFloat()){
			IOGeneral.pritln(msjError);
			scan.next();
		}
		return scan.nextFloat();
	}
	
	public static double leerDouble(String msjInicio, String msjError){
		IOGeneral.pritln(msjInicio);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		while(!scan.hasNextDouble()){
			IOGeneral.pritln(msjError);
			scan.next();
		}
		return scan.nextDouble();
	}
	
	public static String leerLinea(String msjInicio){
		IOGeneral.pritln(msjInicio);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
	
	public static String leerFrase(String msjInicio){
		IOGeneral.pritln(msjInicio);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		return scan.next();
	}

}

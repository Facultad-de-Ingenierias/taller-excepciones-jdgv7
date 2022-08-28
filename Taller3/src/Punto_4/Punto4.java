package Punto_4;

import java.util.Scanner;

import Punto_2.Cine;

import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Punto4{
	
	public String punto4() {
		String _return = "1";

	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Escriba una url");

	    try {
	        String url = scanner.next();
	        URL request = new URL(url);
	        URLConnection connection = (URLConnection) request.openConnection();
	        connection.connect();
	        String contentTypeRaw = connection.getContentType();
	        String[] contentType = contentTypeRaw.split(";");

	        System.out.println("Tipo de Contenido: " + contentType[0]);
	        _return = contentType[0];

	    } catch (UnknownHostException e) {
	        _return = "No se puede obtener la informacion vinculada a la URL";
	    } catch (Exception e) {
	        _return = "No se puede obtener la informacion vinculada a la URL, el error es " + e.getMessage();
	    }

	    return _return;
	}
	
	public static void main(String[] args){
        Punto4 ejemplo = new Punto4();
        System.out.println(ejemplo.punto4());
        
    }
	
}
package es.cice.tutorialjava.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class LeerURLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String urlSt = "http://www.mit.edu";
		
		try {
			URL url = new URL(urlSt);
			
			URLConnection con = url.openConnection();
			InputStream in = con.getInputStream();
			
			// Si no encauzamos los bytes como caracteres la lectura no es legible 
			/*
			int byteLeido;
			System.out.println("Iniciando la lectura Byte...");
			while ((byteLeido = in.read()) != -1) {
				System.out.print(byteLeido);
			}
			System.out.println();
			System.out.println("Lectura Byte finalizada.");
			*/
			
			// Con esta clase traducimos los bytes a caracteres.
			String line;
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			System.out.println("Iniciando la lectura Character...");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("Lectura Character finalizada.");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

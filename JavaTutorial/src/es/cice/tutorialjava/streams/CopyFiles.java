package es.cice.tutorialjava.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pathSeparator = System.getProperty("file.separator");
		
		File f = new File("src" + pathSeparator +
						  "es" + pathSeparator +
						  "cice" + pathSeparator +
						  "tutorialjava" + pathSeparator +
						  "ArrayTest.java");
		
		if (f.exists()) {
			// "try" con recursos aparecen en java 8).
			// Todos los objetos que se icluyan se cierran al final de la ejecución del "try" (no es necesario un "finally")
			try(
				InputStream in_B = new FileInputStream(f);
				OutputStream out_B = new FileOutputStream("copy_Byte.txt");
				InputStream in_K = new FileInputStream(f);
				OutputStream out_K = new FileOutputStream("copy_Kbyte.txt")	) {
				
				int byteLeido;
				System.out.println("Iniciando la copia Byte...");
				while ((byteLeido = in_B.read()) != -1) {
					out_B.write(byteLeido);
				}
				System.out.println("Copia Byte finalizada.");
				
				int bytesLeidos = 0;
				byte[] buffer = new byte[1024];
				System.out.println("Iniciando la copia Kbyte...");
				do {
					bytesLeidos = in_K.read(buffer);
					if (bytesLeidos > 0) {
						out_K.write(buffer, 0, bytesLeidos);
					}
				}
				while (bytesLeidos == buffer.length);
				System.out.println("Copia Kbyte finalizada.");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}

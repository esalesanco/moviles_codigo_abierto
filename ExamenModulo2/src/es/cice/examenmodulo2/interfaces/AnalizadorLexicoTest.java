package es.cice.examenmodulo2.interfaces;

import java.io.FileNotFoundException;

public class AnalizadorLexicoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			AnalizadorLexicoFile alFile = new AnalizadorLexicoFile("analizadorlexico.txt");
			alFile.print();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

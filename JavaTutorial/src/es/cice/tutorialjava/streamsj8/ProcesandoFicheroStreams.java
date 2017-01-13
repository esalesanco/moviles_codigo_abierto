package es.cice.tutorialjava.streamsj8;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class ProcesandoFicheroStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Ejemplo 1:");
			Files.lines(Paths.get("palabras2.txt")). // Emite una notificacion (del stream) por cada linea
			filter(line->line.length()>10).
			forEach(line->System.out.println(line));

			System.out.println("Ejemplo 2:");
			Files.lines(Paths.get("palabras2.txt")).
			map(line->line.length()).
			forEach(length->System.out.println("Longitud: " + length));
			
			System.out.println("Ejemplo 3:");
			// En una expresion regular el espacio en blanco se representa como '\s'
			String[] tokens = "Luis Manuel  bla 24 67 juan 23,6 89".split("\\s+");
			
			/*
			for (String token : tokens) {
				System.out.println(token);
			}
			*/
			
			Stream.of(tokens).
			forEach(token->System.out.println(token));

			System.out.println("Ejemplo 4:");
			Serializable res =
					Files.lines(Paths.get("palabras2.txt")).
					flatMap(line->Stream.of(line.split("\\s+"))). // Un flatMap agrupa todo los streams en un solo stream (tenemos todos los token desglosados)
					filter(token->{
									try {
										Double.parseDouble((String) token);
										return true;
									}catch (NumberFormatException e){
										return false;
									}
								  }). // Se filtran los que no son numericos
					mapToDouble(x->Double.parseDouble(x.toString())). // Convierte los elementos que emite el Stream de Serializables a Doubles.
					//forEach(token->System.out.println(token)); // Imprime solo los valores numericos
					reduce(0,(x, y)->x+y); // Se suman los numericos. "reduce" ya no forma un stream, lo reduce a un unico valor.
			System.out.println("Resultado: " + res);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

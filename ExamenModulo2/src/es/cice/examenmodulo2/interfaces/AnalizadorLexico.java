package es.cice.examenmodulo2.interfaces;

import java.util.Map;

public interface AnalizadorLexico {
	/**
	*@return el numero de palabras de la fuente de datos
	*/
	public int getNumeroPalabras();
	/**
	*@return el numero de lineas de la fuente de datos
	*/
	public int getNumeroLineas();
	/**
	*@return el un mapa con el numero de veces que aparece cada palabra en la fuente de
	datos
	*/
	public Map<String,Integer> getMapaPalabras();
}

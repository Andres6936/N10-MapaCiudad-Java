package edu.jabs.mapaCiudad.mundo;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Esta es una clase abstracta que representa a una carretera
 */
public abstract class Carretera extends Construccion
{

	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------
	/**
	 * Constante para definir el alto de la carretera.
	 */
	public static final int ALTO_CARRETERA = 40;
	/**
	 * Constante para definir el ancho de la carretera.
	 */
	public static final int ANCHO_CARRETERA = 40;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Crea la carretera con los valores especificados
	 * 
	 * @param x Coordenada x de la carretera
	 * @param y Coordenada y de la carretera
	 * @param colorFondo color de fondo de la carretera
	 */
	public Carretera( int x, int y, Color colorFondo )
	{
		super( x, y, ALTO_CARRETERA, ANCHO_CARRETERA, colorFondo );
	}

	/**
	 * Construye una carretera a partir de los datos contenidos en un archivo
	 * 
	 * @param br Es el stream que sirve para leer el archivo
	 * @throws IOException Se lanza esta excepción si hay problemas leyendo el
	 *             archivo
	 * @throws FormatoInvalidoExcepcion Se lanza esta excepción si el formato del
	 *             archivo no es el esperado
	 */
	public Carretera( BufferedReader br ) throws IOException, FormatoInvalidoExcepcion
	{
		super( br );
		alto = ALTO_CARRETERA;
		ancho = ANCHO_CARRETERA;
	}
}
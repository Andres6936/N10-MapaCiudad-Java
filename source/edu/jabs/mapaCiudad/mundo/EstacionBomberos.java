package edu.jabs.mapaCiudad.mundo;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Esta es una clase que representa una estación de bomberos
 */
public class EstacionBomberos extends Edificacion
{
	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------
	/**
	 * Constante para definir donde se define la imagen de la Estación de Bomberos.
	 */
	public final static String FIGURA_ESTACION_BOMBEROS = "estacionBomberos.gif";
	/**
	 * Constante para definir donde se define el alto de la Estación de Bomberos.
	 */
	public final static int ALTO_ESTACION_BOMBEROS = 160;
	/**
	 * Constante para definir donde se define el ancho de la Estación de Bomberos.
	 */
	public final static int ANCHO_ESTACION_BOMBEROS = 200;
	/**
	 * Constante para definir el tipo Estación de Bomberos.
	 */
	public final static String TIPO = "ESTACION_BOMBEROS";

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Crea la estación con los valores especificados
	 * 
	 * @param x Coordenada x de la estación
	 * @param y Coordenada y de la estación
	 * @param colorFondo color de fondo de la estación
	 */
	public EstacionBomberos( int x, int y, Color colorFondo )
	{
		super( x, y, ALTO_ESTACION_BOMBEROS, ANCHO_ESTACION_BOMBEROS, colorFondo, FIGURA_ESTACION_BOMBEROS );
	}

	/**
	 * Construye una estación a partir de los datos contenidos en un archivo
	 * 
	 * @param br Es el stream que sirve para leer el archivo
	 * @throws IOException Se lanza esta excepción si hay problemas leyendo el
	 *             archivo
	 * @throws FormatoInvalidoExcepcion Se lanza esta excepción si el formato del
	 *             archivo no es el esperado
	 */
	public EstacionBomberos( BufferedReader br ) throws IOException, FormatoInvalidoExcepcion
	{
		super( br, FIGURA_ESTACION_BOMBEROS );
		alto = ALTO_ESTACION_BOMBEROS;
		ancho = ANCHO_ESTACION_BOMBEROS;
	}

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	/**
	 * Retorna el tipo de la estación
	 * 
	 * @return El tipo de la estación
	 */
	public String darTipo( )
	{
		return TIPO;
	}
}
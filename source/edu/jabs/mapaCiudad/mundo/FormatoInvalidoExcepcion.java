package edu.jabs.mapaCiudad.mundo;

/**
 * Esta Excepción se lanza si hay un problema con el formato del archivo leído
 */
public class FormatoInvalidoExcepcion extends Exception
{
	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Construye la excepción
	 * 
	 * @param linea La línea que tiene un formato inválido
	 */
	public FormatoInvalidoExcepcion( String linea )
	{
		super( "El formato de la línea es inválido:" + linea );
	}
}
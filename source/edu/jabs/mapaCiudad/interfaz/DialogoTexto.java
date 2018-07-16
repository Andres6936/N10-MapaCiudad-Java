package edu.jabs.mapaCiudad.interfaz;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JDialog;

/**
 * Es el diálogo para modificar el texto y la fuente de una construcción
 */
public class DialogoTexto extends JDialog
{
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Es una referencia a la clase principal de la interfaz
	 */
	private InterfazMapaCiudad principal;

	// -----------------------------------------------------------------
	// Atributos de la Intefaz
	// -----------------------------------------------------------------

	/**
	 * El panel donde se modifica el texto y la fuente usada en una construccion
	 */
	private PanelModificarTexto panelModificar;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Construye el diálogo para modificar el texto y la fuente de una construccion
	 * 
	 * @param ip Interfaz principal de la aplicación
	 * @param texto Es el texto que se escribirá sobre la construcción
	 * @param fuente Es la fuente que se usará para el texto de la construcción
	 * @param nombre Es el nombre del dialogo
	 * 
	 */
	public DialogoTexto( InterfazMapaCiudad ip, String texto, Font fuente, String nombre )
	{
		super( ip, nombre, true );

		principal = ip;

		// Averiguar cuales son las fuentes disponibles en el sistema
		String[ ] nombresFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment( ).getAvailableFontFamilyNames( );

		ArrayList listaFuentes = new ArrayList( );
		for ( int i = 0; i < nombresFuentes.length; i++ )
		{
			listaFuentes.add( nombresFuentes[ i ] );
		}

		// Construir el panel y mostrar el diálogo
		panelModificar = new PanelModificarTexto( this, listaFuentes );
		add( panelModificar );
		panelModificar.cambiarTexto( texto, fuente );

		setSize( 350, 180 );
		centrarVentana( );
	}

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	/**
	 * Cambia la fuente mostrada
	 * 
	 * @param texto El texto de la construcción
	 * @param fuente La fuente con que se va a escribir el texto
	 */
	public void cambiarTexto( String texto, Font fuente )
	{
		principal.cambiarTexto( texto, fuente );
		setVisible( false );
		dispose( );
	}

	/**
	 * Centra la ventana en la pantalla
	 */
	private void centrarVentana( )
	{
		Dimension pantalla = Toolkit.getDefaultToolkit( ).getScreenSize( );
		setLocation( (int) (pantalla.getWidth( ) / 2 - getWidth( ) / 2),
				(int) (pantalla.getHeight( ) / 2 - getHeight( ) / 2) );
	}

}
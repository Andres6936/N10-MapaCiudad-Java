package edu.jabs.mapaCiudad.interfaz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Panel de manejo de extensiones
 */
public class PanelExtension extends JPanel implements ActionListener
{

	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------

	/**
	 * Comando Opción 1
	 */
	private static final String OPCION_1 = "OPCION_1";

	/**
	 * Comando Opción 2
	 */
	private static final String OPCION_2 = "OPCION_2";

	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Ventana principal de la aplicación
	 */
	private InterfazMapaCiudad principal;

	// -----------------------------------------------------------------
	// Atributos de interfaz
	// -----------------------------------------------------------------

	/**
	 * Botón Opción 1
	 */
	private JButton btnOpcion1;

	/**
	 * Botón Opción 2
	 */
	private JButton btnOpcion2;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Constructor del panel
	 * 
	 * @param elPadre Ventana principal
	 */
	public PanelExtension( InterfazMapaCiudad elPadre )
	{
		principal = elPadre;

		setBorder( new TitledBorder( "Opciones" ) );
		setLayout( new FlowLayout( ) );

		// Botón opción 1
		btnOpcion1 = new JButton( "Opción 1" );
		btnOpcion1.setActionCommand( OPCION_1 );
		btnOpcion1.addActionListener( this );
		add( btnOpcion1 );

		// Botón opción 2
		btnOpcion2 = new JButton( "Opción 2" );
		btnOpcion2.setActionCommand( OPCION_2 );
		btnOpcion2.addActionListener( this );
		add( btnOpcion2 );
	}

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	/**
	 * Manejo de los eventos de los botones
	 * 
	 * @param e Acción que generó el evento.
	 */
	public void actionPerformed( ActionEvent e )
	{
		if ( OPCION_1.equals( e.getActionCommand( ) ) )
		{
			principal.reqFuncOpcion1( );
		}
		else if ( OPCION_2.equals( e.getActionCommand( ) ) )
		{
			principal.reqFuncOpcion2( );
		}
	}

}
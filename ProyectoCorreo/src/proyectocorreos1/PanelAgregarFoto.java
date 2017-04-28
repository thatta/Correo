/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocorreos1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
* @Juan David Ojeda Bernal
 * @Tatiana Almansa
 */
public class PanelAgregarFoto extends JPanel {
    
    private JLabel Imagen;
    private JLabel imagenPrincipal;
    private VentanaPrincipal ventana;
    
    public PanelAgregarFoto(VentanaPrincipal ventana){
        this.ventana= ventana;
        
        FlowLayout layout = new FlowLayout( );
        layout.setHgap( 0 );
        layout.setVgap( -25 );
        setLayout( layout );
        
        ImageIcon icono = new ImageIcon( "src/ImagenPrincipal/yes.jpeg" );
        
        imagenPrincipal = new JLabel( "" );
        imagenPrincipal.setIcon( icono );
        add( imagenPrincipal );
        
        setBackground( Color.black );
        setBorder( new LineBorder( Color.ORANGE ) );
    }
    
    
}


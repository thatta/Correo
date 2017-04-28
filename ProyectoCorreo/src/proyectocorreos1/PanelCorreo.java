/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocorreos1;

/**
 *
 * @author HP
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
* @Juan David Ojeda Bernal
 * @Tatiana Almansa
 */
public class PanelCorreo extends JPanel implements ActionListener{
  
    
    JButton BCorreo;
    private VentanaPrincipal principal;
    private DialogoVistaCorreos dialogcorr;
    
    public PanelCorreo(VentanaPrincipal principal) {
         this.principal = principal;
         setBorder(BorderFactory.createTitledBorder("Correo"));
         setLayout(null);
         
         BCorreo = new JButton("Ver Correos");
         BCorreo.setFont(new Font("Serif", Font.BOLD, 18));
         BCorreo.addActionListener(this);
         BCorreo.setBounds(130, 10, 150, 20);
         add(BCorreo);
         
        setBackground( Color.BLACK );
        setBorder( new LineBorder( Color.ORANGE ) );
        
         dialogcorr = new DialogoVistaCorreos(this.principal);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dialogcorr.actualizarTablacORREOS();
        dialogcorr.setVisible(true);
    }
    
    
    
}

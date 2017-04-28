/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocorreos1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
* @Juan David Ojeda Bernal
 * @Tatiana Almansa
 */
public class AgregarPersona extends JPanel implements ActionListener{
    
    JLabel LNombre, LGenero, LNacionalidad;
    JTextField JTNombre;
    JComboBox CMGenero, CBNacionalidad;
    JButton BGuardar;
    
    private List<Persona> listaArtista;
    private Persona artista;
    private VentanaPrincipal ventana;
            
    public AgregarPersona(VentanaPrincipal ventana) {
         this.ventana = ventana;
         setBorder(BorderFactory.createTitledBorder("REGISTRAR PERSONA"));
         setLayout(null);
         listaArtista = new ArrayList<Persona>();
         
         LNombre = new JLabel ("Nombre:");
         LGenero = new JLabel ("Genero:");
        
         
         LNombre.setBounds(30, 30, 100, 20);
         LNombre.setForeground(Color.WHITE);
         add(LNombre);
         
         LGenero.setBounds(30, 54, 100, 20);
         LGenero.setForeground(Color.WHITE);
         add(LGenero);

         
         JTNombre = new JTextField();
         JTNombre.setBounds(140, 30, 150, 20);
         add(JTNombre);
         
         CMGenero = new JComboBox(Genero.values());
         CMGenero.setBounds(140, 54, 150, 20);
         add(CMGenero);

      
         
         BGuardar = new JButton("Guardar");
         BGuardar.setBounds(140, 75, 150, 20);
         BGuardar.addActionListener(this);
         add(BGuardar);
         
         setBackground( Color.black );
         setBorder( new LineBorder( Color.ORANGE ) );
        
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
         if(validarDatosArtista()){
            artista = new Persona(JTNombre.getText(), ((Genero) CMGenero.getSelectedItem()));
            listaArtista.add(artista);
            JOptionPane.showMessageDialog(null, "Nombre y Genero enlistado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            vaciarDatos();
          
            
       }
    }
    
    private void vaciarDatos() {
        JTNombre.setText("");
        LNombre.setForeground(Color.BLACK);
        CMGenero.setSelectedIndex(0);
        CBNacionalidad.setSelectedIndex(0);
    }
    
    private boolean validarDatosArtista() {
        if(JTNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LNombre.setForeground(Color.red);
            return false;
        } else if(CMGenero.getSelectedItem() == Genero.SELECCIONE) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un genero.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false;        
        }  
        
        return true;
    }

    public List<Persona> getListaArtista() {
        return listaArtista;
    }
    
    
}

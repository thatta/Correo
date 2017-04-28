/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocorreos1;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


/**
 *
 * @Juan David Ojeda Bernal
 * @Tatiana Almansa
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
    
    private AgregarPersona panel1;
    private AgregarCorreo panel2;
    private PanelPersonas panel3;
    private JMenuBar menuBar;
    private JMenu MFile;
    private JMenu MEdit;
    private JMenuItem MNewProject;
    private JMenuItem MNewFile;
    private JMenuItem MNexit;
    private JMenuItem MUndo;
    private JMenuItem ayuda;
    private JPanel jpanel;
    private PanelCorreo panelcorreo;
    private PanelAgregarFoto panFot;
    
    
    private static final String PERSONAS_REGISTRADAS = "PERSONAS REGISTRADAS";
    private static final String CORREOS_REGISTRADOS = "CORREOS REGISTRADOS";
    private static final String CREADORES_PROGRAMA = "CREADORES";
    private static final String AYUDA = "AYUDA";
    private static final String EXIT = "EXIT";
    
        
    public VentanaPrincipal() {
        setSize(800, 280);
        setTitle("REGISTRO DE PERSONAS");
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        panFot = new PanelAgregarFoto(this);
        panFot.setBounds(320, 85, 430, 130);
        add(panFot, BorderLayout.SOUTH);
        
        panel1 = new AgregarPersona(this);
        panel1.setBounds(10, 10, 300, 115);
        add(panel1);
        
        panel2 = new AgregarCorreo(this);
        panel2.setBounds(10, 130, 300, 85);
        add(panel2);
        
        panel3 = new PanelPersonas(this);
        panel3.setBounds(320, 10, 430, 33);
        add(panel3);
        
        panelcorreo = new PanelCorreo(this);
        panelcorreo.setBounds(320, 45, 430, 33);
        add(panelcorreo);
        
      
        
        
        
        
        
        menuBar = new JMenuBar();    
        setJMenuBar(menuBar);
        
        
        MFile = new JMenu("Registros");
        MFile. setBackground( Color.CYAN );
        
        MNewProject = new JMenuItem("PERSONAS REGISTRADAS");
        MNewProject.setActionCommand(PERSONAS_REGISTRADAS);
        MNewProject.setBorder( new LineBorder( Color.black ) );
        MNewProject.addActionListener(panel3);
        MNewFile = new JMenuItem("CORREOS REGISTRADOS");
        MNewFile.setActionCommand(CORREOS_REGISTRADOS);
        MNewFile.setBorder( new LineBorder( Color.black ) );
        MNewFile.addActionListener(panelcorreo);
        MNexit = new JMenuItem("Exit");
        MNexit.setActionCommand(EXIT);
        MNexit.setBorder( new LineBorder( Color.black ) );
        MNexit.addActionListener(this);
        
        MFile.add(MNewProject);
        MFile.add(MNewFile);
        MFile.add(MNexit);
        menuBar.add(MFile);
        
        MEdit = new JMenu("Informacion");
        
        MUndo = new JMenuItem("INFORMACION");
        MUndo.setActionCommand(CREADORES_PROGRAMA);
        MUndo.setBorder( new LineBorder( Color.RED) );
        MUndo.addActionListener(this);
        ayuda = new JMenuItem("AYUDA");
        ayuda.setActionCommand(AYUDA);
        ayuda.setBorder( new LineBorder( Color.RED) );
        ayuda.addActionListener(this);
        
        MEdit.add(MUndo);
        MEdit.add(ayuda);
        menuBar.add(MEdit);
        
        
        
        
        setVisible(true);
        
    }

    public AgregarPersona getPanel1() {
        return panel1;
    }

    public AgregarCorreo getPanel2() {
        return panel2;
    }

    public PanelPersonas getPanel3() {
        return panel3;
    }

    public PanelCorreo getPanelcorreo() {
        return panelcorreo;
    }

    public PanelAgregarFoto getPanFot() {
        return panFot;
    }
        

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(PERSONAS_REGISTRADAS)) {
            panel3.BVista.addActionListener(panel1);
        } else if(e.getActionCommand().equals(CORREOS_REGISTRADOS)) {
               panelcorreo.BCorreo.addActionListener(panel1);
        }else if(e.getActionCommand().equals(CREADORES_PROGRAMA)) {
               JOptionPane.showMessageDialog(this, "AUTORES: \n Juan David Ojeda Bernal \n Karen Tatiana Almansa Jimenez");
               }else if(e.getActionCommand().equals(AYUDA)) {
               JOptionPane.showMessageDialog(this, "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::MODO DE USO::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::  \n 1.Al ingresar el Email se verificará si es un correo autentico. \n 2.Si es verdadero, la etiqueta correo cambiará a color verde. \n 3. si es falso, la etiqueta correo se podra de color rojo y pedira que ingrese de nuevo el correo. \n 4.si el correo es correcto, la información se guardará en un listado que se encuentra en la barra de menú en la opcion Registros/REGISTRO CORREOS. \n 5.Al igual que el correo, en el panel Registro Personas se debe agregar nombre y seleccionar genero. \n 6.Si la anterior condicion no se cumple, la etiqueta nombre se pondrá en rojo como prueba de que el nombre no ha sido ingresado. \n 7.Si el nombre que ingresó y el genero seleccionado son validos, la etiqueta nombre se pondrá de color verde. \n 8.al darle guardar la informacion quedará guardada en una lista en barra de menú Registros/REGISTRO PERSONAS. \n 9.Si aparece la información y desea salir, oprime EXIT en la barra de menú. \n 10.los autores del programa se pueden encontrar en la barra de menú Informacion/INFORMACION. \n ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: GRACIAS POR USAR NUESTROS SERVICIOS:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::   ");
               
            }else if(e.getActionCommand().equals(EXIT)) {
            System.exit(0);
            }
        
        }
    }
      



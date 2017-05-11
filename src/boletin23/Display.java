/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ricky_000
 */
public class Display extends JFrame{
    JLabel name = new JLabel("Nombre: ");
    JTextField texto = new JTextField(20);
    JLabel pass = new JLabel("Password");
    JTextField texto2 = new JTextField(20);
    JButton preme = new JButton("Premer");
    JButton limp = new JButton("Limpar");
    
    public Display() {
        super("Boletin23");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //PANEL LABEL,TEXTFIELD.
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(2,1,10,50);
        panel.setLayout(gl);
        panel.add(name);
        panel.add(texto);
        panel.add(pass);
        panel.add(texto2);
        //PANEL BOTON
        JPanel btnes = new JPanel();
        btnes.setLayout(new FlowLayout());
        btnes.add(preme);
        btnes.add(limp);
        //CONTENEDOR DE PANELES
        Container cp = getContentPane();
        cp.add(panel, BorderLayout.CENTER);
        cp.add(btnes, BorderLayout.SOUTH);
        
     }
    
}

package org.uax.Ecosistema.UI.Registro;

import javax.swing.*;
import java.awt.*;


public class Frame_Registro extends JFrame {
    public Frame_Registro() {
        setTitle("Registro usuario");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container contentPane = getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(null);
        //Botones Inicio
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        button1.setText("Registrar");
        button2.setText("Salir");
        button1.setBounds(50, 150, 100, 30);
        button2.setBounds(160, 150, 100, 30);
        panel.add(button1);
        panel.add(button2);
        //Espacio para registrar
        JTextField Tf1 = new JTextField();
        JPasswordField Tf2 = new JPasswordField();
        Tf1.setBounds(80, 50, 100, 30);
        Tf2.setBounds(80, 90, 100, 30);
        panel.add(Tf1);
        panel.add(Tf2);
        //Titulos de registro
        JLabel text1 = new JLabel("Usuario");
        JLabel text2 = new JLabel("Contraseña");
        text1.setBounds(1, 50, 100, 30);
        text2.setBounds(1, 90, 100, 30);
        panel.add(text1);
        panel.add(text2);
        //Acciones de campo de texto
        // Añadir eventos de texto
        Tf1.getDocument().addDocumentListener(new Eventos_textos(Tf1));
        Tf2.getDocument().addDocumentListener(new Eventos_textos(Tf2));

        // Añadir eventos a botones pasando los componentes reales
        Eventos_botones eventosBotones = new Eventos_botones(Tf1,Tf2,this);
        button1.addActionListener(eventosBotones);
        button2.addActionListener(eventosBotones);
        contentPane.add(panel);
        panel.setBackground(Color.LIGHT_GRAY);

    }

}

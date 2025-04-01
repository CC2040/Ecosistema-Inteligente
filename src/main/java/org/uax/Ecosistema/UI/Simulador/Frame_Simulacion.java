package org.uax.Ecosistema.UI.Simulador;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Frame_Simulacion extends JFrame {
    public Frame_Simulacion() {
        setTitle("Simulacion Ecosistema");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container contentPane = getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(null);
    }
}

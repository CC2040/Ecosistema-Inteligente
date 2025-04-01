package org.uax.Ecosistema.UI.Registro;
import org.uax.Ecosistema.UI.Simulador.Frame_Simulacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Eventos_botones implements ActionListener {
    private final JTextField tusuario;
    private final JPasswordField tpassword;
    private final JFrame frameRegistro;

    public Eventos_botones(JTextField usuario, JPasswordField password,JFrame frameRegistro) {
        this.tusuario = usuario;
        this.tpassword = password;
        this.frameRegistro = frameRegistro;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Registrar")) {
            String usuario = tusuario.getText();
            String contraseña = new String(tpassword.getPassword());

            if(usuario.isEmpty() && contraseña.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
            } else if (usuario.isEmpty() && !contraseña.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Escriba su usuario");
            } else if (!usuario.isEmpty() && contraseña.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Escriba su contraseña");
            } else {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                // Aquí guardarías en tu clase User
                frameRegistro.setVisible(false);
                Frame_Simulacion simulacion = new Frame_Simulacion();
                simulacion.setVisible(true);
            }
        } else if(e.getActionCommand().equals("Salir")) {
            System.exit(0);
        }
    }
}


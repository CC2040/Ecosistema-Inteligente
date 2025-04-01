package org.uax.Ecosistema.UI.Registro;
import javax.swing.text.JTextComponent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;


public class Eventos_textos implements DocumentListener {
    private JTextComponent componente;

    public Eventos_textos(JTextComponent componente) {
        this.componente = componente;
    }

    @Override
    public void insertUpdate(DocumentEvent e) { validar(); }

    @Override
    public void removeUpdate(DocumentEvent e) { validar(); }

    @Override
    public void changedUpdate(DocumentEvent e) {}

    private void validar() {
        if(componente.getText().trim().isEmpty()) {
            componente.setBackground(Color.PINK);
        } else {
            componente.setBackground(Color.WHITE);
        }
    }
}

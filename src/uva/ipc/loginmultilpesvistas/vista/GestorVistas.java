/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uva.ipc.loginmultilpesvistas.vista;

import javax.swing.JFrame;

/**
 *
 * @author mcorrales
 */
public class GestorVistas {

    private JFrame vistaActual;

    public void mostrarVistaLogin() {
        if (vistaActual != null) {
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaLogin();
        vistaActual.setVisible(true);
    }

    public void mostrarVistaCambiarDatos() {
        if (vistaActual != null) {
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaCambiarDatos();
        vistaActual.setVisible(true);
    }

    public void mostrarVistaSeccionRestringida() {
        if (vistaActual != null) {
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaSeccionRestringida();
        vistaActual.setVisible(true);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uva.ipc.loginmultilpesvistas;

import uva.ipc.loginmultilpesvistas.modelo.RegistroUsuarios;
import uva.ipc.loginmultilpesvistas.vista.GestorVistas;

/**
 *
 * @author macoa
 */
public class Main {

    private static GestorVistas gestor;
    private static RegistroUsuarios registro;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gestor = new GestorVistas();
        registro = new RegistroUsuarios();
        gestor.mostrarVistaLogin();
    }

    public static GestorVistas getGestorVistas() {
        return gestor;
    }

    public static RegistroUsuarios getRegistro() {
        return registro;
    }

}

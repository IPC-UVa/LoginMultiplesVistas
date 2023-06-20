/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uva.ipc.loginmultilpesvistas.vista;

import uva.ipc.loginmultilpesvistas.Main;
import uva.ipc.loginmultilpesvistas.modelo.RegistroUsuarios;

/**
 *
 * @author macoa
 */
public class ControladorLogin {

    private VistaLogin vista;
    private RegistroUsuarios registro;

    public ControladorLogin(VistaLogin vista) {
        this.vista = vista;
        registro = Main.getRegistro();
    }

    public void procesaEventoAcceder() {
        if (registro.comprobarCredenciales(vista.getUsuario(), vista.getPassword())) {
            registro.setUsuarioIdentificado(registro.getUsuarioByNombre(vista.getUsuario()));
            Main.getGestorVistas().mostrarVistaSeccionRestringida();
            return;
        }
        this.vista.mostrarMensaje("Usuario o contraseña incorrectos");
    }

    public void procesaEventoCambiarDatos() {
        Main.getGestorVistas().mostrarVistaCambiarDatos();
    }

}

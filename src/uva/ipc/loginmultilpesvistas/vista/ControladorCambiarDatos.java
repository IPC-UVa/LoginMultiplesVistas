/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uva.ipc.loginmultilpesvistas.vista;

import uva.ipc.loginmultilpesvistas.Main;
import uva.ipc.loginmultilpesvistas.modelo.RegistroUsuarios;
import uva.ipc.loginmultilpesvistas.modelo.Usuario;

/**
 *
 * @author macoa
 */
public class ControladorCambiarDatos {

    private VistaCambiarDatos vista;
    private RegistroUsuarios registro;

    public ControladorCambiarDatos(VistaCambiarDatos vista) {
        this.vista = vista;
        registro = Main.getRegistro();
    }

    public void procesaEventoGuardar() {
        String nombreUsuario = vista.getUsuario();
        String password = vista.getPassword();
        String passwordRepetida = vista.getPasswordRepetida();
        if (!password.equals(passwordRepetida)) {
            vista.mostrarMensaje("Las contraseñas no coinciden");
            return;
        }
        Usuario usuarioActual = registro.getUsuarioByNombre(nombreUsuario);
        if (usuarioActual == null) {
            vista.mostrarMensaje("El nombre de usuario no existe");
            return;
        }

        usuarioActual.setPassword(password);
        vista.mostrarMensaje("Contraseña actualizada con éxito");
    }

    public void procesaEventoVolverALogin() {
        Main.getGestorVistas().mostrarVistaLogin();

    }

}

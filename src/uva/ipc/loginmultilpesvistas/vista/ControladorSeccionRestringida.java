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
public class ControladorSeccionRestringida {

    private VistaSeccionRestringida vista;
    private RegistroUsuarios registro;

    public ControladorSeccionRestringida(VistaSeccionRestringida vista) {
        this.vista = vista;
        registro = Main.getRegistro();
        Usuario usuarioIdentificado = registro.getUsuarioIdentificado();
        if (usuarioIdentificado != null) {
            vista.mostrarNombreUsuario("Hola, " + usuarioIdentificado.getNombre());
        }
    }

    public void procesaEventoCerrarSesion() {
        registro.setUsuarioIdentificado(null);
        Main.getGestorVistas().mostrarVistaLogin();
    }

}

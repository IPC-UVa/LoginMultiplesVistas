/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uva.ipc.loginmultilpesvistas.modelo;

import java.util.ArrayList;

/**
 *
 * @author mcorrales
 */
public class RegistroUsuarios {

    private ArrayList<Usuario> listaUsuarios;
    private Usuario usuarioIdentificado;

    public RegistroUsuarios() {
        listaUsuarios = new ArrayList<>();
        rellenarUsuarios();
        usuarioIdentificado = null;
    }

    public boolean comprobarCredenciales(String usuario, String password) {
        for (Usuario u : listaUsuarios) {
            if (u.getNombre().equals(usuario) && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public Usuario getUsuarioByNombre(String nombreUsuario) {
        for (Usuario u : listaUsuarios) {
            if (u.getNombre().equals(nombreUsuario)) {
                return u;
            }
        }
        return null;
    }

    public Usuario getUsuarioIdentificado() {
        return usuarioIdentificado;
    }

    public void setUsuarioIdentificado(Usuario usuarioIdentificado) {
        this.usuarioIdentificado = usuarioIdentificado;
    }

    private void rellenarUsuarios() {
        Usuario usuario1 = new Usuario("admin", "admin");
        Usuario usuario2 = new Usuario("mario", "12345");
        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
    }

}

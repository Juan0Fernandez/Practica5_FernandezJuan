/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IUsuarioDao;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferna
 */
public class UsuarioDao implements IUsuarioDao {
    private List<Usuario> listaUsuario;

    public UsuarioDao() {
        listaUsuario = new ArrayList<>();

    }
    @Override
    public void create(Usuario usuario) {
        listaUsuario.add(usuario);
    }

    @Override
    public Usuario read(String id) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getIdentificacion().equals(id) ) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void delete(String id) {
        for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario usuarioBuscado = listaUsuario.get(i);
            if (usuarioBuscado.getIdentificacion().equals(id)) {
                listaUsuario.remove(i);
                break;
            }

        }
    }

    @Override
    public void update(String id, Usuario usuario) {
        for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario usuarioBuscado = listaUsuario.get(i);
            if (usuarioBuscado.getIdentificacion().equals(id)) {
               listaUsuario.set(i, usuario);
                break;
            }

        }
    }

    @Override
    public List<Usuario> list() {
         return listaUsuario;
    }
    
}

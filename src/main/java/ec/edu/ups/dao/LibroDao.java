/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.ILibroDao;
import ec.edu.ups.modelo.Biblioteca;
import ec.edu.ups.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferna
 */
public class LibroDao implements ILibroDao {

    private List<Libro> listaLibro;

    public LibroDao() {
        listaLibro = new ArrayList<>();

    }

    @Override
    public void create(Libro libro) {
        listaLibro.add(libro);
    }

    @Override
    public Libro read(int id) {
        for (Libro libro : listaLibro) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < listaLibro.size(); i++) {
            Libro libroBuscado = listaLibro.get(i);
            if (libroBuscado.getId() == id) {
                listaLibro.remove(i);
                break;
            }

        }
    }

    @Override
    public void update(int id, Libro libro) {
        for (int i = 0; i < listaLibro.size(); i++) {
            Libro libroBuscado = listaLibro.get(i);
            if (libroBuscado.getId() == id) {
                listaLibro.set(i, libro);
                break;
            }

        }
    }

    @Override
    public List<Libro> list() {
        return listaLibro;

    }

    @Override
    public Libro prestar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Libro devolver(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

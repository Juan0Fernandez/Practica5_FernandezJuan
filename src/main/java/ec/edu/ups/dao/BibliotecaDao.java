/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IBibliotecaDao;
import ec.edu.ups.modelo.Biblioteca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferna
 */
public class BibliotecaDao implements IBibliotecaDao {

    private List<Biblioteca> listaBiblioteca;

    public BibliotecaDao() {
        listaBiblioteca = new ArrayList<>();

    }


    @Override
    public void create(Biblioteca biblioteca) {
        listaBiblioteca.add(biblioteca);
    }

    @Override
    public Biblioteca read(int id) {
        for (Biblioteca biblioteca : listaBiblioteca) {
            if (biblioteca.getId() == id) {
                return biblioteca;
            }
        }
        return null;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < listaBiblioteca.size(); i++) {
            Biblioteca bibliotecaBuscada = listaBiblioteca.get(i);
            if (bibliotecaBuscada.getId() == id) {
                listaBiblioteca.remove(i);
                break;
            }

        }
    }

    @Override
    public void update(int id, Biblioteca bibliteca) {
        for (int i = 0; i < listaBiblioteca.size(); i++) {
            Biblioteca bibliotecaBuscada = listaBiblioteca.get(i);
            if (bibliotecaBuscada.getId() == id) {
                listaBiblioteca.set(i, bibliteca);
                break;
            }

        }
    }

    @Override
    public List<Biblioteca> list() {
        return listaBiblioteca;
    }
}

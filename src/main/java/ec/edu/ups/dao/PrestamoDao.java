/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IPrestamoDao;
import ec.edu.ups.modelo.Prestamo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferna
 */
public class PrestamoDao implements IPrestamoDao {
    private List<Prestamo> listaPrestamo;

    public PrestamoDao() {
        listaPrestamo = new ArrayList<>();

    }
    @Override
    public void create(Prestamo prestamo) {
        listaPrestamo.add(prestamo);
    }

    @Override
    public Prestamo read(int id) {
        for (Prestamo prestamo : listaPrestamo) {
            if (prestamo.getId() == id) {
                return prestamo;
            }
        }
        return null;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < listaPrestamo.size(); i++) {
            Prestamo prestamoBuscado = listaPrestamo.get(i);
            if (prestamoBuscado.getId() == id) {
                listaPrestamo.remove(i);
                break;
            }

        }
    }

    @Override
    public void update(int id, Prestamo prestamo) {
        for (int i = 0; i < listaPrestamo.size(); i++) {
            Prestamo prestamoBuscado = listaPrestamo.get(i);
            if (prestamoBuscado.getId() == id) {
                listaPrestamo.set(i, prestamo);
                break;
            }

        }
    }

    @Override
    public List<Prestamo> list() {
         return listaPrestamo;
    }
    //RELACIOAR USUARIO PRESTAMO LIBRO 
    /*UN COMBO BOX */
}

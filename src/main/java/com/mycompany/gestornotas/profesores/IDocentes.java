/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestornotas.profesores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IDocentes {
    public void agregar(Docente d);
    public Docente obtener(String cedula);
    public boolean actualizar(String cedula, Docente nuevo);
    public boolean eliminar(String cedula);
    public List<Docente> obtenerTodos();
}

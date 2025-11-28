/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestornotas.asig_estudi;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface IAsigna_Estudiantes {
    public void agregar(Asigna_Estudiante ae);
    public void actualizar(Asigna_Estudiante ae);
    public void eliminar(String fecha, int codA, int codE);
    public Asigna_Estudiante obtener(String fecha, int codA, int codE);
    public List<Asigna_Estudiante> obtenerPorEstudiante(int codE);
    public List<Asigna_Estudiante> obtenerPorAsignatura(int codA);
}

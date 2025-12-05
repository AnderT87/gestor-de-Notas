/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestornotas.asig_estudi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Asigna_Estudiantes implements IAsigna_Estudiantes {

    private List<Asigna_Estudiante> lista = new ArrayList<>();

    // ------------------------------------------------------
    // AGREGAR
    // ------------------------------------------------------
    public void agregar(Asigna_Estudiante ae) {
        lista.add(ae);
    }

    // ------------------------------------------------------
    // ACTUALIZAR
    // Se identifica por: fecha + codigoAsignatura + codigoEstudiante
    // ------------------------------------------------------
    public void actualizar(Asigna_Estudiante ae) {
        for (int i = 0; i < lista.size(); i++) {
            Asigna_Estudiante actual = lista.get(i);

            if (actual.getFecha().equals(ae.getFecha())
                    && actual.getAsignatura().getCodigoAsignatura() == ae.getAsignatura().getCodigoAsignatura()
                    && actual.getEstudiantes().getCodigoEstudiante() == ae.getEstudiantes().getCodigoEstudiante()) {

                lista.set(i, ae);
                return;
            }
        }
    }

    // ------------------------------------------------------
    // ELIMINAR
    // ------------------------------------------------------
    public void eliminar(String fecha, int codA, int codE) {
        for (int i = 0; i < lista.size(); i++) {
            Asigna_Estudiante ae = lista.get(i);

            if (ae.getFecha().equals(fecha)
                    && ae.getAsignatura().getCodigoAsignatura() == codA
                    && ae.getEstudiantes().getCodigoEstudiante() == codE) {

                lista.remove(i);
                return; // Eliminamos solo el primero que coincida
            }
        }
    }

    // ------------------------------------------------------
    // OBTENER (uno solo)
    // ------------------------------------------------------
    public Asigna_Estudiante obtener(String fecha, int codA, int codE) {
        for (Asigna_Estudiante ae : lista) {
            if (ae.getFecha().equals(fecha)
                    && ae.getAsignatura().getCodigoAsignatura() == codA
                    && ae.getEstudiantes().getCodigoEstudiante() == codE) {

                return ae;
            }
        }
        return null;
    }

    // ------------------------------------------------------
    // OBTENER POR ESTUDIANTE
    // ------------------------------------------------------
    public List<Asigna_Estudiante> obtenerPorEstudiante(int codE) {
        List<Asigna_Estudiante> resultado = new ArrayList<>();

        for (Asigna_Estudiante ae : lista) {
            if (ae.getEstudiantes().getCodigoEstudiante() == codE) {
                resultado.add(ae);
            }
        }
        return resultado;
    }

    // ------------------------------------------------------
    // OBTENER POR ASIGNATURA
    // ------------------------------------------------------
    public List<Asigna_Estudiante> obtenerPorAsignatura(int codA) {
        List<Asigna_Estudiante> resultado = new ArrayList<>();

        for (Asigna_Estudiante ae : lista) {
            if (ae.getAsignatura().getCodigoAsignatura() == codA) {
                resultado.add(ae);
            }
        }
        return resultado;
    }

}

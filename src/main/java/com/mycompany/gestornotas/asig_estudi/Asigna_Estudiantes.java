/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestornotas.asig_estudi;

import com.mycompany.gestornotas.asignatura.Asignatura;
import com.mycompany.gestornotas.estudiante.Estudiantes;

/**
 *
 * @author Admin
 */
public class Asigna_Estudiantes{
    
    private Asignatura asignatura;
    private Estudiantes estudiantes;
    
    int codigoEstudiante = estudiantes.getCodigoEstudiante();
    int codigoAsignatura = asignatura.getCodigoAsignatura();
    private String fecha;
    private double recuperacion;
    private double medioCiclo;
    private double finCiclo;

    public Asigna_Estudiantes(Asignatura asignatura, Estudiantes estudiantes, String fecha, double recuperacion, double medioCiclo, double finCiclo) {
        this.asignatura = asignatura;
        this.estudiantes = estudiantes;
        this.fecha = fecha;
        this.recuperacion = recuperacion;
        this.medioCiclo = medioCiclo;
        this.finCiclo = finCiclo;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(int codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getRecuperacion() {
        return recuperacion;
    }

    public void setRecuperacion(double recuperacion) {
        this.recuperacion = recuperacion;
    }

    public double getMedioCiclo() {
        return medioCiclo;
    }

    public void setMedioCiclo(double medioCiclo) {
        this.medioCiclo = medioCiclo;
    }

    public double getFinCiclo() {
        return finCiclo;
    }

    public void setFinCiclo(double finCiclo) {
        this.finCiclo = finCiclo;
    }

    @Override
    public String toString() {
        return "Asigna_Estudiantes{" + "codigoEstudiante=" + codigoEstudiante + ", codigoAsignatura=" + codigoAsignatura + ", fecha=" + fecha + ", recuperacion=" + recuperacion + ", medioCiclo=" + medioCiclo + ", finCiclo=" + finCiclo + '}';
    }

    
    
    
    
}

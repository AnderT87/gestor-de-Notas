/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestornotas;

import com.mycompany.gestornotas.vistas.VSeleccion;

/**
 *
 * @author Admin
 */
public class GestorNotas {

    public static void main(String[] args) {
        //visualizar la vista 
        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    new VSeleccion().setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.de.labo.pkg5;

import gui.gui;

/**
 *
 * @author LN710Q
 */
public class PracticaDeLabo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new gui().setVisible(true);
            }    
        });
    }
    
}

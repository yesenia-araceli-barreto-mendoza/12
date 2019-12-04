/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desendente;

/**
 *
 * @author hp
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        abb al= new abb();
        Nodo nuevo = new Nodo(14);
        nuevo.agregar(nuevo.getRaiz());
        nuevo.rcorrerPreorden(nuevo.getRaiz());
    }
    
}

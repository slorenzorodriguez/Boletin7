/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_1;

/**
 *
 * @author slorenzorodriguez
 */
class Boletin7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("hh","PEPE",3,0);
        Libro libro2 = new Libro("gg","LUIS",7,2);
        Libro libro3 = new Libro();
        libro3.setTitulo("Vento Ferido");
        libro3.setAutor("Carlos Casares");
        libro3.setExemplares(10);
        libro3.setPrestados(5);
        
        libro1.prestamo();
        libro2.prestamo();
        libro3.devolucion();
        
    }
    
}

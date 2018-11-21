/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_1;

import javax.swing.JOptionPane;

/**
 *
 * @author slorenzorodriguez
 */
class Libro {
    private String titulo;
    private String autor;
    private int exemplares;
    private int prestados;
    
    public Libro(){
        
    }
    public Libro(String titulo, String autor, int exemplares, int prestados){
        this.titulo = titulo;
        this.autor = autor;
        this.exemplares = exemplares;
        this.prestados = prestados;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setExemplares(int exemplares){
        this.exemplares = exemplares;
    }
    public void setPrestados(int prestados){
        this.prestados = prestados;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getExemplares(){
        return exemplares;
    }
    public int getPrestados(){
        return prestados;
    }
    public void prestamo(){
        if (exemplares > 0){
            prestados ++;
            exemplares --;
            JOptionPane.showMessageDialog(null,this);
        } else {
            JOptionPane.showMessageDialog(null, "Non hai exemplares deste libro.\n"+this);
        }
    }
    public void devolucion(){
        if (prestados > 0){
            exemplares ++;
            prestados --;
            JOptionPane.showMessageDialog(null,this);
        } else {
            JOptionPane.showMessageDialog(null, "Non hai prestados.\n"+this);
        }
    }
    @Override
    public String toString (){
        return "\nTitulo: "+titulo+"\nAutor: "+autor+"\nExemplares: "+exemplares+"\nLibros prestados: \n"+prestados;
    }
}
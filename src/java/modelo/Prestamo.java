/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ángel Plaza Cámara
 */
public class Prestamo {
    
    private double cantidad;
    private double intereses;
    private int tiempo;
    private double importePrestamo;

    public Prestamo(double cantidad, double intereses, int tiempo) {
        this.cantidad = cantidad;
        this.intereses = intereses;
        this.tiempo = tiempo;
        
        this.importePrestamo = importeTotalPrestamo(cantidad, intereses, tiempo);
    }

    public importeTotalPrestamo(double cantidad, double intereses, int tiempo){
        public double interesSimple= cantidad*intereses*tiempo/1200;
        return interesSimple+cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getIntereses() {
        return intereses;
    }

    public int getTiempo() {
        return tiempo;
    }

    public double getImportePrestamo() {
        return importePrestamo;
    }
  
    
    
    
}

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
    public double cantidad;
    public double intereses;
    public int tiempo;
    public double importePrestamo;

    public Prestamo(double cantidad, double intereses, int tiempo) {
        this.cantidad = cantidad;
        this.intereses = intereses;
        this.tiempo = tiempo;
        this.importePrestamo = importeTotalPrestamo( cantidad, intereses, tiempo);
    }
    
    public double importeTotalPrestamo(double cantidad, double intereses, int tiempo ){
        double interesSimple= cantidad*intereses*tiempo/1200;
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

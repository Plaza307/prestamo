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
public class Cuota {
    public int numeroCuota;
   public double importe;
   public double cantidad;
   public double intereses;

    public Cuota(int numeroCuota, double importe, double cantidad, double intereses) {
        this.numeroCuota = numeroCuota;
        this.importe = importe;
        this.cantidad = cantidad;
        this.intereses = intereses;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public String getCantidadString() {
        return String.format("%.2f", cantidad);
       
    }
    
    public double getImporte() {
        return importe;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getIntereses() {
        return intereses;
    }
   
}

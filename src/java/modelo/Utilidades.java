
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Ángel Plaza Cámara
 */
public class Utilidades {
    
    public static ArrayList<String>getMeses(){
        ArrayList<String> meses = new ArrayList<String>();
        for (int i=1;i<=15; i++) {
            meses.add(String.valueOf(i*12));
        }
        return meses;
    }
    
    public static ArrayList<Cuota> generarListaCuotas ( int numCuotas, double importeTotal) {
        ArrayList<Cuota> cuotas = new ArrayList<Cuota>();
        double importeCuota = importeTotal /  numCuotas;
        for ( int i=1; i<=numCuotas; i++) {
            double interesesCuota  = importeCuota - importeCuota * ( i - 1) / numCuotas;
            double cantidadCuota = importeCuota - interesesCuota;
            Cuota miCuota = new Cuota(i, importeCuota, cantidadCuota, interesesCuota );
            cuotas.add(miCuota);
        }
        return cuotas;
    }
    
}


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
    
    
}

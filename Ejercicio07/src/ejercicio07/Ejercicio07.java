
package ejercicio07;

/**
 *
 * @author CARLOS SÁNCHEZ
 */
public class Ejercicio07 {

    
    public static void main(String[] args) {
        double var1 = (int) Math.sqrt(81);
        int var2 = 9;
        int var3 = 3;
        
        boolean primeraCondicion = ( (var1+var2) / var3 ) == 9;
        
        int var4 = 10;
        int var5 = 1;
        
        boolean segundaCondicion = 10 > 1;
        
        int var6 = 100;
        int var7 = 25;
        double var8 =  Math.sqrt(100);
        
        boolean terceraCondicion = (var6/var7) + var8 > 1;
        
        boolean resultado = (primeraCondicion || segundaCondicion && terceraCondicion);
        
        System.out.println("El resultado de la operación es: " + resultado);
    }
    
}


package ejercicio06;

/**
 *
 * @author CARLOS SÁNCHEZ
 */
public class Ejercicio06 {


    public static void main(String[] args) {
        
        int var1 = (int) Math.sqrt(81);
        int var2 = 9;
        int var3 = 3;
        
        int var4 = 10;
        int var5 = 1;
              
        
        
        boolean resultado = ( (var1+var2) / var3 ) == 9 && (var4 > var5);
        
        
        if(resultado){
            System.out.println("El resultado de la operación es verdadero (" + resultado + ")");
        }else{
            System.out.println("El resultado de la operación es falso (" + resultado + ")");
        }
    }
    
}

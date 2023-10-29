
package ejercicio05;

/**
 *
 * @author CARLOS SÁNCHEZ
 */
public class Ejercicio05 {

  
    public static void main(String[] args) {
        
        int var1 = (int) Math.pow(2,2); //Subir 2 al cubo y convertir la variable de tipo double a entero. 
        int var2 = 12;
        int var3 = 1;
        int var4 = 3;
        
        int resultado = (var1+var2+var3) / var4; //Operación es: (2^2 + 12 + 1) / 3
        
        System.out.println("El resultado de la operación es: " + resultado);
    }
    
}

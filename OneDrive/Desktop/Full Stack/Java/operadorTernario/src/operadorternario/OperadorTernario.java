//Ejemplo de operador ternario
package operadorternario;

import java.util.Scanner;

public class OperadorTernario {

    
    public static void main(String[] args) {
        
      
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese su edad por favor:");
        int edad = teclado.nextInt();
        
        //if(edad>=18) System.out.println("Eres mayor de edad");
        //else System.out.println("Eres menor de edad");
        
        //Ahora con OPERADOR TERNARIO
        
        String edad2=(edad<18)? "eres menos de edad":"eres mayor de edad";
        System.out.println( edad2); 
        teclado.close();
        
    }
    
}

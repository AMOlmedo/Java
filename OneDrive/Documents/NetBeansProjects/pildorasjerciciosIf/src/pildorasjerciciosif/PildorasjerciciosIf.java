package pildorasjerciciosif;

import java.util.*;

public class PildorasjerciciosIf {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese la edad: ");
        int edad = teclado.nextInt();
     
        if(edad >= 0 && edad <120) {
                
 //solo si es una linea se puede colocar sin llaves los condicionales              
        if(edad <14) System.out.println("eres un ninio");   
        else if( edad < 19) System.out.println("eres adolescente");
        else if (edad <= 35) System.out.println("eres joven");
        else if (edad <50) System.out.println("eres adulto");
        else if (edad < 65)System.out.println("eres adulto mayor");
        else if (edad < 90)System.out.println("tercera edad");
        else if (edad >90)System.out.println("cuidate");       
        
    }
        else System.out.println("ingresa una edad valida");
    }
}

    


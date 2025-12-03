//Ejemplo swich version 14 (Como expresion devuelve un resultado)
package ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese el dia de la semana");

        String dia = teclado.nextLine();
        String resultado;
        resultado = switch (dia) {
            //  con la combinacion Shift + Control + felcha abajo copio lineas
            case "lunes", "martes", "miercoles", "jueves", "viernes" ->
                "Laborable";
            case "sabado", "dominogo" ->
                "NO laborable";
            default -> {  
                System.out.println("Procesando....");
                yield "dia no valido";
//como en el default se abre las llaves de un bloque de código q devuelve mas
//de un mando, es obligatorio el yield en este caso.. (yield=producir)
//yield NO return,  usando -> fecha   (return sale del metodo ejm void) 
            }
            
        };      
            System.out.println(resultado);
            
        }
    }

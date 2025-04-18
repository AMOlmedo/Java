//ejercicio integrador #1: 
//Generar un numero aleatorio. 
//Ingresar numeros hasta coincidir con el aleatorio  y contar los intentos
package Pildoras;

import javax.swing.JOptionPane;
import java.util.Random;

public class integrador1 {

    public static void main(String[] args) {

        Random rand = new Random();
        int aleatorio = rand.nextInt(100);
        System.out.println(aleatorio);
        int cont = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero del 1 al 100:"));

        if (num > 0 && num < 101) {
            while (aleatorio != num) {
                if (num > aleatorio) System.out.println("el numero es mayor");
                else if(num<aleatorio) System.out.println("el numero es menor");
                
                cont = cont + 1;
            }
            System.out.println("ACIERTO DE UNA!!!!");
        } else {
            System.out.println("ingrese un numero valido del 0 al 100");
        }
    }
}
    


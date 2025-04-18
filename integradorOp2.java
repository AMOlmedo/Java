//ejemplo del ramdon con pildoras v#19
package Pildoras;
import java.util.Scanner;

public class integradorOp2 {

    public static void main(String[] args) {

        int aleatorio=(int)(Math.random()*100)+1;
// genera el aletorio entre 0 y 1.por eso se multiplica por 100
//(int)parsea redondea y se le suma 1 para q no de 0  llegue a 100
        int conta=0;
        int numUsuario=0;     
        System.out.println(aleatorio);
        Scanner teclado= new Scanner(System.in);
        
        while(aleatorio != numUsuario){
            System.out.println("introduce un numero entre  1 y 100");
            numUsuario= teclado.nextInt();
            
            if(numUsuario>aleatorio)System.out.println("mas bajo");
            else if (numUsuario < aleatorio)System.out.println("mas alto");                                                       
        conta ++;    
        }
        System.out.println("correcto!!");
        System.out.println("le acertaste en " + conta +" intenteos!");
        
    }
    
}

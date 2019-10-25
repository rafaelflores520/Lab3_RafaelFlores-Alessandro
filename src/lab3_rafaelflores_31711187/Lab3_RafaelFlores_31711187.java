/*
    Lab3 - Herencia
 */
package lab3_rafaelflores_31711187;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_RafaelFlores_31711187 {
    public static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        char resp = 's';
        ArrayList <Ejercicto> ejercito = new ArrayList();
        ArrayList <Arma> armas = new ArrayList();
        while(resp == 's'){
            System.out.println("1- Agregar ejercito"
                    + "\n2- Seleccionar armas para comprar"
                    + "\n3- Listar arma"
                    + "\n4- Modificar arma"
                    + "\n5- Modificar ejercito"
                    + "\n6- Jugar"
                    + "\n7- Salir");
            int opcion = read.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("");
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    resp = 'n';
            }
        }//fin del while
        
    }//fin del main
}

/*
    Lab3 - Herencia
 */
package lab3_rafaelflores_31711187;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_RafaelFlores_31711187 {
    public static Scanner read = new Scanner(System.in);
    public static ArrayList<Ejercicto> ejercito = new ArrayList();
    public static ArrayList<Soldado> soldado = new ArrayList();
    public static ArrayList<Arma> armas = new ArrayList();
    public static String[][] Tablero = new String[10][10];
    public static void main(String[] args) {
        char resp = 's';
        while(resp == 's'){
            System.out.println("1- Agregar ejercito"
                    + "\n2- Agregar un soldado"
                    + "\n3- Agregar soldado a un ejercito"
                    + "\n4- Agregar Arma"
                    + "\n5- Seleccionar armas para comprar"
                    + "\n6- Listar arma"
                    + "\n7- Listar Ejercito"
                    + "\n8- Listar Soldados"
                    + "\n9- Modificar ejercito"
                    + "\n10- Eliminar arma"
                    + "\n11- Eliminar ejercito"
                    + "\n12- Eliminar Soldado:"
                    + "\n13- Jugar"
                    + "\n0- Salir");
            int opcion = read.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el nombre del ejercito: ");
                    String nombre = read.next();
                    String region = read.next();
                    System.out.print("Cuantas victorias tiene "+nombre+" : ");
                    int CantVic = read.nextInt();
                    System.out.print("Cuanto dinero posee´"+nombre+" : ");
                    int dinero = read.nextInt();
                    Ejercicto ej = new Ejercicto();
                    ej.setCantVictorias(CantVic);
                    ej.setDinero(dinero);
                    ej.setNombre(nombre);
                    ej.setRegion(region);
                    ejercito.add(ej);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del soldado: ");
                    String name = read.nextLine();
                    System.out.print("Ingrese de donde es "+name+" : ");
                    String lugar = read.next();
                    System.out.print("Ingrese la edad de "+name+" : ");
                    int edad = read.nextInt();
                    System.out.print("de que sexo es "+name+" [1- Masculino][2- Femenino]: ");
                    int sexo = read.nextInt();
                    break;
                case 3:
                    System.out.print("Que tipo de soldado es: ");
                    int tipo = read.nextInt();
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                case 11:
                    
                    break;
                case 12:
                    
                    break;
                case 13:
                    
                    break;
                case 0:
                    resp = 'n';
                    break;
            }
        }//fin del while
        
    }//fin del main
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //comenza aqui
}

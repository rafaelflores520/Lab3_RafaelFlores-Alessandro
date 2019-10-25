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
    public static String[][] vistaJ1 = new String[10][10];
    public static String[][] vistaJ2 = new String[10][10];
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        char resp = 's';
        while(resp == 's'){
            soldado.add(new General(12, new Arma("AK47", (float)523.32), "juan", "Valle", "masculino", 12));
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
                    System.out.print("Ingrese la region de "+nombre+" :");
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
                    System.out.print("Que tipo de soldado es [1- general][2- Caballero][3- Ejecutor]: ");
                    int type = read.nextInt();
                    int n;
                    int edad;
                    String name, lugar, sexo;
                    switch(type){
                        case 1://general
                            System.out.print("Ingrese el nombre del general: ");
                            name = read.nextLine();
                            System.out.print("Ingrese de donde es " + name + " : ");
                            lugar = read.next();
                            System.out.print("Cuantos años lleva al mando "+name+" : ");
                            int AM = read.nextInt();
                            System.out.print("Ingrese la edad de " + name + " : ");
                            edad = read.nextInt();
                            System.out.print("de que sexo es " + name + " [1- Masculino][2- Femenino]: ");
                            n = read.nextInt();
                            if (n == 1) {
                                sexo = "Masculino";
                            } else {
                                sexo = "Femenino";
                            }
                            Soldado g = new General();
                            g.setEdad(edad);
                            g.setNombre(name);
                            g.setLugar(lugar);
                            g.setSexo(sexo);
                            ((General)g).setAñoAlMando(AM);
                            soldado.add(g);
                            break;
                        case 2://caballero
                            System.out.print("Ingrese el nombre del Caballero: ");
                            name = read.nextLine();
                            System.out.print("Ingrese de donde es " + name + " : ");
                            lugar = read.next();
                            System.out.print("Ingrese la edad de " + name + " : ");
                            edad = read.nextInt();
                            System.out.print("de que sexo es " + name + " [1- Masculino][2- Femenino]: ");
                            n = read.nextInt();
                            if (n == 1) {
                                sexo = "Masculino";
                            } else {
                                sexo = "Femenino";
                            }
                            Soldado c = new Caballero();
                            c.setEdad(edad);
                            c.setNombre(name);
                            c.setLugar(lugar);
                            c.setSexo(sexo);
                            soldado.add(c);
                            break;
                        case 3://ejecutor
                            System.out.print("Ingrese el nombre del Caballero: ");
                            name = read.nextLine();
                            System.out.print("Ingrese de donde es " + name + " : ");
                            lugar = read.next();
                            System.out.print("Ingrese la edad de " + name + " : ");
                            edad = read.nextInt();
                            System.out.print("de que sexo es " + name + " [1- Masculino][2- Femenino]: ");
                            n = read.nextInt();
                            if (n == 1) {
                                sexo = "Masculino";
                            } else {
                                sexo = "Femenino";
                            }
                            Soldado e = new Ejecutor();
                            e.setEdad(edad);
                            e.setNombre(name);
                            e.setLugar(lugar);
                            e.setSexo(sexo);
                            soldado.add(e);
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la posicion del ejercito a la que quiere agregarlo: ");
                    int pos = read.nextInt();
                    if (pos > ejercito.size() - 1) {
                        System.out.print("posicion incorrecta");
                    } else {
                        if(ejercito.get(pos).getSoldado().size() < 6){
                            System.out.print("Ingrese la posicion del soldado que quiere agregar al ejercito: ");
                            int sold = read.nextInt();
                            if(sold > soldado.size()-1){
                                System.out.print("posicion incorrecta");
                            }else{
                                ejercito.get(pos).setSoldado(soldado.get(sold));
                            }
                        }
                        
                    }
                    break;
                case 4:
                    System.out.print("Cual es el nombre del arma: ");
                    name = read.next();
                    System.out.print("Cual es el valor de "+name+" : ");
                    int precio = read.nextInt();
                    Arma am = new Arma();
                    am.setNombre(name);
                    am.setPrecio(precio);
                    armas.add(am);
                    break;
                case 5:
                    
                    break;
                case 6://listar arma
                    ListarArma();
                    break;
                case 7:
                    ListarEjercito();
                    break;
                case 8:
                    ListarSoldado(soldado);
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   public static void ListarEjercito(){
       System.out.println("+-----+--------------------+--------------------+-----------+--------+");
       System.out.println("| No. |       Nombre       |       Region       | Victorias | Dinero |");
       System.out.println("+-----+--------------------+--------------------+-----------+--------+");
       for (int i = 0; i < ejercito.size(); i++) {
           System.out.println("|  "+i+"  |"+ejercito.get(i).toString());
           System.out.println("+-----+--------------------+--------------------+-----------+--------+");
       }
   } 
    
   public static void ListarSoldado(ArrayList<Soldado> temp){
       System.out.println("+-----+--------------------+--------------------+------+------+--------------+------+-------+------+");
       System.out.println("| No. |       Nombre       |       Lugar        | Sexo | Edad | Año al Mando | Arma | Bomba | Tipo |");
       System.out.println("+-----+--------------------+--------------------+------+------+--------------+------+-------+------+");
       for (int i = 0; i < temp.size(); i++) {
           System.out.println("|  "+i+"  |"+temp.get(i).toString()+" | "+temp.get(i).getClass().getName());
           System.out.println("+-----+--------------------+--------------------+------+------+--------------+------+-------+------+");
       }
   }
   
   public static void ListarArma(){
       System.out.println("+-----+--------------------+--------------------+-----------+---------+------------+");
       System.out.println("| No. |       Nombre       |       Precio       | Material  | Alcance | Automatica |");
       System.out.println("+-----+--------------------+--------------------+-----------+---------+------------+");
       for (int i = 0; i < ejercito.size(); i++) {
           System.out.println("|  "+i+"  |"+ejercito.get(i).toString()+" | "+ejercito.get(i).getClass().getName());
           System.out.println("+-----+--------------------+--------------------+-----------+--------+");
       }
   }
    
    public static void InitJuego(){
        
    }
    //comenza aqui
}

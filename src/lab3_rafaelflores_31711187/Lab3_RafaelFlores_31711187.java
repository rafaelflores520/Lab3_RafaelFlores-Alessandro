/*
    Lab3 - Herencia
 */
package lab3_rafaelflores_31711187;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab3_RafaelFlores_31711187 {
    public static Random rand = new Random();
    public static Scanner read = new Scanner(System.in);
    public static ArrayList<Ejercicto> ejercito = new ArrayList();
    public static ArrayList<Soldado> soldado = new ArrayList();
    public static ArrayList<Arma> armas = new ArrayList();
    public static String[][] Tablero = new String[10][10];
    public static String[][] vistaJ1 = new String[5][2];
    public static String[][] vistaJ2 = new String[5][2];
    public static int jugador1, jugador2;
    
    
    public static void main(String[] args) {
        char resp = 's';
        while(resp == 's'){
            soldado.add(new General(2,new Arma(), "Juan", "SPS", "M", 45));
            ejercito.add(new Ejercicto("Rusia", "Europa", 0, 100000));
            soldado.add(new General(12, new Arma("AK47", (float)523.32), "juan", "Valle", "M", 12));
            armas.add(new Bomba(2, "Polvora", "Redonda", ((float)23.17)));
            armas.add(new Rifle(4, 1, true, "AK-47",((float)100.17)));
            armas.add(new ArmaBlanca("Metal", "Navaja", ((float)10.17)));
            System.out.print("1- Agregar ejercito"
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
                    + "\n12- Eliminar Soldado"
                    + "\n13- Jugar"
                    + "\n0- Salir: ");
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
                            read.nextLine();
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
                                sexo = "M";
                            } else {
                                sexo = "F";
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
                            read.nextLine();
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
                            System.out.print("Ingrese el nombre del Ejecutor: ");
                            read.nextLine();
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
                        if(ejercito.get(pos).getSoldado().size() < 5){
                            System.out.print("Ingrese la posicion del soldado que quiere agregar al ejercito: ");
                            int sold = read.nextInt();
                            if(sold > soldado.size()-1){
                                System.out.print("posicion incorrecta");
                            }else{
                                ejercito.get(pos).setSoldado(soldado.get(sold));
                                soldado.remove(sold);
                            }
                        }else{
                            System.out.println("El ejercito ya tiene 5 soldados");
                        }
                        
                    }
                    break;
                case 4:
                    System.out.print("Que tipo de arma es[1-bomba][2-rifle][3-arma blanca]");
                    int tipo = read.nextInt();
                    int precio, alcance;
                    String material;
                    boolean aut;
                    switch(tipo){
                        case 1://bomba
                            System.out.print("Cual es el nombre de la bomba: ");
                            name = read.next();
                            System.out.print("Cual es el valor de " + name + " : ");
                            precio = read.nextInt();
                            System.out.print("Cual es el material de "+name+" : ");
                            material = read.next();
                            System.out.print("Cual es el alcance de la bomba: ");
                            alcance = read.nextInt();
                            Arma am = new Bomba();
                            am.setNombre(name);
                            am.setPrecio(precio);
                            ((Bomba)am).setAreaAlcance(alcance);
                            ((Bomba)am).setMaterial(material);
                            armas.add(am);
                            break;
                        case 2://rifle
                            System.out.print("Cual es el nombre del rifle: ");
                            name = read.next();
                            System.out.print("Cual es el valor de " + name + " : ");
                            precio = read.nextInt();
                            System.out.print("EL arma es automatica [1=si][2=no]: ");
                            int respuesta = read.nextInt();
                            if(respuesta == 1)
                                aut = true;
                            else
                                aut = false;
                            System.out.print("Cual es el alcance maximo del rifle: ");
                            int alcanceMax = read.nextInt();
                            System.out.print("Cual es el alcance minimo del rifle: ");
                            int alcanceMin = read.nextInt();
                            Arma RF = new Rifle();
                            RF.setNombre(name);
                            RF.setPrecio(precio);
                            ((Rifle)RF).setEsAutomática(aut);
                            ((Rifle)RF).setLinealAlcanceMax(alcanceMax);
                            ((Rifle)RF).setLinealAlcanceMin(alcanceMin);
                            armas.add(RF);
                            break;
                        case 3://arma blanca
                            System.out.print("Cual es el nombre de la bomba: ");
                            name = read.next();
                            System.out.print("Cual es el valor de " + name + " : ");
                            precio = read.nextInt();
                            System.out.print("Cual es el material de "+name+" : ");
                            material = read.next();
                            Arma AB = new ArmaBlanca();
                            AB.setNombre(name);
                            AB.setPrecio(precio);
                            ((ArmaBlanca)AB).setMaterial(material);
                            armas.add(AB);
                            break;
                    }
                    
                    break;
                case 5:
                    System.out.print("Ingrese la posicion del ejercito a la que quiere entrar: ");
                    pos = read.nextInt();
                    if (pos > ejercito.size() - 1) {
                        System.out.print("posicion incorrecta");
                    } else {
                        System.out.print("Ingrese la posicion del arma que desea comprar: ");
                        int gun = read.nextInt();
                        if (gun > ejercito.size() - 1) {
                            System.out.print("posicion incorrecta");
                        } else {
                            if (ejercito.get(pos).getDinero() < armas.get(gun).getPrecio()){
                                System.out.print("No tiene suficiente dinero");
                                break;
                            }else{
                                ListarSoldado(ejercito.get(pos).getSoldado());
                                System.out.print("A que soldado se la quiere agregar: ");
                                int m = read.nextInt();
                                
                                switch(ejercito.get(pos).getSoldadoEspecifico(m).getClass().getSimpleName()){
                                    case "General":
                                        if(armas.get(gun).getClass().getSimpleName().equals("Bombas") ){
                                            System.out.println("No se le puede agregar bombas a un general.");
                                            
                                        }else{
                                            Soldado g = ejercito.get(pos).getSoldadoEspecifico(m);
                                            ((General)g).setArma(armas.get(gun));
                                        }
                                        break;
                                    case "Caballero":
                                        if(armas.get(gun).getClass().getSimpleName().equals("Bombas") ){
                                            System.out.println("No se le puede agregar bombas a un caballero.");
                                            
                                        }else{
                                            Soldado c = ejercito.get(pos).getSoldadoEspecifico(m);
                                        ((General)c).setArma(armas.get(gun));
                                        }
                                        break;
                                    case "Ejecutor":
                                        Soldado e = ejercito.get(pos).getSoldadoEspecifico(m);
                                        ((General)e).setArma(armas.get(gun));
                                        break;
                                }
                                
                            }

                        }

                    }
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
                    if (ejercito.isEmpty()) {
                        System.out.println("No hay nada que mostrar!");
                    } else {
                        ListarEjercito();
                        System.out.println("Ingrese la posición a modificar: ");
                        pos = read.nextInt();
                        if (pos < 0 || pos > ejercito.size() - 1) {
                            System.out.println("Abortando! Debe ingresar una posición válida");
                        } else {
                            System.out.println("Ingrese el número de lo que desea modificar:"
                                    + "\n\t 1. Nombre del ejercito"
                                    + "\n\t 2. Region del ejercito"
                                    + "\n\t 3. Cantidad de victorias"
                                    + "\n\t 4. Cantidad de dinero");
                            int modOp = read.nextInt();
                            Modificar(ejercito, pos, modOp, "");
                            System.out.println("Su Modificación fue exitosa!");
                        }

                    }
                    break;
                case 10://eliminar arma
                    System.out.print("Ingrese la posicion del arma que quiere eliminar: ");
                    pos = read.nextInt();
                    if (pos > ejercito.size() - 1) {
                        System.out.print("posicion incorrecta");
                    } else {
                        armas.remove(pos);
                    }
                    break;
                case 11://eliminar ejercito
                    System.out.print("Ingrese la posicion del ejercito que quiere eliminar: ");
                    pos = read.nextInt();
                    if (pos > ejercito.size() - 1) {
                        System.out.print("posicion incorrecta");
                    } else {
                        ejercito.remove(pos);
                    }
                    break;
                case 12://eliminar soldado
                    System.out.print("Ingrese la posicion del soldado que quiere eliminar: ");
                    pos = read.nextInt();
                    if (pos > ejercito.size() - 1) {
                        System.out.print("posicion incorrecta");
                    } else {
                        soldado.remove(pos);
                    }
                    break;
                case 13://jugar
                    InitJuego();
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
           System.out.println("|  "+i+"  "+ejercito.get(i).toString());
           System.out.println("+-----+--------------------+--------------------+-----------+--------+");
       }
   } 
    
   public static void ListarSoldado(ArrayList<Soldado> temp){
       System.out.println("+-----+--------------------+--------------------+------+------+--------------+------+");
       System.out.println("| No. |       Nombre       |       Lugar        | Sexo | Edad | Año al Mando | Tipo |");
       System.out.println("+-----+--------------------+--------------------+------+------+--------------+------+");
       for (int i = 0; i < temp.size(); i++) {
           System.out.println("|  "+i+"  "+temp.get(i).toString()+temp.get(i).getClass().getSimpleName()+"|");
           System.out.println("+-----+--------------------+--------------------+------+------+--------------+------+");
       }
   }
   
   public static void ListarArma(){
       System.out.println("+-----+--------------------+--------------------+-----------+---------+------------+------+");
       System.out.println("| No. |       Nombre       |       Precio       | Material  | Alcance | Automatica | Tipo |");
       System.out.println("+-----+--------------------+--------------------+-----------+---------+------------+------+");
       for (int i = 0; i < armas.size(); i++) {
           System.out.println("|  "+i+"  "+armas.get(i).toString()+armas.get(i).getClass().getSimpleName()+"|");
           System.out.println("+-----+--------------------+--------------------+-----------+---------+------------+");
       }
   }
   
   public static void CargarTablero(String[][] temp){
       int cord1, cord2;
       for (int i = 0; i < 5; i++) {
           do{
                cord1 = rand.nextInt(10);
                cord2 = rand.nextInt(10);
                if (Tablero[cord1][cord2].equals("")) {
                    Tablero[cord1][cord2] = "*";
                    temp[i][0] = String.valueOf(cord1);
                    temp[i][1] = String.valueOf(cord2);
                }
            }while(true);
       }
       
       
   }
    
    public static void InitJuego(){
        ListarEjercito();
        System.out.println("Escoja el ejercito para el jugador 1:");
        do {
            jugador1 = read.nextInt();
            if (jugador1 < 0 || jugador1 >= ejercito.size()) {
                System.out.println("No existe el ejercito que escogio!!!");
            }else{
                CargarTablero(vistaJ1);
                break;
            }
        } while (true);
        System.out.println("Escoja el ejercito para el jugador 2:");
        do {
            jugador2 = read.nextInt();
            if (jugador2 < 0 || jugador2 >= ejercito.size()) {
                System.out.println("No existe el ejercito que escogio!!!");
            }else{
                CargarTablero(vistaJ1);
                break;
            }
        } while (true);
        
    }
    //comenza aqui
    
    public static void Modificar(ArrayList<Ejercicto> temp, int pos, int op, String nivel){
        switch(op){
            case 1:
                System.out.println("Ingrese el nuevo Nombre del ejercito: ");
                temp.get(pos).setNombre(read.next());
                break;
            case 2:
                System.out.println("Ingrese la nueva region del ejercito");
                temp.get(pos).setRegion(read.next());
                break;
            case 3:
                System.out.println("Ingrese la nueva cantidad de victorias del ejercito");
                temp.get(pos).setCantVictorias(read.nextInt());
                break;
            case 4:
                System.out.println("Ingrese la nueva cantidad de dinero que posee el ejercito");
                temp.get(pos).setDinero(read.nextInt());
                break;
        }
    }
}

/*
    Clase Ejercito
 */
package lab3_rafaelflores_31711187;

import java.util.ArrayList;

public class Ejercicto {
    private String nombre;
    private String region;
    private int cantVictorias;
    private float dinero;
    ArrayList<Soldado> soldado = new ArrayList();

    public Ejercicto() {
    }

    public Ejercicto(String nombre, String region, int cantVictorias, float dinero) {
        this.nombre = nombre;
        this.region = region;
        this.cantVictorias = cantVictorias;
        this.dinero = dinero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCantVictorias(int cantVictorias) {
        this.cantVictorias = cantVictorias;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public void setSoldado(ArrayList<Soldado> soldado) {
        this.soldado = soldado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRegion() {
        return region;
    }

    public int getCantVictorias() {
        return cantVictorias;
    }

    public float getDinero() {
        return dinero;
    }

    public ArrayList<Soldado> getSoldado() {
        return soldado;
    }

    @Override
    public String toString() {
        return "Ejercicto{" + "nombre=" + nombre + ", region=" + region + ", cantVictorias=" + cantVictorias + ", dinero=" + dinero + ", soldado=" + soldado + '}';
    }
    
    
}

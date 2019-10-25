/*
Clase Padre Arma
 */
package lab3_rafaelflores_31711187;

public class Arma {
    protected String nombre;
    protected float precio;

    public Arma() {
    }

    public Arma(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        //return "Arma{" + "nombre=" + nombre + ", precio=" + precio + '}';
        String patron = "|%20s|%17.2f|";
        return String.format(patron, this.getNombre(), this.getPrecio());
    }
    
}

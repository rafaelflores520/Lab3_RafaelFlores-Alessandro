/*
Clase Soldado
 */
package lab3_rafaelflores_31711187;

public class Soldado {
    protected String nombre;
    protected String lugar;
    protected String sexo;

    public Soldado() {
    }

    public Soldado(String nombre, String lugar, String sexo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", lugar=" + lugar + ", sexo=" + sexo + '}';
    }
    
     
}

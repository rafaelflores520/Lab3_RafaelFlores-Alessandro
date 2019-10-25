/*
Clase Soldado
 */
package lab3_rafaelflores_31711187;

public class Soldado {
    protected String nombre;
    protected String lugar;
    protected String sexo;
    protected int edad; 
          

    public Soldado() {
    }

    public Soldado(String nombre, String lugar, String sexo, int edad) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.sexo = sexo;
        this.edad = edad;
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

    public void setEdad(int edad) {
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", lugar=" + lugar + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
    
    
    
    
    
     
}

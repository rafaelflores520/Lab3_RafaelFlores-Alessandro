/*
    Clase Hija - Caballero
 */
package lab3_rafaelflores_31711187;

public class Caballero extends Soldado{
    private Arma arma;

    public Caballero() {
    }

    public Caballero(Arma arma, String nombre, String lugar, String sexo, int edad) {
        super(nombre, lugar, sexo, edad);
        this.arma = arma;
    }

    

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    @Override
    public String toString() {
        return super.toString()+"Caballero{" + "arma=" + arma + '}';
    }
    
    
}

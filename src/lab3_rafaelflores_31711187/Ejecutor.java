/*
    Clase hija Ejecutor
 */
package lab3_rafaelflores_31711187;

import java.util.ArrayList;

public class Ejecutor extends Soldado{
    private Arma arma;
    private ArrayList<Arma> bomba = new ArrayList();

    public Ejecutor() {
    }

    public Ejecutor(Arma arma, String nombre, String lugar, String sexo, int edad) {
        super(nombre, lugar, sexo, edad);
        this.arma = arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void setBomba(ArrayList<Arma> bomba) {
        this.bomba = bomba;
    }

    public Arma getArma() {
        return arma;
    }

    public ArrayList<Arma> getBomba() {
        return bomba;
    }

    @Override
    public String toString() {
        return "Ejecutor{" + "arma=" + arma + ", bomba=" + bomba + '}';
    }
    
}

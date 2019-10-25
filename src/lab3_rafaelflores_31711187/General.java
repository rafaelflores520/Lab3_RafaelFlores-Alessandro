/*
Clase hija - general
 */
package lab3_rafaelflores_31711187;

public class General extends Soldado{
    private int añoAlMando;
    private Arma arma;

    public General() {
    }

    public General(int añoAlMando, Arma arma, String nombre, String lugar, String sexo, int edad) {
        super(nombre, lugar, sexo, edad);
        this.añoAlMando = añoAlMando;
        this.arma = arma;
    }

    public void setAñoAlMando(int añoAlMando) {
        this.añoAlMando = añoAlMando;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getAñoAlMando() {
        return añoAlMando;
    }

    public Arma getArma() {
        return arma;
    }

    @Override
    public String toString() {
        return super.toString()+"General{" + "a\u00f1oAlMando=" + añoAlMando + ", arma=" + arma + '}';
    }
    
    
}

/*
    Clase hija - Rifle
*/
package lab3_rafaelflores_31711187;

public class Rifle extends Arma{
    private int linealAlcanceMax;
    private int linealAlcanceMin;
    private boolean esAutomática;

    public Rifle() {
    }

    public Rifle(int linealAlcanceMax, int linealAlcanceMin, boolean esAutomática, String nombre, float precio) {
        super(nombre, precio);
        this.linealAlcanceMax = linealAlcanceMax;
        this.linealAlcanceMin = linealAlcanceMin;
        this.esAutomática = esAutomática;
    }

    public void setLinealAlcanceMax(int linealAlcanceMax) {
        this.linealAlcanceMax = linealAlcanceMax;
    }

    public void setLinealAlcanceMin(int linealAlcanceMin) {
        this.linealAlcanceMin = linealAlcanceMin;
    }

    public void setEsAutomática(boolean esAutomática) {
        this.esAutomática = esAutomática;
    }

    public int getLinealAlcanceMax() {
        return linealAlcanceMax;
    }

    public int getLinealAlcanceMin() {
        return linealAlcanceMin;
    }

    public boolean isEsAutomática() {
        return esAutomática;
    }

    @Override
    public String toString() {
        return super.toString()+"Rifle{" + "linealAlcanceMax=" + linealAlcanceMax + ", linealAlcanceMin=" + linealAlcanceMin + ", esAutom\u00e1tica=" + esAutomática + '}';
    }
    
    
}

/*
Clase hija - Bomba
 */
package lab3_rafaelflores_31711187;

public class Bomba extends Arma {
    private int areaAlcance;
    private String material;

    public Bomba() {
    }

    public Bomba(int areaAlcance, String material, String nombre, float precio) {
        super(nombre, precio);
        this.areaAlcance = areaAlcance;
        this.material = material;
    }

    public void setAreaAlcance(int areaAlcance) {
        this.areaAlcance = areaAlcance;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAreaAlcance() {
        return areaAlcance;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return super.toString()+"Bomba{" + "areaAlcance=" + areaAlcance + ", material=" + material + '}';
    }
    
}

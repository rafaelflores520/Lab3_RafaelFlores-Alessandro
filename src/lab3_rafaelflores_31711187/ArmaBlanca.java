/*
    Clase hija - ArmaBlanca
 */
package lab3_rafaelflores_31711187;

public class ArmaBlanca extends Arma{
    private String material;

    public ArmaBlanca() {
    }

    public ArmaBlanca(String material, String nombre, float precio) {
        super(nombre, precio);
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        //return super.toString()+"ArmaBlanca{" + "material=" + material + '}';
        String patron = super.toString()+"|%11s|%9s|%12s|";
        return String.format(patron, this.getMaterial(), "n/a", "n/a");
    }
    
    
}

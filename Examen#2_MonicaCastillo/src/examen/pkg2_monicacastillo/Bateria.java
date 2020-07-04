/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_monicacastillo;

/**
 *
 * @author Monica
 */
public class Bateria extends Parte {

    private int capacidadhoras;
    private String material;

    public Bateria() {
        super();
    }

    public Bateria(int capacidadhoras, String material, int tiempoensamblaje) {
        super(tiempoensamblaje);
        this.capacidadhoras = capacidadhoras;
        this.material = material;
    }

    public int getCapacidadhoras() {
        return capacidadhoras;
    }

    public void setCapacidadhoras(int capacidadhoras) {
        this.capacidadhoras = capacidadhoras;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + "Bateria[" + capacidadhoras + ", " + material + ']';
    }

}

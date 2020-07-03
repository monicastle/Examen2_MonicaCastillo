/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_monicacastillo;

import java.awt.Color;

/**
 *
 * @author Monica
 */
public class Teclado extends Parte {

    private String material;
    private Color color;

    public Teclado() {
        super();
    }

    public Teclado(String material, Color color, int tiempoensamblaje) {
        super(tiempoensamblaje);
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" + "material=" + material + ", color=" + color + '}';
    }

}

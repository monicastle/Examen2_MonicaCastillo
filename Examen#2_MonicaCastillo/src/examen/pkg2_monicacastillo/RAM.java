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
public class RAM extends Parte {

    private int tamaño;
    private String marca;

    public RAM() {
        super();
    }

    public RAM(int tamaño, String marca, int tiempoensamblaje) {
        super(tiempoensamblaje);
        this.tamaño = tamaño;
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() + "RAM[" + tamaño + ", " + marca + ']';
    }

}

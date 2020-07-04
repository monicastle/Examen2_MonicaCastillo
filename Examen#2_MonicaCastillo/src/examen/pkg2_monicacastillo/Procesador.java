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
public class Procesador extends Parte {

    private int numnucleos;
    private double velocidad;

    public Procesador() {
        super();
    }

    public Procesador(int numnucleos, double velocidad, int tiempoensamblaje) {
        super(tiempoensamblaje);
        this.numnucleos = numnucleos;
        this.velocidad = velocidad;
    }

    public int getNumnucleos() {
        return numnucleos;
    }

    public void setNumnucleos(int numnucleos) {
        this.numnucleos = numnucleos;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Procesador[" + numnucleos + ", " + velocidad + ']';
    }

}

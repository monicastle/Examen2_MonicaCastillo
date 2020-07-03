/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_monicacastillo;

import java.io.Serializable;

/**
 *
 * @author Monica
 */
public class Parte implements Serializable{

    private int tiempoensamblaje;

    public Parte() {
    }

    public Parte(int tiempoensamblaje) {
        this.tiempoensamblaje = tiempoensamblaje;
    }

    public int getTiempoensamblaje() {
        return tiempoensamblaje;
    }

    public void setTiempoensamblaje(int tiempoensamblaje) {
        this.tiempoensamblaje = tiempoensamblaje;
    }

    @Override
    public String toString() {
        return "Parte{" + "tiempoensamblaje=" + tiempoensamblaje + '}';
    }

}

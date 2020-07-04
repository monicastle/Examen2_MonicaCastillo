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
public class Pantalla extends Parte {

    private boolean tactil;
    private String tipo;

    public Pantalla() {
        super();
    }

    public Pantalla(boolean tactil, String tipo, int tiempoensamblaje) {
        super(tiempoensamblaje);
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public boolean isTactil() {
        return tactil;
    }

    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "Pantalla[" + tactil + ", " + tipo + ']';
    }

}

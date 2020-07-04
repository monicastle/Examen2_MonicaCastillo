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
public class Tecnico {

    private String nombre;
    private int edad;
    private String genero;
    private int cantcomp;

    public Tecnico() {
    }

    public Tecnico(String nombre, int edad, String genero, int cantcomp) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cantcomp = cantcomp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantcomp() {
        return cantcomp;
    }

    public void setCantcomp(int cantcomp) {
        this.cantcomp = cantcomp;
    }

    @Override
    public String toString() {
        return "Tecnico[" + nombre + ", " + edad + ", " + genero + ", " + cantcomp + ']';
    }

}

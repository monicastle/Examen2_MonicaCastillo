/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_monicacastillo;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Monica
 */
public class Computadora implements Serializable {

    private int numserie;
    private int año;
    private Color color;
    private String material;
    private RAM ram;
    private DiscoDuro discoduro;
    private Bateria bateria;
    private Teclado teclado;
    private Pantalla pantalla;
    private Procesador procesador;

    public Computadora() {
    }

    public Computadora(int numserie, int año, Color color, String material, RAM ram, DiscoDuro discoduro, Bateria bateria, Teclado teclado, Pantalla pantalla, Procesador procesador) {
        this.numserie = numserie;
        this.año = año;
        this.color = color;
        this.material = material;
        this.ram = ram;
        this.discoduro = discoduro;
        this.bateria = bateria;
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    public int getNumserie() {
        return numserie;
    }

    public void setNumserie(int numserie) {
        this.numserie = numserie;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public DiscoDuro getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(DiscoDuro discoduro) {
        this.discoduro = discoduro;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora[" + numserie + ", " + año + ", " + color + ", " + material + ", " + ram + ", " + discoduro + ", " + bateria + ", " + teclado + ", " + pantalla + ", " + procesador + ']';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_monicacastillo;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Monica
 */
public class HiloBarraTabla extends Thread {

    private JProgressBar barra;
    private JTable tabla;
    private Computadora computadora;

    public HiloBarraTabla(JProgressBar barra, JTable tabla, Computadora computadora) {
        this.barra = barra;
        this.tabla = tabla;
        this.computadora = computadora;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public void run() {
        try {
            boolean valid = true;
            if (valid) {
                RAM ram;
                DiscoDuro disco;
                Bateria bateria;
                Teclado teclado;
                Pantalla pantalla;
                Procesador procesador;
                ram = computadora.getRam();
                disco = computadora.getDiscoduro();
                bateria = computadora.getBateria();
                teclado = computadora.getTeclado();
                pantalla = computadora.getPantalla();
                procesador = computadora.getProcesador();
                int uno, dos, tres, cuatro, cinco, seis;
                uno = ram.getTiempoensamblaje();
                dos = disco.getTiempoensamblaje();
                tres = bateria.getTiempoensamblaje();
                cuatro = teclado.getTiempoensamblaje();
                cinco = pantalla.getTiempoensamblaje();
                seis = procesador.getTiempoensamblaje();
                barra.setMaximum(uno);
                for (int i = 0; i < uno; i++) {
                    barra.setValue(i);
                    Thread.sleep(1000);
                } // Fin For
                Object[] newrow = {ram, uno};
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                modelo.addRow(newrow);
                tabla.setModel(modelo);
                barra.setMaximum(dos);
                for (int i = 0; i < dos; i++) {
                    barra.setValue(i);
                    Thread.sleep(1000);
                } // Fin For
                Object[] newrow2 = {ram, uno};
                DefaultTableModel modelo2 = (DefaultTableModel) tabla.getModel();
                modelo2.addRow(newrow2);
                for (int i = 0; i < tres; i++) {
                    barra.setValue(i);
                    Thread.sleep(1000);
                } // Fin For
                Object[] newrow3 = {ram, uno};
                DefaultTableModel modelo3 = (DefaultTableModel) tabla.getModel();
                modelo3.addRow(newrow3);
                for (int i = 0; i < cuatro; i++) {
                    barra.setValue(i);
                    Thread.sleep(1000);
                } // Fin For
                Object[] newrow4 = {ram, uno};
                DefaultTableModel modelo4 = (DefaultTableModel) tabla.getModel();
                modelo4.addRow(newrow4);
                for (int i = 0; i < cinco; i++) {
                    barra.setValue(i);
                    Thread.sleep(1000);
                } // Fin For
                Object[] newrow5 = {ram, uno};
                DefaultTableModel modelo5 = (DefaultTableModel) tabla.getModel();
                modelo5.addRow(newrow5);
                for (int i = 0; i < seis; i++) {
                    barra.setValue(i);
                    Thread.sleep(1000);
                } // Fin For
                Object[] newrow6 = {ram, uno};
                DefaultTableModel modelo6 = (DefaultTableModel) tabla.getModel();
                modelo6.addRow(newrow6);
                valid = false;
            } // Fin If
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

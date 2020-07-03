/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_monicacastillo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Monica
 */
public class AdminTecnico {

    private ArrayList<Tecnico> listatecnico = new ArrayList();
    private File archivo = null;

    public AdminTecnico(String path) {
        archivo = new File(path);
    }

    public ArrayList<Tecnico> getListatecnico() {
        return listatecnico;
    }

    public void setListatecnico(ArrayList<Tecnico> listatecnico) {
        this.listatecnico = listatecnico;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void SetTecnico(Tecnico t) {
        this.listatecnico.add(t);
    }

    public void RemoveTrecnico(Tecnico t) {
        this.listatecnico.remove(t);
    }

    public void EscribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Tecnico t : listatecnico) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getGenero() + ";");
                bw.write(t.getCantcomp() + ";");
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }

    public void CargarArchivo() {
        Scanner entrada = null;
        listatecnico = new ArrayList();
        if (archivo.exists()) {
            try {
                entrada = new Scanner(archivo);
                entrada.useDelimiter(";");
                while (entrada.hasNext()) {
                    listatecnico.add(new Tecnico(entrada.next(), entrada.nextInt(), entrada.next(), entrada.nextInt()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            entrada.close();
        }
    }
}

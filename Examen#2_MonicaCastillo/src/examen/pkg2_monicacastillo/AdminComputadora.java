/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_monicacastillo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Monica
 */
public class AdminComputadora {

    private ArrayList<Computadora> listacomputadoras = new ArrayList();
    private File archivo = null;

    public AdminComputadora(String path) {
        archivo = new File(path);
    } // Fin Constructor Admin Computadora

    public ArrayList<Computadora> getListacomputadoras() {
        return listacomputadoras;
    }

    public void setListacomputadoras(ArrayList<Computadora> listacomputadoras) {
        this.listacomputadoras = listacomputadoras;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void SetCompuadora(Computadora c) {
        this.listacomputadoras.add(c);
    }

    public void RemoveComputadora(Computadora c) {
        this.listacomputadoras.remove(c);
    }

    public void cargarArchivo() {
        try {
            listacomputadoras = new ArrayList();
            Computadora temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Computadora) objeto.readObject()) != null) {
                        listacomputadoras.add(temp);
                    } // Fin While
                } catch (EOFException ex) {
                } // Fin Try Catch
                objeto.close();
                entrada.close();
            } // Fin If
        } catch (Exception ex) {
        } // Fin Try Catch
    } // Fin Cargar Archivo

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Computadora t : listacomputadoras) {
                bw.writeObject(t);
            } // Fin For
            bw.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            } // Fin Try Catch
        } // Fin Try Catch
    } // Fin Escribir Archivo
}

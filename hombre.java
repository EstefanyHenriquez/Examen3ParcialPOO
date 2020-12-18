/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class hombre  extends Zapato{
    private String  comodidad; 

    public hombre(String comodidad, double talla, String Color, String estilo) {
        super(talla, Color, estilo);
        this.comodidad = comodidad;
    }
  

    public String getComodidad() {
        return comodidad;
    }

    public void setComodidad(String comodidad) {
        this.comodidad = comodidad;
    }
    public void filer2(int numeroarchivo, ArrayList<Object>  valor  ){
     try {
     String ruta = "C:\\Users\\Administrador\\Desktop\\ProyectoPeronsal\\Main/"+numeroarchivo+".txt";
     String contenido = "El producto Guardado es :"+valor;
     File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
}

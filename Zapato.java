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


public class Zapato {
     
    private double talla;
    private String Color;
    private String estilo;

    public Zapato(double talla, String Color, String estilo) {
        this.talla = talla;
        this.Color = Color;
        this.estilo = estilo;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
   public void filer2(int numeroarchivo,  ArrayList<Object>  valor ){
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

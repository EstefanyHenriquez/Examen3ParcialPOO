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
public class ninio extends Zapato {
    private String FiguraDelZapato;

    public ninio(String FiguraDelZapato, double talla, String Color, String estilo) {
        super(talla, Color, estilo);
        this.FiguraDelZapato = FiguraDelZapato;
    }

    public String getFiguraDelZapato() {
        return FiguraDelZapato;
    }

    public void setFiguraDelZapato(String FiguraDelZapato) {
        this.FiguraDelZapato = FiguraDelZapato;
    }
    public void filer2(int numeroarchivo, ArrayList<Object>  valor  ){
     try {
     String ruta = "C:\\Users\\Administrador\\Desktop\\ProyectoPeronsal\\Main/"+numeroarchivo+".txt";
     String contenido = "El producto Guardado es :"+valor+"te quedan bonitos no pierdas mas tu tiempo";
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

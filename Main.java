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
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Main {

    public static void main(String[] args) {
 ArrayList<Object> nombreArrayList = new ArrayList<Object>();

 Scanner datos =new Scanner (System.in);
  String ciclo1="s";
  String ciclo2="s";
  while(ciclo1.endsWith("s")){
     System.out.println("Escoja el registro de zapato que va a realizar selecciones el numero :");
     System.out.println("1.zapato en general");
     System.out.println("2.zapato de hombre ");
     System.out.println("3.zatapato de  mujer ");
     System.out.println("4.zapato de ninio");
     int menu=datos.nextInt();
     switch (menu){
         case 1 :
             while(ciclo2.equals("s")){
             System.out.println("1.zapato en general");
             System.out.println("Escriba  el tamanio del zapato");
             double talla=datos.nextDouble();
             System.out.println("Escriba el color del zapato");
             String color=datos.next();
             System.out.println("Escriba el estilo del zapato");
             String estilo=datos.next();
             Zapato mostrar =new Zapato(talla,color,estilo);
             nombreArrayList.add(mostrar);
             System.out.println("Desea salir s para si n para no");   
             ciclo2=datos.next();
             if(ciclo2.equals("s")){
                 ciclo2=ciclo2;
             }else{
               for(int i=0;i<nombreArrayList.size();i++){
                   
                   mostrar.filer2(i,nombreArrayList);
                   
               }
             }
             }
             break;
             case 2 :
                  while(ciclo2.equals("s")){
             System.out.println("1.zapato en general");
             System.out.println("Escriba  el tamanio del zapato");
             double talla=datos.nextDouble();
             System.out.println("Escriba el color del zapato");
             String color=datos.next();
             System.out.println("Escriba el estilo del zapato");
             String estilo=datos.next();
             System.out.println("COmodidad del zapato");
             String comodidad=datos.next();      
             hombre mostrar =new hombre(comodidad,talla,color,estilo);
             nombreArrayList.add(mostrar);
             System.out.println("Desea salir s para si n para no");   
             ciclo2=datos.next();
             if(ciclo2.equals("s")){
                 ciclo2=ciclo2;
             }else{
               for(int i=0;i<nombreArrayList.size();i++){
                   
                   mostrar.filer2(i,nombreArrayList);
                   
               }
             }
             }
             break;
             
             case 3 :
                   while(ciclo2.equals("s")){
             System.out.println("1.zapato en general");
             System.out.println("Escriba  el tamanio del zapato");
             double talla=datos.nextDouble();
             System.out.println("Escriba el color del zapato");
             String color=datos.next();
             System.out.println("Escriba el estilo del zapato");
             String estilo=datos.next();
             System.out.println("Que tan Bonitos son ");
             String sonbonitos=datos.next();        
             mujer mostrar =new mujer(sonbonitos,talla,color,estilo);
             nombreArrayList.add(mostrar);
             System.out.println("Desea salir s para si n para no");   
             ciclo2=datos.next();
             if(ciclo2.equals("s")){
                 ciclo2=ciclo2;
             }else{
               for(int i=0;i<nombreArrayList.size();i++){
                   
                   mostrar.filer2(i,nombreArrayList);
                   
               }
             }
             }   
             break;
             case 4 :
             while(ciclo2.equals("s")){
             System.out.println("1.zapato en general");
             System.out.println("Escriba  el tamanio del zapato");
             double talla=datos.nextDouble();
             System.out.println("Escriba el color del zapato");
             String color=datos.next();
             System.out.println("Escriba el estilo del zapato");
             String estilo=datos.next();
             System.out.println("Que figura pichinguito tiene ");
             String FiguraDelZapato=datos.next();        
             ninio mostrar =new ninio(FiguraDelZapato,talla,color,estilo);
             nombreArrayList.add(mostrar);
             System.out.println("Desea salir s para si n para no");   
             ciclo2=datos.next();
             if(ciclo2.equals("s")){
                 ciclo2=ciclo2;
             }else{
               for(int i=0;i<nombreArrayList.size();i++){
                   
                   mostrar.filer2(i,nombreArrayList);
                   
               }
             }
             }   
                 
             break;
             
             
         default:
             System.out.println("Opcion Invalida");
             break;
     } 
      System.out.println("Desea registras otro tipo de zapato");
      ciclo2=datos.next();
  }
       
     
    }
    
}

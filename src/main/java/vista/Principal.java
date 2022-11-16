/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import actorControl.ActorControl;
import java.time.LocalDate;
import modelo.Actors;
import modelo.Pelicula;

/**
 *
 * @author David
 */
public class Principal {
    public static void main(String[] args) {
   var actor1= new ActorControl();
   var datosActor1= new String[7];
   datosActor1[0]="Will Smith";
   datosActor1[1]="1968";
   datosActor1[2]="8";
   datosActor1[3]="25";
   datosActor1[4]="U.S";
   datosActor1[5]="Maculino";
   datosActor1[6]="1.70";
           
   System.out.print(actor1.crear(datosActor1));
    
    }
    
}

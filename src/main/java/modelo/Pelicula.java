/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author David
 */
public class Pelicula {
    private String nombre;
    private LocalDate yearStreno;
    private int starPuntation;
    private String descrition;
    private ArrayList<Actors> actorList;

    public Pelicula(String nombre, LocalDate yearStreno, int StarPuntation, String descrition) {
        this.nombre = nombre;
        this.yearStreno = yearStreno;
        this.starPuntation = StarPuntation;
        this.descrition = descrition;
        this.actorList= new ArrayList<Actors>();
    }
    public void listActor(Actors actor){
        this.actorList.add(actor);
    
    
 }
    public void Eliminar(String nombre){
  var indice=0;
        for (var actor:this.actorList){
            if(actor.getNombre()==nombre){
                this.actorList.remove(indice);
                break;
            }else{
                indice++;
                        
                        }
            
        }
  }
    public void Modificar(String nombre, Actors actor1){
  var indice=0;
        for (var actor:this.actorList){
            if(actor.getNombre()==nombre){
                this.actorList.set(indice,actor1);
                break;
            }else{
                indice++;
                        
                        }
            
        }
  }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getYearStreno() {
        return yearStreno;
    }

    public void setYearStreno(LocalDate yearStreno) {
        this.yearStreno = yearStreno;
    }

    public int getStarPuntation() {
        return starPuntation;
    }

    public void setStarPuntation(int StarPuntation) {
        this.starPuntation = StarPuntation;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    @Override
    public String toString() {
        var retorno= "Pelicula{" + "nombre=" + nombre + ", yearStreno=" + yearStreno + ", starPuntation=" + starPuntation + ", descrition=" + descrition+"}\n"+"Actores=" ;
        for (var actor:this.actorList){
            retorno+= actor.toString()+"\n";
        
        }
        return retorno;
        }
    }
    
    


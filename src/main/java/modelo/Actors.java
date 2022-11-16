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
public class Actors {

    private String nombre;
    private LocalDate fechadeNacimeinto;
    private String paisOrigen;
    private String genero;
    private double estatura;

    public Actors(String nombre, LocalDate fechadeNacimeinto, String paisOrigen, String genero, double estatura) {
        this.nombre = nombre;
        this.fechadeNacimeinto = fechadeNacimeinto;
        this.paisOrigen = paisOrigen;
        this.genero = genero;
        this.estatura = estatura;

    }

    public int calcularEdad() {
        var yearActual = LocalDate.now().getYear();
        var retorno = yearActual - this.fechadeNacimeinto.getYear();
        var monthActual = LocalDate.now().getMonthValue();
        var deiActual = LocalDate.now().getDayOfMonth();
        var x = monthActual - this.fechadeNacimeinto.getMonthValue();
        var s = deiActual - this.fechadeNacimeinto.getDayOfMonth();
        if (x < 0) {
            retorno -= 1;

        }
        if (x == 0) {
            if (s < 0) {
                retorno -= 1;
            }

        }

        return retorno;

    }
    public boolean ifWonOscar(){
     var retorno=false;
     var actor=this.nombre;
     var mejoresactores= new String[6];
     mejoresactores[0]="Daniel Day-Lewis";
     mejoresactores[1]="Jack Nicholson";
     mejoresactores[2]="Will Smith";
     mejoresactores[3]="Leonardo DiCaprio";
     mejoresactores[4]="Al Pacino";
     mejoresactores[5]="Tom Hanks";
     var num=mejoresactores.length;
     for(int i=0;i < num ;i++){
         if (actor == mejoresactores[i]){
             retorno=true;
         }
     
     }
     return retorno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechadeNacimeinto() {
        return fechadeNacimeinto;
    }

    public void setFechadeNacimeinto(LocalDate fechadeNacimeinto) {
        this.fechadeNacimeinto = fechadeNacimeinto;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", fechadeNacimeinto=" + fechadeNacimeinto +", edad="+this.calcularEdad()+", paisOrigen=" + paisOrigen + ", genero=" + genero + ", estatura=" + estatura +", Mejoractor="+this.ifWonOscar()+ '}';
    }

}

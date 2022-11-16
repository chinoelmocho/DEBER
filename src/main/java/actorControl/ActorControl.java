/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actorControl;

import actor_sevice.ActorService;
import actor_sevice.ActorServiceImpl;
import java.time.LocalDate;
import java.time.Month;
import modelo.Actors;

/**
 *
 * @author David
 */
public class ActorControl {
    private ActorServiceImpl actorServiceImpl;
    
    public ActorControl(){
        this.actorServiceImpl=new ActorServiceImpl();
    
    }
    public String crear(String[] data){
        var retorno="No se puede crear actor";
        var nombre=data[0];
        var año=Integer.valueOf(data[1]).intValue();
        var mes=Integer.valueOf(data[2]).intValue();
        var dia=Integer.valueOf(data[3]).intValue();
        var paisOrigen=data[4];
        var genero= data[5];
        var estatura= Double.valueOf(data[6]).doubleValue();
        
        if (año < (LocalDate.now().getYear()-124)){
            retorno+=" :Año de nacimeinto invalido";
            
        }else{
            if(genero!="Maculino" && genero != "Femenino"){
            retorno+=" :Genero no reconocido";
            
            }else{
            if (estatura< 0.628||estatura>2.72){
                retorno+=" :Estatura no valida";
                
            }else{
            var actor1 =new Actors( nombre, LocalDate.of(año, mes, dia),paisOrigen,genero,estatura);
            this.actorServiceImpl.crear(actor1);
            retorno ="El actor "+actor1.getNombre()+" creado correctamente";
            
            }
            
            
            
            }
        }
        return retorno;
    }
}

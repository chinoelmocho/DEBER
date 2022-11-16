/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actor_sevice;

import java.util.ArrayList;
import java.util.List;
import modelo.Actors;

/**
 *
 * @author David
 */
public class  ActorServiceImpl implements ActorService{
 private List<Actors> actorList;
 
 public ActorServiceImpl(){
 this.actorList=new ArrayList<>();
 }
    @Override
    public void crear(Actors actor) {
        this.actorList.add(actor);
    }

    @Override
    public List<Actors> listar() {
        return this.actorList;
    }

    @Override
    public void modificar(String nombre, Actors actor) {
         var indice=0;
        for (var actor1:this.actorList){
            if(actor1.getNombre()==nombre){
                this.actorList.set(indice,actor);
                break;
            }else{
                indice++;
                        
                        }
            
        }
        
        
    
    
    }

    @Override
    public void eliminar(String nombre) {
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
    
}

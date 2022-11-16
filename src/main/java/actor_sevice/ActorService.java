/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package actor_sevice;

import java.util.List;
import modelo.Actors;

/**
 *
 * @author David
 */
public interface ActorService {
    public abstract void crear(Actors actor);
    public abstract List<Actors> listar();
    public abstract void modificar(String nombre,Actors actor);
    public abstract void eliminar(String nombre);
}

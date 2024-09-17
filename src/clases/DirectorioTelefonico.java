/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author gouff
 */
public class DirectorioTelefonico {
    private Map<Long,Contacto> directorio;
    
    public DirectorioTelefonico() {
        this.directorio = new TreeMap<>();
    }
    
    public void agregarContacto(Long telefono, Contacto contacto){
        directorio.put(telefono, contacto);
    }
    
    public void borrarContacto (Long telefono){
        directorio.remove(telefono);
    }
    
    public Contacto buscarContacto (Long telefono){
        return directorio.get(telefono);
    }
    
    public Set<Long> buscarTelefono (String Apellido){
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long,Contacto> entry:directorio.entrySet()) {
            if(entry.getValue().getApellido().equalsIgnoreCase(Apellido)){
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }
    
    public List<Long> buscarContactos (String Ciudad){
        List<Long> contactos = new ArrayList<>();
        for (Map.Entry<Long,Contacto> entry:directorio.entrySet()) {
            if(entry.getValue().getCiudad().equalsIgnoreCase(Ciudad)){
                contactos.add(entry.getKey());
            }
        }
        return contactos;
    }
}


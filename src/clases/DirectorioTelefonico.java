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
import javax.swing.JOptionPane;

/**
 *
 * @author gouff
 */
public class DirectorioTelefonico {

    private Map<Long, Contacto> directorio;

    public DirectorioTelefonico() {
        this.directorio = new TreeMap<>();
    }

    public void agregarContacto(Long telefono, Contacto contacto) {
        if (directorio.containsKey(telefono)) {
            JOptionPane.showMessageDialog(null, "Este numero de telefono ya esta asociado a otro contacto.");
        } else {
            directorio.put(telefono, contacto);
            JOptionPane.showMessageDialog(null, "Se agrego el nuevo contacto.");
        }
    }

    public void borrarContacto(Long telefono) {
        if (directorio.containsKey(telefono)) {
            directorio.remove(telefono);
            JOptionPane.showMessageDialog(null, "El contacto fue borrado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El contacto que desea borrar no existe en el directorio telefonico!");
        }
    }

    public Contacto buscarContacto(Long telefono) {
        return directorio.get(telefono);
    }

    public Set<Long> buscarTelefono(String Apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(Apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

    public List<Long> buscarContactos(String Ciudad) {
        List<Long> contactos = new ArrayList<>();
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            if (entry.getValue().getCiudad().equalsIgnoreCase(Ciudad)) {
                contactos.add(entry.getKey());
            }
        }
        return contactos;
    }
}

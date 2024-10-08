/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author gouff
 */
public class Contacto {
    private String apellido;
    private String nombre;
    private Integer dni;
    private String ciudad;
    private String direccion;

    public Contacto(String apellido, String nombre, Integer dni, String ciudad, String direccion) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Contacto;" + "Apellido: " + apellido + ", Nombre: " + nombre + ", DNI: " + dni + ", Ciudad: " + ciudad + ", Direccion: " + direccion;
    }
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg2;

/**
 *
 * @author estudiante
 */
public class Estudiante {
    String codigo,nombre,direccion,genero,correo;

    public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, String direccion, String genero, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.genero = genero;
        this.correo = correo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getGenero() {
        return genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}

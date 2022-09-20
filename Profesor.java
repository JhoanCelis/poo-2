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
public class Profesor {
    String codigo,nombre,titulo;
    Departamento departamento;

    public Profesor() {
    }

    public Profesor(String codigo, String nombre, String titulo, Departamento departamento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.titulo = titulo;
        this.departamento = departamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
}

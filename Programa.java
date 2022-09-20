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
public class Programa {
    String codigo,nombre;
    Profesor director;

    public Programa() {
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getDirector() {
        return director;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirector(Profesor director) {
        this.director = director;
    }
    public String asignaturas(){
        return "Asignatura: Programacion Orientada a objetos II \n Codigo: 1152222 \n";
    }
}

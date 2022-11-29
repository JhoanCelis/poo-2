/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Departamento;

/**
 *
 * @author estudiante
 */
public class Prof_Catedra extends Profesor{
    public int numContrato,numHoras;
    public double valorHora;
    String categoria;
    public Prof_Catedra() {
    }

    public Prof_Catedra(int numContrato, int numHoras, double valorHora) {
        this.numContrato = numContrato;
        this.numHoras = numHoras;
        this.valorHora = valorHora;
    }

    public Prof_Catedra(int numContrato, int numHoras, double valorHora, String codigo, String nombre, String titulo, Departamento departamento) {
        super(codigo, nombre, titulo, departamento);
        this.numContrato = numContrato;
        this.numHoras = numHoras;
        this.valorHora = valorHora;
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
    public double calcularSalario(){
        double salario=0;
        if(categoria=="auxiliar"){
            valorHora=20000;
            salario=numHoras*valorHora;
        }
        if(categoria=="asistente"){
            valorHora=30000;
            salario=numHoras*valorHora;
        }
        if(categoria=="asistente"){
            valorHora=30000;
            salario=numHoras*valorHora;
        }
        return salario;
    }
}

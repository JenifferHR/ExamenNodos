/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Programación
 */
public class NodoCliente {
 
    String fecha,cedula, nombreCompleto,edad;
    NodoCliente siguiente;

    public NodoCliente(String fecha, String cedula, String nombreCompleto, String edad) {
        this.fecha = fecha;
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.siguiente = null;
    }

   

    public NodoCliente() {
    }

    public String getFecha() {
        return fecha;
    }
    public String getCedula() {
        return cedula;
    }

     public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public NodoCliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCliente siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "\n"+"NodoCliente{" + "fecha=" + fecha +"cedula=" + cedula + ", nombreCompleto=" + nombreCompleto + ", edad=" + edad + ", siguiente=" + siguiente + "\n"+ '}';
    }
    
    

}//fin de la clase

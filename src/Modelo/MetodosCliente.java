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
public class MetodosCliente {

    NodoCliente primero;

    public MetodosCliente() {

        primero = null;
    }

    //metodo que le ingresa el arreglo con la informacion ingresada por el cliente
    public void agregar(String arregloInformacionIngresada[]) {

        NodoCliente auxiliar;

        if (arregloInformacionIngresada[5].equalsIgnoreCase("7600")) {
            auxiliar = new NodoCliente(arregloInformacionIngresada[0], arregloInformacionIngresada[1], arregloInformacionIngresada[2], arregloInformacionIngresada[3]);
            auxiliar.setSiguiente(primero);
            primero = auxiliar;
        } else {
            //cuando no es la primera vez que se agrega
            if (primero != null) {
                auxiliar = devolverUltimo();
                auxiliar.setSiguiente(new NodoCliente(arregloInformacionIngresada[0], arregloInformacionIngresada[1], arregloInformacionIngresada[2], arregloInformacionIngresada[3]));
            } else {
                //cuando es la primera vez que se agrega
                auxiliar = new NodoCliente(arregloInformacionIngresada[0], arregloInformacionIngresada[1], arregloInformacionIngresada[2], arregloInformacionIngresada[3]);
                auxiliar.setSiguiente(primero);
                primero = auxiliar;
            }
        }
    }

    public String devolverLista() {

        //crea una variable auxiliar de tipo nodo, que será igual a primero
        NodoCliente auxiliar = primero;
        String listaClientes = "Lista:\n\n";

        while (auxiliar != null) { //mientras no sea el ultimo

            listaClientes += auxiliar.toString();

            auxiliar = auxiliar.getSiguiente(); //para q siga avanzando con el siguiente nodo
        }

        return listaClientes;
    }

    //devuelve el ultimo cliente ingresado

    public NodoCliente devolverUltimo() {

        NodoCliente auxiliar = primero;

        while (auxiliar.getSiguiente() != null) {
            auxiliar = auxiliar.getSiguiente();
        }
        return auxiliar;
    }//fin del metodo

    //devuelve el cliente q sera atendido de primero
    public String devolverInfoPrimero() {

        if (primero != null) {

            String atendiendo = "Atendiendo a cliente:\n\n";

            atendiendo += primero.toString() + "\n\n";

            return atendiendo;
        } else {
            return null;
        }
    }

    public void eliminarPrimero() {
        if (primero != null) //ahora el primero va a ser el que estaba despues de primero
        {
            primero = primero.getSiguiente();
        }
    }

    public int devolverCantidadClientes() {

        int contador = 1;
        NodoCliente auxiliar = primero;
        while (auxiliar.getSiguiente() != null) {
            contador++;
            auxiliar = auxiliar.getSiguiente();
        }

        return contador;
    }

    public void ordenarMayorAMenor() {
        int cantidadClientes = devolverCantidadClientes();
        String fichaTemporal, nombreTemporal, edadTemporal, servicioTemporal, prioridadTemporal;
        NodoCliente auxiliar = primero;

        for (int contador = 0; contador < cantidadClientes; contador++) {
            auxiliar = primero;
            while (auxiliar.siguiente != null) {
                if (Integer.parseInt(auxiliar.getEdad()) < Integer.parseInt(auxiliar.siguiente.getEdad())) {
                    fichaTemporal = auxiliar.getFecha();
                    nombreTemporal = auxiliar.getNombreCompleto();
                    edadTemporal = auxiliar.getEdad();

                    auxiliar.setFecha(auxiliar.getSiguiente().getFecha());
                    auxiliar.setNombreCompleto(auxiliar.getSiguiente().getNombreCompleto());
                    auxiliar.setEdad(auxiliar.getSiguiente().getEdad());

                    auxiliar.getSiguiente().setFecha(fichaTemporal);
                    auxiliar.getSiguiente().setNombreCompleto(nombreTemporal);
                    auxiliar.getSiguiente().setEdad(edadTemporal);

                }
                auxiliar = auxiliar.siguiente;
            }
        }
    }

    public void ordenarMenorAMayor() {
        int cantidadNodos = devolverCantidadClientes();
        String fichaTemporal, nombreTemporal, edadTemporal, prioridadTemporal;
        NodoCliente auxiliar = primero;
        for (int contador = 0; contador < cantidadNodos; contador++) {
            auxiliar = primero;
            while (auxiliar.siguiente != null) {
                if (Integer.parseInt(auxiliar.getEdad()) > Integer.parseInt(auxiliar.getSiguiente().getEdad())) {
                    {
                        fichaTemporal = auxiliar.getFecha();
                        nombreTemporal = auxiliar.getNombreCompleto();
                        edadTemporal = auxiliar.getEdad();

                        auxiliar.setFecha(auxiliar.getSiguiente().getFecha());
                        auxiliar.setNombreCompleto(auxiliar.getSiguiente().getNombreCompleto());
                        auxiliar.setEdad(auxiliar.getSiguiente().getEdad());

                        auxiliar.getSiguiente().setFecha(fichaTemporal);
                        auxiliar.getSiguiente().setNombreCompleto(nombreTemporal);
                        auxiliar.getSiguiente().setEdad(edadTemporal);
                    }
                    auxiliar = auxiliar.siguiente;
                }
            }
        }
    }

}//fin de la clase metodos

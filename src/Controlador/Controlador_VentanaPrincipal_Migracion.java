/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosCliente;
import Vista.VentanaPrincipal_Migracion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Programación
 */
public class Controlador_VentanaPrincipal_Migracion implements ActionListener {

    VentanaPrincipal_Migracion ventanaPrincipal_Migracion;
    MetodosCliente metodosCliente;
    public Controlador_VentanaPrincipal_Migracion(VentanaPrincipal_Migracion ventanaPrincipal_Migracion) {
        
        this.ventanaPrincipal_Migracion = ventanaPrincipal_Migracion;
        metodosCliente = new MetodosCliente();

    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            System.out.println("Se agrego correctamente ");
            metodosCliente.agregar(ventanaPrincipal_Migracion.devolverInformacionIngresada());
            //System.out.println("Se agrego correctamente "+ventanaPrincipal_Migracion.devolverInformacionIngresada());
            ventanaPrincipal_Migracion.resetearGUI();
            ventanaPrincipal_Migracion.generarFecha();
            ventanaPrincipal_Migracion.mostrarListaReportes(metodosCliente.devolverLista());

        }
        if(e.getActionCommand().equalsIgnoreCase("Atender"))
        {
             if(metodosCliente.devolverInfoPrimero()!=null) {
                ventanaPrincipal_Migracion.mostrarAtenderClientes(metodosCliente.devolverInfoPrimero());
                metodosCliente.eliminarPrimero();
            }
            else {
                ventanaPrincipal_Migracion.resetearJTA_Atendiendo();
                JOptionPane.showMessageDialog(null,"No existen clientes en espera");
            }
        }
        if(e.getActionCommand().equalsIgnoreCase("Eliminar"))
        {
        }
         if(e.getActionCommand().equalsIgnoreCase("Modificar"))
        {
        }
//        if(e.getActionCommand().equalsIgnoreCase("<"))
//        {
//             metodosCliente.ordenarMenorAMayor();
//            frm_PrincipalBanco.mostrarLista(metodosClientes.devolverLista());
//        }
        if(e.getActionCommand().equalsIgnoreCase("MayorQ"))
        {
        }
         if(e.getActionCommand().equalsIgnoreCase("Normal")) {
            ventanaPrincipal_Migracion.definirPrioridad("Normal");
        }
        if(e.getActionCommand().equalsIgnoreCase("7600")) {
            ventanaPrincipal_Migracion.definirPrioridad("7600");
        }
    }
    
    
}

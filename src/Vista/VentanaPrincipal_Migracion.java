/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_VentanaPrincipal_Migracion;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author Programación
 */
public class VentanaPrincipal_Migracion extends javax.swing.JFrame {

    Controlador_VentanaPrincipal_Migracion controlador_VentanaPrincipal_Migracion;
    private String prioridad;
    
    public VentanaPrincipal_Migracion() {
        super("Departamento de Migracion");
        initComponents();
        controlador_VentanaPrincipal_Migracion = new Controlador_VentanaPrincipal_Migracion(this);
        generarFecha();
        definirJCBox();
        agregarEventos(controlador_VentanaPrincipal_Migracion);
        
    }

    //se ponen a escuchar a los botones, el controlador
     public void agregarEventos(ActionListener controlador) {
        this.jB_Agregar.addActionListener(controlador);
        this.jB_Eliminar.addActionListener(controlador);
        this.jB_Modificar.addActionListener(controlador);
        this.jB_MayorQ.addActionListener(controlador);
        this.jB_menorQ.addActionListener(controlador);
        this.jCB_Prioridad.addActionListener(controlador);
    }
    public void definirJCBox()
    {
         this.jCB_Prioridad.removeAllItems();
         
         this.jCB_Prioridad.addItem("2700");
         this.jCB_Prioridad.addItem("Normal");
    }
    
    public void resetearJTA_Atendiendo() {
        this.jTA_AtendiendoCliente.setText("");
    }
    public void resetearGUI() {
        this.jTF_Nombre.setText("");
        this.jTF_Edad.setText("");
    }
    public void mostrarListaReportes(String lista) {
        
        this.jTA_Reportes.setText("");
        this.jTA_Reportes.setText(lista);
    }
    public void mostrarAtenderClientes(String atendiendo) {
        
        this.jTA_AtendiendoCliente.setText("");
        this.jTA_AtendiendoCliente.setText(atendiendo);
    }
     public void definirPrioridad(String prioridad) {
        this.prioridad=prioridad;
    }
   public String[] devolverInformacionIngresada() {
        
        String arregloInformacionIngresada[]= new String[5];
        
        arregloInformacionIngresada[0]=this.jTF_Fecha.getText();
        arregloInformacionIngresada[1]=this.jTF_Nombre.getText().trim();
        arregloInformacionIngresada[2]=this.jTF_Cedula.getText().trim();
        arregloInformacionIngresada[3]=this.jTF_Edad.getText().trim();
        arregloInformacionIngresada[4]=this.prioridad;
        
        
        return arregloInformacionIngresada;
    }//fin del metodo
   
   public void generarFecha() {
        
       Calendar fechaCita;
        int numero = 0;
        Random aleatorio;
        aleatorio = new Random();
        
        this.jTF_Fecha.setText("");
        fechaCita = Calendar.getInstance();
        fechaCita.set (aleatorio.nextInt(10)+2016, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        this.jTF_Fecha.setText(sdf.format(fechaCita.getTime()));
        //System.out.println("Fecha de la  " + sdf.format(fechaCita.getTime()));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_TituloRegistrar = new javax.swing.JLabel();
        jL_Nombre = new javax.swing.JLabel();
        jL_Cedula = new javax.swing.JLabel();
        jL_Edad = new javax.swing.JLabel();
        jTF_Nombre = new javax.swing.JTextField();
        jTF_Cedula = new javax.swing.JTextField();
        jTF_Edad = new javax.swing.JTextField();
        jCB_Prioridad = new javax.swing.JComboBox();
        jL_Prioridad = new javax.swing.JLabel();
        jB_Agregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_AtendiendoCliente = new javax.swing.JTextArea();
        jB_Modificar = new javax.swing.JButton();
        jB_Eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTA_Reportes = new javax.swing.JTextArea();
        jB_menorQ = new javax.swing.JButton();
        jB_MayorQ = new javax.swing.JButton();
        jL_Fecha = new javax.swing.JLabel();
        jTF_Fecha = new javax.swing.JTextField();
        jB_Atender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jL_TituloRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/call client.png"))); // NOI18N
        jL_TituloRegistrar.setText("Registrar cliente:");

        jL_Nombre.setText("Nombre:");

        jL_Cedula.setText("Cédula:");

        jL_Edad.setText("Edad:");

        jCB_Prioridad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jL_Prioridad.setText("Prioridad");

        jB_Agregar.setText("Agregar");

        jLabel1.setText("Atender Cliente:");

        jTA_AtendiendoCliente.setColumns(20);
        jTA_AtendiendoCliente.setRows(5);
        jScrollPane1.setViewportView(jTA_AtendiendoCliente);

        jB_Modificar.setText("Modificar");

        jB_Eliminar.setText("Eliminar");

        jLabel2.setText("Reportes");

        jTA_Reportes.setColumns(20);
        jTA_Reportes.setRows(5);
        jScrollPane2.setViewportView(jTA_Reportes);

        jB_menorQ.setText("<");

        jB_MayorQ.setText(">");

        jL_Fecha.setText("Fecha:");

        jB_Atender.setText("Atender");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jL_Prioridad)
                        .addGap(18, 18, 18)
                        .addComponent(jCB_Prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_TituloRegistrar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jL_Nombre)
                                    .addComponent(jL_Cedula)
                                    .addComponent(jL_Edad)
                                    .addComponent(jL_Fecha))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTF_Nombre)
                                    .addComponent(jTF_Cedula)
                                    .addComponent(jTF_Edad, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(jTF_Fecha))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jB_menorQ)
                                        .addGap(18, 18, 18)
                                        .addComponent(jB_MayorQ))
                                    .addComponent(jLabel1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jB_Atender)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_Eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_TituloRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_Fecha)
                            .addComponent(jTF_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_Nombre)
                            .addComponent(jTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_Cedula)
                            .addComponent(jTF_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Atender)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_Edad)
                            .addComponent(jTF_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCB_Prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jL_Prioridad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB_Agregar)
                            .addComponent(jB_Modificar)
                            .addComponent(jB_Eliminar))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB_menorQ)
                            .addComponent(jB_MayorQ))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal_Migracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal_Migracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal_Migracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal_Migracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal_Migracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Agregar;
    private javax.swing.JButton jB_Atender;
    private javax.swing.JButton jB_Eliminar;
    private javax.swing.JButton jB_MayorQ;
    private javax.swing.JButton jB_Modificar;
    private javax.swing.JButton jB_menorQ;
    private javax.swing.JComboBox jCB_Prioridad;
    private javax.swing.JLabel jL_Cedula;
    private javax.swing.JLabel jL_Edad;
    private javax.swing.JLabel jL_Fecha;
    private javax.swing.JLabel jL_Nombre;
    private javax.swing.JLabel jL_Prioridad;
    private javax.swing.JLabel jL_TituloRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTA_AtendiendoCliente;
    private javax.swing.JTextArea jTA_Reportes;
    private javax.swing.JTextField jTF_Cedula;
    private javax.swing.JTextField jTF_Edad;
    private javax.swing.JTextField jTF_Fecha;
    private javax.swing.JTextField jTF_Nombre;
    // End of variables declaration//GEN-END:variables
}

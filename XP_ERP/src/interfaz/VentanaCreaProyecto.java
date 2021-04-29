/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author tello
 */
public class VentanaCreaProyecto extends javax.swing.JFrame implements WindowListener{

    private final Main ventanaMain;
    /**
     * Creates new form VentanaCreaUsuario
     */
    public VentanaCreaProyecto(Main vm) {
        initComponents();
        this.ventanaMain = vm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        contenedorLogo = new javax.swing.JPanel();
        etiquetaLogo = new javax.swing.JLabel();
        contenedorBotones = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaEmpleado = new javax.swing.JLabel();
        etiquetaRol = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        botonAlta = new javax.swing.JButton();
        textoNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        etiquetaDuracion = new javax.swing.JLabel();
        comboBoxEmpleado = new javax.swing.JComboBox<>();
        comboBoxRol = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        etiquetaLogo.setText("NOMBRE MOLON");

        javax.swing.GroupLayout contenedorLogoLayout = new javax.swing.GroupLayout(contenedorLogo);
        contenedorLogo.setLayout(contenedorLogoLayout);
        contenedorLogoLayout.setHorizontalGroup(
            contenedorLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLogoLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(etiquetaLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorLogoLayout.setVerticalGroup(
            contenedorLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLogoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(etiquetaLogo)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        etiquetaNombre.setText("Nombre del Proyecto:");

        etiquetaEmpleado.setText("Seleccione al empleado:");

        etiquetaRol.setText("Asigna el Rol:");

        botonVolver.setText("VOLVER");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonAlta.setText("CREAR PROYECTO");

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiquetaDuracion.setText("Asigna la duración:");

        javax.swing.GroupLayout contenedorBotonesLayout = new javax.swing.GroupLayout(contenedorBotones);
        contenedorBotones.setLayout(contenedorBotonesLayout);
        contenedorBotonesLayout.setHorizontalGroup(
            contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(contenedorBotonesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaDuracion)
                    .addComponent(botonVolver)
                    .addComponent(etiquetaRol)
                    .addComponent(etiquetaNombre)
                    .addComponent(etiquetaEmpleado))
                .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorBotonesLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorBotonesLayout.createSequentialGroup()
                                .addComponent(textoNombre)
                                .addGap(89, 89, 89))
                            .addGroup(contenedorBotonesLayout.createSequentialGroup()
                                .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(114, Short.MAX_VALUE))))
                    .addGroup(contenedorBotonesLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        contenedorBotonesLayout.setVerticalGroup(
            contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEmpleado)
                    .addComponent(comboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaRol)
                    .addComponent(comboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etiquetaDuracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonAlta))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(contenedorLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ventanaMain.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlta;
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<String> comboBoxEmpleado;
    private javax.swing.JComboBox<String> comboBoxRol;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel contenedorBotones;
    private javax.swing.JPanel contenedorLogo;
    private javax.swing.JLabel etiquetaDuracion;
    private javax.swing.JLabel etiquetaEmpleado;
    private javax.swing.JLabel etiquetaLogo;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaRol;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent we) {
    }

    @Override
    public void windowClosing(WindowEvent we) {
        this.dispose();
        ventanaMain.setVisible(true);
    }

    @Override
    public void windowClosed(WindowEvent we) {
        this.dispose();
        ventanaMain.setVisible(true);
    }

    @Override
    public void windowIconified(WindowEvent we) {
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
    }

    @Override
    public void windowActivated(WindowEvent we) {
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
    }
}
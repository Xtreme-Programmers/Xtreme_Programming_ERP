package interfaz;

import excepciones.MyException;
import gestoras.GestoraProyecto;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import modelo.Proyecto;

/**
 *
 * @author tello
 */
public class VentanaCreaProyecto extends javax.swing.JFrame implements WindowListener {

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
        botonVolver = new javax.swing.JButton();
        botonAlta = new javax.swing.JButton();
        textoNombre = new javax.swing.JTextField();
        etiquetaDuracion = new javax.swing.JLabel();
        textoDuracion = new javax.swing.JTextField();
        loco = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        contenedorLogo.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaLogo.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        etiquetaLogo.setText("NOMBRE MOLÓN");

        javax.swing.GroupLayout contenedorLogoLayout = new javax.swing.GroupLayout(contenedorLogo);
        contenedorLogo.setLayout(contenedorLogoLayout);
        contenedorLogoLayout.setHorizontalGroup(
            contenedorLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaLogo)
                .addGap(225, 225, 225))
        );
        contenedorLogoLayout.setVerticalGroup(
            contenedorLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLogoLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(etiquetaLogo)
                .addContainerGap())
        );

        contenedorBotones.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        etiquetaNombre.setText("Nombre del Proyecto:");

        botonVolver.setBackground(new java.awt.Color(0, 0, 0));
        botonVolver.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonVolver.setText("VOLVER");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonAlta.setBackground(new java.awt.Color(0, 0, 0));
        botonAlta.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAlta.setText("CREAR PROYECTO");
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });

        textoNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });

        etiquetaDuracion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        etiquetaDuracion.setText("Asigna la duración del Proyecto:");

        textoDuracion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDuracionActionPerformed(evt);
            }
        });

        loco.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loco.gif"))); // NOI18N

        javax.swing.GroupLayout locoLayout = new javax.swing.GroupLayout(loco);
        loco.setLayout(locoLayout);
        locoLayout.setHorizontalGroup(
            locoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locoLayout.setVerticalGroup(
            locoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorBotonesLayout = new javax.swing.GroupLayout(contenedorBotones);
        contenedorBotones.setLayout(contenedorBotonesLayout);
        contenedorBotonesLayout.setHorizontalGroup(
            contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaDuracion)
                    .addComponent(etiquetaNombre)
                    .addComponent(loco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoDuracion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(contenedorBotonesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        contenedorBotonesLayout.setVerticalGroup(
            contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorBotonesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNombre))
                .addGap(18, 18, 18)
                .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaDuracion))
                .addGap(18, 18, 18)
                .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorBotonesLayout.createSequentialGroup()
                        .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenedorBotonesLayout.createSequentialGroup()
                        .addComponent(loco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
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

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // Esto nos servira para limpiar la seleccion actual y pasarle el foco al campo contraseña una vez se pulse enter  
        evt.setSource((char) KeyEvent.VK_CLEAR);
        textoDuracion.requestFocus();
    }//GEN-LAST:event_textoNombreActionPerformed

    private void textoDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDuracionActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        botonAlta.requestFocus();
    }//GEN-LAST:event_textoDuracionActionPerformed

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed
        String nombreProyecto = textoNombre.getText();
        String duracionProyecto = textoDuracion.getText();
        try {
            Proyecto p = new Proyecto(nombreProyecto, duracionProyecto);
            if (GestoraProyecto.addProyecto(p)) {
                JOptionPane.showMessageDialog(this, "Proyecto creado mi capitan");
                limpiarFormulario();
            } else {
                JOptionPane.showMessageDialog(this, "Proyecto no creado mi capitan, ya existe un proyecto con ese nombre, mi capitan");
            }
        } catch (MyException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_botonAltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlta;
    private javax.swing.JButton botonVolver;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel contenedorBotones;
    private javax.swing.JPanel contenedorLogo;
    private javax.swing.JLabel etiquetaDuracion;
    private javax.swing.JLabel etiquetaLogo;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel loco;
    private javax.swing.JTextField textoDuracion;
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

    private void limpiarFormulario() {
        textoDuracion.setText("");
        textoNombre.setText("");
    }
}

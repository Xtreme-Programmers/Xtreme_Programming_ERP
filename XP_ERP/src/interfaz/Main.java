/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import excepciones.MyException;
import gestoras.GestoraEquipo;
import gestoras.GestoraProyecto;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Proyecto;
import modelo.Story;

/**
 *
 * @author tello
 */
public class Main extends javax.swing.JFrame implements WindowListener{

    /**
     * Creates new form Main
     */
    public Main() {
        this.addWindowListener(this);
        initComponents();
        inicializa();
        estadoInicial();
        estadoInicialPruebas();//BORRAR//Método para navegar a las otras ventanas sin loguearse que usaremos durante las pruebas
        rellenaConDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        contenedorCabecera = new javax.swing.JPanel();
        etiquetaLogo = new javax.swing.JLabel();
        contenedorLog = new javax.swing.JPanel();
        separador = new javax.swing.JSeparator();
        etiquetaLogin = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaPassw = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoPassw = new javax.swing.JPasswordField();
        botonLogin = new javax.swing.JButton();
        contenedorMenu = new javax.swing.JPanel();
        botonAlta = new javax.swing.JButton();
        botonCrearPro = new javax.swing.JButton();
        botonVerPro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaLogo.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        etiquetaLogo.setText("NOMBRE DE NUESTRA SUPERAPLICACION");

        javax.swing.GroupLayout contenedorCabeceraLayout = new javax.swing.GroupLayout(contenedorCabecera);
        contenedorCabecera.setLayout(contenedorCabeceraLayout);
        contenedorCabeceraLayout.setHorizontalGroup(
            contenedorCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorCabeceraLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etiquetaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        contenedorCabeceraLayout.setVerticalGroup(
            contenedorCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        separador.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiquetaLogin.setFont(new java.awt.Font("Pristina", 1, 14)); // NOI18N
        etiquetaLogin.setText("ACCESO DE USUARIOS");

        etiquetaNombre.setText("Nombre de usuario:");

        etiquetaPassw.setText("Contraseña:");

        botonLogin.setText("LOGIN");
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLogLayout = new javax.swing.GroupLayout(contenedorLog);
        contenedorLog.setLayout(contenedorLogLayout);
        contenedorLogLayout.setHorizontalGroup(
            contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLogLayout.createSequentialGroup()
                .addGroup(contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLogLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(etiquetaLogin))
                    .addGroup(contenedorLogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaNombre)
                            .addComponent(etiquetaPassw))
                        .addGap(29, 29, 29)
                        .addGroup(contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoPassw, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(textoNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        contenedorLogLayout.setVerticalGroup(
            contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPassw)
                    .addComponent(textoPassw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenedorLogLayout.createSequentialGroup()
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        botonAlta.setText("CREAR USUARIO");
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });

        botonCrearPro.setText("NUEVO PROYECTO");
        botonCrearPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearProActionPerformed(evt);
            }
        });

        botonVerPro.setText("VER PROYECTO");
        botonVerPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorMenuLayout = new javax.swing.GroupLayout(contenedorMenu);
        contenedorMenu.setLayout(contenedorMenuLayout);
        contenedorMenuLayout.setHorizontalGroup(
            contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorMenuLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCrearPro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerPro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        contenedorMenuLayout.setVerticalGroup(
            contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorMenuLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCrearPro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerPro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(contenedorLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenedorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addComponent(contenedorCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addComponent(contenedorCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedorMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
        // TODO add your handling code here:
        estadoMenu();
    }//GEN-LAST:event_botonLoginActionPerformed

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed
        // TODO add your handling code here:
        VentanaCreaUsuario vcu = new VentanaCreaUsuario(this);
        vcu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAltaActionPerformed

    private void botonCrearProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearProActionPerformed
        // TODO add your handling code here:
        VentanaCreaProyecto vcp = new VentanaCreaProyecto(this);
        vcp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCrearProActionPerformed

    private void botonVerProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerProActionPerformed
        VentanaVerProyectos vvp = new VentanaVerProyectos(this);
        vvp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVerProActionPerformed

    public void estadoInicial(){
        textoNombre.setEnabled(true);
        textoPassw.setEnabled(true);
        botonLogin.setEnabled(true);
        
        botonAlta.setEnabled(false);
        botonCrearPro.setEnabled(false);
        botonVerPro.setEnabled(false);
        
    }
    
    public void estadoMenu(){
        textoNombre.setEnabled(false);
        textoPassw.setEnabled(false);
        botonLogin.setEnabled(false);
        
        botonAlta.setEnabled(true);
        botonCrearPro.setEnabled(true);
        botonVerPro.setEnabled(true);
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlta;
    private javax.swing.JButton botonCrearPro;
    private javax.swing.JButton botonLogin;
    private javax.swing.JButton botonVerPro;
    private javax.swing.JPanel contenedorCabecera;
    private javax.swing.JPanel contenedorLog;
    private javax.swing.JPanel contenedorMenu;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JLabel etiquetaLogin;
    private javax.swing.JLabel etiquetaLogo;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPassw;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JPasswordField textoPassw;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent we) {
    }

    @Override
    public void windowClosing(WindowEvent we) {
        fin();
    }

    @Override
    public void windowClosed(WindowEvent we) {
        fin();
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

    /**
     * Método para navegar a las otras ventanas sin loguearse que usaremos durante las pruebas
     * @deprecated 
     */
    private void estadoInicialPruebas() {
        botonAlta.setEnabled(true);
        botonCrearPro.setEnabled(true);
        botonVerPro.setEnabled(true);
    }

    private void inicializa() {
        GestoraProyecto.inicializa();
        GestoraEquipo.inicializa();
    }

    private void fin() {
        this.dispose();
        System.exit(0);
    }

    private void rellenaConDatos() {
        try {
            Story s1 = new Story("Investigación previa", "3", "En un lugar de la Mancha, de cuyo nombre no quiero acordarme");
            Story s2 = new Story("Clase Usuario", "2", "No ha mucho tiempo que vivía un hidalgo de los de lanza en astillero");
            Story s3 = new Story("Reunión técnica con Cliente", "2", "Adarga antigua, rocín flaco y galgo corredor.");
            Story s4 = new Story("Interfaz Main", "6", "Una olla de algo más vaca que carnero, salpicón las más noches");
            Story s5 = new Story("Clase gestora", "4", "Duelos y quebrantos los sábados, lantejas los viernes");
            Story s6 = new Story("Creación clases Junit", "1", "Algún palomino de añadidura los domingos, consumían las tres partes de su hacienda.");
            Story s7 = new Story("Algorimos modelo", "4", "El resto della concluían sayo de velarte, calzas de velludo para las fiestas");
            Story s8 = new Story("Conectar interfaz", "9", "Con sus pantuflos de lo mesmo, y los días de entresemana se honraba con su vellorí de lo más fino.");
            Proyecto p1 = new Proyecto("Aplicación Tin-Tinder", "Es una app que le da mil vueltas a Tinder");
            p1.setEstadoProyecto("enCurso");
            p1.aniadeStory(s1);
            p1.aniadeStory(s2);
            p1.aniadeStory(s3);
            p1.aniadeStory(s4);
            p1.aniadeStory(s5);
            p1.aniadeStory(s6);
            p1.aniadeStory(s7);
            p1.aniadeStory(s8);
            GestoraProyecto.addProyecto(p1);
            Proyecto p2 = new Proyecto("Web sobre gatitos", "Lo nuncavisto: una web de fotos de gatitos!");
            p2.setEstadoProyecto("enCurso");
            p2.aniadeStory(s1);
            p2.aniadeStory(s2);
            p2.aniadeStory(s3);
            p2.aniadeStory(s4);
            p2.aniadeStory(s5);
            p2.aniadeStory(s6);
            p2.aniadeStory(s7);
            p2.aniadeStory(s8);
            GestoraProyecto.addProyecto(p2);
            Proyecto p3 = new Proyecto("Base de datos de patos", "Esta base de patos controla tus patos de datos");
            p3.setEstadoProyecto("archivado");
            p3.aniadeStory(s1);
            p3.aniadeStory(s2);
            p3.aniadeStory(s3);
            p3.aniadeStory(s4);
            p3.aniadeStory(s5);
            p3.aniadeStory(s6);
            p3.aniadeStory(s7);
            p3.aniadeStory(s8);
            GestoraProyecto.addProyecto(p3);
            Proyecto p4 = new Proyecto("¿Por que la gente no aprende inglés", "Por que el ingles se enseña mal");
            p4.setEstadoProyecto("archivado");
            p4.aniadeStory(s1);
            p4.aniadeStory(s2);
            p4.aniadeStory(s3);
            p4.aniadeStory(s4);
            p4.aniadeStory(s5);
            p4.aniadeStory(s6);
            p4.aniadeStory(s7);
            p4.aniadeStory(s8);
            GestoraProyecto.addProyecto(p4);
        } catch (MyException ex) {
            Consola.muestraMensaje(ex.getMessage());
        }
    }
}

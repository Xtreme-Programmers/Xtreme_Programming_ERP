package interfaz;

import excepciones.MyException;
import gestoras.GestoraEquipo;
import gestoras.GestoraProyecto;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.MiembroEquipo;
import modelo.Proyecto;
import modelo.Story;

/**
 *
 * @author tello
 */
public class Main extends javax.swing.JFrame implements WindowListener {

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
        separador = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        contenedorCabecera.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaLogo.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        etiquetaLogo.setText("NOMBRE DE NUESTRA SUPERAPLICACIÓN");

        javax.swing.GroupLayout contenedorCabeceraLayout = new javax.swing.GroupLayout(contenedorCabecera);
        contenedorCabecera.setLayout(contenedorCabeceraLayout);
        contenedorCabeceraLayout.setHorizontalGroup(
            contenedorCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorCabeceraLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(etiquetaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        contenedorCabeceraLayout.setVerticalGroup(
            contenedorCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorCabeceraLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(etiquetaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        contenedorLog.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaLogin.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaLogin.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        etiquetaLogin.setText("ACCESO DE USUARIOS");

        etiquetaNombre.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        etiquetaNombre.setText("Nombre de usuario:");

        etiquetaPassw.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        etiquetaPassw.setText("Contraseña:");

        textoNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });

        textoPassw.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        botonLogin.setBackground(new java.awt.Color(0, 0, 0));
        botonLogin.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
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
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(etiquetaLogin)
                .addGap(93, 93, 93))
            .addGroup(contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLogLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contenedorLogLayout.createSequentialGroup()
                            .addGroup(contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(etiquetaNombre)
                                .addComponent(etiquetaPassw))
                            .addGap(29, 29, 29)
                            .addGroup(contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textoPassw)
                                .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(botonLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(27, Short.MAX_VALUE)))
        );
        contenedorLogLayout.setVerticalGroup(
            contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLogLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(etiquetaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLogLayout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addGroup(contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaNombre)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contenedorLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaPassw)
                        .addComponent(textoPassw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );

        contenedorMenu.setBackground(new java.awt.Color(255, 255, 255));

        botonAlta.setBackground(new java.awt.Color(0, 0, 0));
        botonAlta.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAlta.setText("CREAR USUARIO");
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });

        botonCrearPro.setBackground(new java.awt.Color(0, 0, 0));
        botonCrearPro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonCrearPro.setText("NUEVO PROYECTO");
        botonCrearPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearProActionPerformed(evt);
            }
        });

        botonVerPro.setBackground(new java.awt.Color(0, 0, 0));
        botonVerPro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
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
            .addGroup(contenedorMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCrearPro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerPro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        contenedorMenuLayout.setVerticalGroup(
            contenedorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorMenuLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCrearPro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerPro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        separador.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenedorLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(contenedorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addComponent(contenedorCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(contenedorLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contenedorMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    public void estadoInicial() {
        textoNombre.setEnabled(true);
        textoPassw.setEnabled(true);
        botonLogin.setEnabled(true);

        botonAlta.setEnabled(false);
        botonCrearPro.setEnabled(false);
        botonVerPro.setEnabled(false);

    }

    public void estadoMenu() {
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
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Consola.muestraMensaje(ex.getMessage());
        } catch (InstantiationException ex) {
            Consola.muestraMensaje(ex.getMessage());
        } catch (IllegalAccessException ex) {
            Consola.muestraMensaje(ex.getMessage());
        } catch (UnsupportedLookAndFeelException ex) {
            Consola.muestraMensaje(ex.getMessage());
        }
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
     * Método para navegar a las otras ventanas sin loguearse que usaremos
     * durante las pruebas
     *
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
            MiembroEquipo m1 = new MiembroEquipo("M01", "1234");
            MiembroEquipo m2 = new MiembroEquipo("M02", "1234");
            MiembroEquipo m3 = new MiembroEquipo("M03", "1234");
            MiembroEquipo m4 = new MiembroEquipo("M04", "1234");
            MiembroEquipo m5 = new MiembroEquipo("M05", "1234");
            MiembroEquipo m6 = new MiembroEquipo("M06", "1234");
            MiembroEquipo m7 = new MiembroEquipo("M07", "1234");
            MiembroEquipo m8 = new MiembroEquipo("M08", "1234");
            MiembroEquipo m9 = new MiembroEquipo("M09", "1234");
            MiembroEquipo m10 = new MiembroEquipo("M010", "1234");
            MiembroEquipo m11 = new MiembroEquipo("M011", "1234");
            MiembroEquipo m12 = new MiembroEquipo("M012", "1234");
            MiembroEquipo m13 = new MiembroEquipo("M013", "1234");
            MiembroEquipo m14 = new MiembroEquipo("M014", "1234");
            MiembroEquipo m15 = new MiembroEquipo("M015", "1234");
            MiembroEquipo m16 = new MiembroEquipo("M016", "1234");
            GestoraEquipo.addMiembro(m1);
            GestoraEquipo.addMiembro(m2);
            GestoraEquipo.addMiembro(m3);
            GestoraEquipo.addMiembro(m4);
            GestoraEquipo.addMiembro(m5);
            GestoraEquipo.addMiembro(m6);
            GestoraEquipo.addMiembro(m7);
            GestoraEquipo.addMiembro(m8);
            GestoraEquipo.addMiembro(m9);
            GestoraEquipo.addMiembro(m10);
            GestoraEquipo.addMiembro(m11);
            GestoraEquipo.addMiembro(m12);
            GestoraEquipo.addMiembro(m13);
            GestoraEquipo.addMiembro(m14);
            GestoraEquipo.addMiembro(m15);
            GestoraEquipo.addMiembro(m16);
            Story s1 = new Story("Investigación previa", "3", "En un lugar de la Mancha, de cuyo nombre no quiero acordarme");
            Story s2 = new Story("Clase Usuario", "2", "No ha mucho tiempo que vivía un hidalgo de los de lanza en astillero");
            Story s3 = new Story("Reunión técnica con Cliente", "2", "Adarga antigua, rocín flaco y galgo corredor.");
            Story s4 = new Story("Interfaz Main", "6", "Una olla de algo más vaca que carnero, salpicón las más noches");
            Story s5 = new Story("Clase gestora", "4", "Duelos y quebrantos los sábados, lantejas los viernes");
            Story s6 = new Story("Creación clases Junit", "1", "Algún palomino de añadidura los domingos, consumían las tres partes de su hacienda.");
            Story s7 = new Story("Algorimos modelo", "4", "El resto della concluían sayo de velarte, calzas de velludo para las fiestas");
            Story s8 = new Story("Conectar interfaz", "9", "Con sus pantuflos de lo mesmo, y los días de entresemana se honraba con su vellorí de lo más fino.");
            s1.setMiembroEquipo(m1, m9);
            s2.setMiembroEquipo(m2, m10);
            s3.setMiembroEquipo(m3, m11);
            s4.setMiembroEquipo(m4, m12);
            s5.setMiembroEquipo(m5, m13);
            s6.setMiembroEquipo(m6, m14);
            s7.setMiembroEquipo(m7, m15);
            s8.setMiembroEquipo(m8, m16);
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

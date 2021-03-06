package interfaz;

import excepciones.MyException;
import gestoras.GestoraProyecto;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashSet;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Proyecto;

/**
 *
 * @author ryano
 */
public class VentanaVerProyectos extends javax.swing.JFrame implements WindowListener, ListSelectionListener {

    private final Main VENTANA_MAIN;
    private DefaultTableModel modeloTablaEnCurso;
    private DefaultTableModel modeloTablaArchivado;
    private VentanaCreaProyecto vC;

    /**
     * Creates new form VentanaVerProyectos
     */
    public VentanaVerProyectos(Main v) {
        this.addWindowListener(this);
        initComponents();
        this.VENTANA_MAIN = v;
        vC = new VentanaCreaProyecto(VENTANA_MAIN);
        modeloListenerTablas();
        rellenaTablas();
    }

    private void modeloListenerTablas() {
        modeloTablaArchivado = (DefaultTableModel) tablaArchivados.getModel();
        ListSelectionModel modeloSelectArchivados = tablaArchivados.getSelectionModel();
        modeloSelectArchivados.addListSelectionListener(this);

        modeloTablaEnCurso = (DefaultTableModel) tablaEnCurso.getModel();
        ListSelectionModel modeloSelectEnCurso = tablaEnCurso.getSelectionModel();
        modeloSelectEnCurso.addListSelectionListener(this);
    }

    VentanaVerProyectos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        contenedorTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contenedorBotones = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();
        botonNuevoProyecto = new javax.swing.JButton();
        contenedorFlechas = new javax.swing.JPanel();
        botonCambiaArchivado = new javax.swing.JButton();
        botonCambiaEnCurso = new javax.swing.JButton();
        contenedorArchivados = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaArchivados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        botonEliminaProyectoArchivado = new javax.swing.JButton();
        botonVerStoriesArchivados = new javax.swing.JButton();
        contenedorEnCurso = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEnCurso = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        botonEliminaProyectoEnCurso = new javax.swing.JButton();
        botonVerStoriesEnCurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        contenedorPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        contenedorTitulo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vista de Proyectos");

        javax.swing.GroupLayout contenedorTituloLayout = new javax.swing.GroupLayout(contenedorTitulo);
        contenedorTitulo.setLayout(contenedorTituloLayout);
        contenedorTituloLayout.setHorizontalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorTituloLayout.setVerticalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );

        contenedorBotones.setBackground(new java.awt.Color(255, 255, 255));

        botonVolver.setBackground(new java.awt.Color(0, 0, 0));
        botonVolver.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        botonVolver.setText("VOLVER");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonNuevoProyecto.setBackground(new java.awt.Color(0, 0, 0));
        botonNuevoProyecto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        botonNuevoProyecto.setText("NUEVO PROYECTO");
        botonNuevoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorBotonesLayout = new javax.swing.GroupLayout(contenedorBotones);
        contenedorBotones.setLayout(contenedorBotonesLayout);
        contenedorBotonesLayout.setHorizontalGroup(
            contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonNuevoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contenedorBotonesLayout.setVerticalGroup(
            contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonNuevoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        contenedorFlechas.setBackground(new java.awt.Color(255, 255, 255));

        botonCambiaArchivado.setBackground(new java.awt.Color(255, 255, 255));
        botonCambiaArchivado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dch.gif"))); // NOI18N
        botonCambiaArchivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiaArchivadoActionPerformed(evt);
            }
        });

        botonCambiaEnCurso.setBackground(new java.awt.Color(255, 255, 255));
        botonCambiaEnCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izq.gif"))); // NOI18N
        botonCambiaEnCurso.setToolTipText("");
        botonCambiaEnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiaEnCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorFlechasLayout = new javax.swing.GroupLayout(contenedorFlechas);
        contenedorFlechas.setLayout(contenedorFlechasLayout);
        contenedorFlechasLayout.setHorizontalGroup(
            contenedorFlechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFlechasLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(contenedorFlechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorFlechasLayout.createSequentialGroup()
                        .addComponent(botonCambiaEnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorFlechasLayout.createSequentialGroup()
                        .addComponent(botonCambiaArchivado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        contenedorFlechasLayout.setVerticalGroup(
            contenedorFlechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFlechasLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(botonCambiaArchivado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(botonCambiaEnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        contenedorArchivados.setBackground(new java.awt.Color(255, 255, 255));

        tablaArchivados.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaArchivados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcci??n"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaArchivados);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Proyectos Archivados");

        botonEliminaProyectoArchivado.setBackground(new java.awt.Color(0, 0, 0));
        botonEliminaProyectoArchivado.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        botonEliminaProyectoArchivado.setText("Elimina Proyecto");
        botonEliminaProyectoArchivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminaProyectoArchivadoActionPerformed(evt);
            }
        });

        botonVerStoriesArchivados.setBackground(new java.awt.Color(0, 0, 0));
        botonVerStoriesArchivados.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        botonVerStoriesArchivados.setText("Ver Stories de Proyecto");
        botonVerStoriesArchivados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerStoriesArchivadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorArchivadosLayout = new javax.swing.GroupLayout(contenedorArchivados);
        contenedorArchivados.setLayout(contenedorArchivadosLayout);
        contenedorArchivadosLayout.setHorizontalGroup(
            contenedorArchivadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorArchivadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorArchivadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonVerStoriesArchivados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addComponent(botonEliminaProyectoArchivado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenedorArchivadosLayout.setVerticalGroup(
            contenedorArchivadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorArchivadosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonVerStoriesArchivados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEliminaProyectoArchivado)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        contenedorEnCurso.setBackground(new java.awt.Color(255, 255, 255));

        tablaEnCurso.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaEnCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcci??n"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEnCurso);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Proyectos en Curso");

        botonEliminaProyectoEnCurso.setBackground(new java.awt.Color(0, 0, 0));
        botonEliminaProyectoEnCurso.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        botonEliminaProyectoEnCurso.setText("Elimina Proyecto");
        botonEliminaProyectoEnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminaProyectoEnCursoActionPerformed(evt);
            }
        });

        botonVerStoriesEnCurso.setBackground(new java.awt.Color(0, 0, 0));
        botonVerStoriesEnCurso.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        botonVerStoriesEnCurso.setText("Ver Stories de Proyecto");
        botonVerStoriesEnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerStoriesEnCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorEnCursoLayout = new javax.swing.GroupLayout(contenedorEnCurso);
        contenedorEnCurso.setLayout(contenedorEnCursoLayout);
        contenedorEnCursoLayout.setHorizontalGroup(
            contenedorEnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contenedorEnCursoLayout.createSequentialGroup()
                .addGroup(contenedorEnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(botonVerStoriesEnCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEliminaProyectoEnCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenedorEnCursoLayout.setVerticalGroup(
            contenedorEnCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorEnCursoLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonVerStoriesEnCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEliminaProyectoEnCurso)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(contenedorArchivados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenedorFlechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contenedorEnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(contenedorBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorArchivados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contenedorEnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contenedorFlechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        volver();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonVerStoriesEnCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerStoriesEnCursoActionPerformed
        Proyecto p = seleccionaEnCurso();
        if (p != null) {
            VentanaVerStories vvs = new VentanaVerStories(this, p);
            vvs.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonVerStoriesEnCursoActionPerformed

    private void botonCambiaArchivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiaArchivadoActionPerformed
        Proyecto p = seleccionaArchivado();
        if (p != null) {
            try {
                p.setEstadoProyecto("enCurso");
                limpiaTablas();
                rellenaTablas();
            } catch (MyException ex) {
                Consola.muestraMensaje(ex.getMessage());
            }
        }
    }//GEN-LAST:event_botonCambiaArchivadoActionPerformed

    private void botonCambiaEnCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiaEnCursoActionPerformed
        Proyecto p = seleccionaEnCurso();
        if (p != null) {
            try {
                p.setEstadoProyecto("archivado");
                limpiaTablas();
                rellenaTablas();
            } catch (MyException ex) {
                Consola.muestraMensaje(ex.getMessage());
            }
        }
    }//GEN-LAST:event_botonCambiaEnCursoActionPerformed

    private void botonVerStoriesArchivadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerStoriesArchivadosActionPerformed
        Proyecto p = seleccionaArchivado();
        if (p != null) {
            VentanaVerStories vvs = new VentanaVerStories(this, p);
            vvs.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonVerStoriesArchivadosActionPerformed

    private void botonEliminaProyectoArchivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminaProyectoArchivadoActionPerformed
        Proyecto p = seleccionaArchivado();
        if (p != null) {
            if (Consola.pideOpcion("Seguro?") == 0) {
                try {
                    GestoraProyecto.eliminaProyecto(p);
                } catch (MyException ex) {
                    Consola.muestraMensaje(ex.getMessage());
                }
                Consola.muestraMensaje("Eliminado");
                limpiaTablas();
                rellenaTablas();
            }
        }
    }//GEN-LAST:event_botonEliminaProyectoArchivadoActionPerformed

    private void botonEliminaProyectoEnCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminaProyectoEnCursoActionPerformed
        Proyecto p = seleccionaEnCurso();
        if (p != null) {
            if (Consola.pideOpcion("Seguro?") == 0) {
                try {
                    GestoraProyecto.eliminaProyecto(p);
                } catch (MyException ex) {
                    Consola.muestraMensaje(ex.getMessage());
                }
                Consola.muestraMensaje("Eliminado");
                limpiaTablas();
                rellenaTablas();
            }
        }
    }//GEN-LAST:event_botonEliminaProyectoEnCursoActionPerformed

    private void botonNuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoProyectoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        vC.setVisible(true);
    }//GEN-LAST:event_botonNuevoProyectoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCambiaArchivado;
    private javax.swing.JButton botonCambiaEnCurso;
    private javax.swing.JButton botonEliminaProyectoArchivado;
    private javax.swing.JButton botonEliminaProyectoEnCurso;
    private javax.swing.JButton botonNuevoProyecto;
    private javax.swing.JButton botonVerStoriesArchivados;
    private javax.swing.JButton botonVerStoriesEnCurso;
    private javax.swing.JButton botonVolver;
    private javax.swing.JPanel contenedorArchivados;
    private javax.swing.JPanel contenedorBotones;
    private javax.swing.JPanel contenedorEnCurso;
    private javax.swing.JPanel contenedorFlechas;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JPanel contenedorTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaArchivados;
    private javax.swing.JTable tablaEnCurso;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent we) {
    }

    @Override
    public void windowClosing(WindowEvent we) {
        volver();
    }

    @Override
    public void windowClosed(WindowEvent we) {
        volver();
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

    private void volver() {
        this.dispose();
        VENTANA_MAIN.setVisible(true);
    }

    private void rellenaTablas() {
        HashSet<Proyecto> listaProyectos = GestoraProyecto.getListaProyectos();

        String filaTabla[] = new String[3];
        for (Proyecto p : listaProyectos) {
            filaTabla[0] = p.getIdProyecto() + "";
            filaTabla[1] = p.getNombreProyecto();
            filaTabla[2] = p.getDescripcion();
            if (p.getEstadoProyecto().equals("archivado")) {
                modeloTablaArchivado.addRow(filaTabla);
            } else if (p.getEstadoProyecto().equals("enCurso")) {
                modeloTablaEnCurso.addRow(filaTabla);
            }
        }
    }

    private void limpiaTablas() {
        modeloTablaArchivado.setNumRows(0);
        modeloTablaEnCurso.setNumRows(0);
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
    }

    private Proyecto seleccionaArchivado() {
        try {
            int fila = tablaArchivados.getSelectedRow();
            String id = tablaArchivados.getValueAt(fila, 0) + "";
            return GestoraProyecto.buscaProyecto(id);
        } catch (MyException ex) {
            Consola.muestraMensaje(ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            Consola.muestraMensaje("Selecciona un proyecto archivado ababol!");
        }
        return null;
    }

    private Proyecto seleccionaEnCurso() {
        try {
            int fila = tablaEnCurso.getSelectedRow();
            String id = tablaEnCurso.getValueAt(fila, 0) + "";
            return GestoraProyecto.buscaProyecto(id);
        } catch (MyException ex) {
            Consola.muestraMensaje(ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            Consola.muestraMensaje("Selecciona un proyecto archivado ababol!");
        }
        return null;
    }
}

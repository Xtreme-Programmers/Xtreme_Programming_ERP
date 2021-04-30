/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import excepciones.MyException;
import gestoras.GestoraProyecto;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Proyecto;

/**
 *
 * @author ryano
 */
public class VentanaVerProyectos extends javax.swing.JFrame implements WindowListener, ListSelectionListener{

    private final Main VENTANA_MAIN;
    private DefaultTableModel modeloTablaEnCurso;
    private DefaultTableModel modeloTablaArchivado;
    /**
     * Creates new form VentanaVerProyectos
     */
    public VentanaVerProyectos(Main v) {
        this.addWindowListener(this);
        initComponents();
        this.VENTANA_MAIN = v;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaArchivados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        botonEliminaProyectoArchivado = new javax.swing.JButton();
        botonVerStoriesArchivados = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEnCurso = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        botonEliminaProyectoEnCurso = new javax.swing.JButton();
        botonVerStoriesEnCurso = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();
        botonNuevoProyecto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        botonCambiaArchivado = new javax.swing.JButton();
        botonCambiaEnCurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vista de Proyectos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tablaArchivados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcción"
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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Proyectos Archivados");

        botonEliminaProyectoArchivado.setText("Elimina Proyecto");
        botonEliminaProyectoArchivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminaProyectoArchivadoActionPerformed(evt);
            }
        });

        botonVerStoriesArchivados.setText("Ver Stories de Proyecto");
        botonVerStoriesArchivados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerStoriesArchivadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEliminaProyectoArchivado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonVerStoriesArchivados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonVerStoriesArchivados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEliminaProyectoArchivado)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tablaEnCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcción"
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

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Proyectos en Curso");

        botonEliminaProyectoEnCurso.setText("Elimina Proyecto");
        botonEliminaProyectoEnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminaProyectoEnCursoActionPerformed(evt);
            }
        });

        botonVerStoriesEnCurso.setText("Ver Stories de Proyecto");
        botonVerStoriesEnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerStoriesEnCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(botonEliminaProyectoEnCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonVerStoriesEnCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
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

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonNuevoProyecto.setText("Nuevo Proyecto");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonNuevoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevoProyecto)
                    .addComponent(botonVolver))
                .addGap(51, 51, 51))
        );

        botonCambiaArchivado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha_Dch.png"))); // NOI18N
        botonCambiaArchivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiaArchivadoActionPerformed(evt);
            }
        });

        botonCambiaEnCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha_Izq.png"))); // NOI18N
        botonCambiaEnCurso.setToolTipText("");
        botonCambiaEnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiaEnCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonCambiaEnCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonCambiaArchivado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(botonCambiaArchivado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botonCambiaEnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCambiaArchivado;
    private javax.swing.JButton botonCambiaEnCurso;
    private javax.swing.JButton botonEliminaProyectoArchivado;
    private javax.swing.JButton botonEliminaProyectoEnCurso;
    private javax.swing.JButton botonNuevoProyecto;
    private javax.swing.JButton botonVerStoriesArchivados;
    private javax.swing.JButton botonVerStoriesEnCurso;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
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

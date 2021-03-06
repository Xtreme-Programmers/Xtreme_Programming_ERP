package interfaz;

import excepciones.MyException;
import gestoras.GestoraEquipo;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.MiembroEquipo;
import modelo.Proyecto;
import modelo.Story;

/**
 *
 * @author ryano
 */
public class VentanaVerStories extends javax.swing.JFrame implements WindowListener, ListSelectionListener {

    private VentanaVerProyectos VENTANA_PROYECTOS;
    private DefaultTableModel modeloTablaStories;
    private DefaultComboBoxModel modeloComboA;
    private DefaultComboBoxModel modeloComboB;
    private Proyecto p;
    private boolean modoAniadir;

    /**
     * Creates new form VentanaVerStories
     */
    public VentanaVerStories(VentanaVerProyectos v, Proyecto p) {
        this.addWindowListener(this);
        initComponents();
        etiquetaNombreProyecto.setText(p.getNombreProyecto());
        this.VENTANA_PROYECTOS = v;
        this.p = p;
        modoAniadir = true;
        modeloTablaStories = (DefaultTableModel) tablaStories.getModel();
        ListSelectionModel modeloSelectStories = tablaStories.getSelectionModel();
        modeloSelectStories.addListSelectionListener(this);
        modeloComboA = (DefaultComboBoxModel) comboMiembroA.getModel();
        modeloComboB = (DefaultComboBoxModel) comboMiembroB.getModel();
        rellenaTabla();
        rellenaCombos();
        setPanelAniadeStory(false);
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
        jPanel1 = new javax.swing.JPanel();
        etiquetaNombreProyecto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        botonAniadeStory = new javax.swing.JButton();
        botonModificaStory = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaStories = new javax.swing.JTable();
        botonConfirmaAniadirModificarStory = new javax.swing.JButton();
        contenedorColumna = new javax.swing.JPanel();
        etiqueta_Titulo = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        etiqueta_Contenido = new javax.swing.JLabel();
        campoContenido = new javax.swing.JTextField();
        etiqueta_horasEstimadas = new javax.swing.JLabel();
        campoHorasEstimadas = new javax.swing.JTextField();
        etiqueta_HorasFinales = new javax.swing.JLabel();
        campoHorasFinales = new javax.swing.JTextField();
        etiqueta_MiembroA = new javax.swing.JLabel();
        comboMiembroA = new javax.swing.JComboBox<>();
        etiqueta_MiembroB = new javax.swing.JLabel();
        comboMiembroB = new javax.swing.JComboBox<>();
        botonCancelaCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        contenedorPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaNombreProyecto.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        etiquetaNombreProyecto.setText("NOMBRE DEL PROYECTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(etiquetaNombreProyecto)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(etiquetaNombreProyecto)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        botonAniadeStory.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonAniadeStory.setText("A??ADE STORY");
        botonAniadeStory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAniadeStoryActionPerformed(evt);
            }
        });

        botonModificaStory.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonModificaStory.setText("MODIFICA STORY");
        botonModificaStory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificaStoryActionPerformed(evt);
            }
        });

        botonVolver.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonVolver.setText("VOLVER");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(botonAniadeStory, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(botonModificaStory, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addComponent(botonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonAniadeStory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonModificaStory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tablaStories.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Story", "Descripci??n", "Horas estimadas", "Horas finales", "Miembro A", "Miembro B"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaStories);

        botonConfirmaAniadirModificarStory.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonConfirmaAniadirModificarStory.setText("CONFIRMA A??ADIR STORY");
        botonConfirmaAniadirModificarStory.setActionCommand("Confirma A??adir/Modificar Story");
        botonConfirmaAniadirModificarStory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmaAniadirModificarStoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonConfirmaAniadirModificarStory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(botonConfirmaAniadirModificarStory, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        contenedorColumna.setBackground(new java.awt.Color(255, 255, 255));

        etiqueta_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_Titulo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        etiqueta_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_Titulo.setText("Nombre de la Story");

        campoTitulo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        etiqueta_Contenido.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        etiqueta_Contenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_Contenido.setText("Contenido de la Story");

        campoContenido.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        etiqueta_horasEstimadas.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        etiqueta_horasEstimadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_horasEstimadas.setText("Horas estimadas");
        etiqueta_horasEstimadas.setToolTipText("");

        campoHorasEstimadas.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        etiqueta_HorasFinales.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        etiqueta_HorasFinales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_HorasFinales.setText("Horas Finales");

        campoHorasFinales.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        etiqueta_MiembroA.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        etiqueta_MiembroA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_MiembroA.setText("Miembro A");

        comboMiembroA.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        comboMiembroA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Miembro A" }));

        etiqueta_MiembroB.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        etiqueta_MiembroB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_MiembroB.setText("Miembro B");

        comboMiembroB.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        comboMiembroB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Miembro B" }));
        comboMiembroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMiembroBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorColumnaLayout = new javax.swing.GroupLayout(contenedorColumna);
        contenedorColumna.setLayout(contenedorColumnaLayout);
        contenedorColumnaLayout.setHorizontalGroup(
            contenedorColumnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorColumnaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorColumnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorColumnaLayout.createSequentialGroup()
                        .addComponent(etiqueta_Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(contenedorColumnaLayout.createSequentialGroup()
                        .addGroup(contenedorColumnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(etiqueta_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(campoContenido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTitulo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(contenedorColumnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorColumnaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contenedorColumnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(comboMiembroA, 0, 242, Short.MAX_VALUE)
                        .addComponent(comboMiembroB, 0, 242, Short.MAX_VALUE)
                        .addComponent(etiqueta_MiembroB, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                        .addComponent(etiqueta_MiembroA, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                        .addComponent(campoHorasFinales, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                        .addComponent(etiqueta_HorasFinales, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                        .addComponent(campoHorasEstimadas, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                        .addComponent(etiqueta_horasEstimadas, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        contenedorColumnaLayout.setVerticalGroup(
            contenedorColumnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorColumnaLayout.createSequentialGroup()
                .addComponent(etiqueta_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiqueta_Contenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 318, Short.MAX_VALUE))
            .addGroup(contenedorColumnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorColumnaLayout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(etiqueta_horasEstimadas)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(campoHorasEstimadas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(etiqueta_HorasFinales)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(campoHorasFinales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(etiqueta_MiembroA)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(comboMiembroA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addComponent(etiqueta_MiembroB)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(comboMiembroB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );

        botonCancelaCambios.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonCancelaCambios.setText("CANCELAR");
        botonCancelaCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelaCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelaCambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(contenedorColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(143, Short.MAX_VALUE)))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(botonCancelaCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(contenedorColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(243, Short.MAX_VALUE)))
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

    private void botonAniadeStoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAniadeStoryActionPerformed
        setPanelAniadeStory(true);
        setBotonesPrincipales(false);
        botonConfirmaAniadirModificarStory.setText("A??ADE NUEVA STORY");
        modoAniadir = true;
    }//GEN-LAST:event_botonAniadeStoryActionPerformed

    private void botonModificaStoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificaStoryActionPerformed
        setPanelAniadeStory(true);
        setBotonesPrincipales(false);
        botonConfirmaAniadirModificarStory.setText("MODIFICA STORY SELECCIONADA");
        modoAniadir = false;
    }//GEN-LAST:event_botonModificaStoryActionPerformed

    private void botonConfirmaAniadirModificarStoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmaAniadirModificarStoryActionPerformed

        if (modoAniadir == true) {
            Story s;
            try {
                s = new Story(campoTitulo.getText(), campoHorasEstimadas.getText(), campoContenido.getText());
                p.aniadeStory(s);
                limpiaTabla();
                rellenaTabla();
            } catch (MyException ex) {
                Consola.muestraMensaje(ex.getMessage());
            }
        } else {
            Story s = seleccionaStory();
            try {
                if (s != null) {
                    s.setTitulo(campoTitulo.getText());
                    s.setContenido(campoContenido.getText());
                    s.setHorasEstimadas(campoHorasEstimadas.getText());
                    s.setHorasFinales(campoHorasFinales.getText());
                    //MiembroEquipo mEA = (MiembroEquipo) comboMiembroA.getSelectedItem();
                    //MiembroEquipo mEB = (MiembroEquipo) comboMiembroB.getSelectedItem();
                    //s.setMiembroEquipo(mEA, mEB);
                }
                limpiaTabla();
                rellenaTabla();
            } catch (MyException ex) {
                Consola.muestraMensaje(ex.getMessage());
            }
        }

    }//GEN-LAST:event_botonConfirmaAniadirModificarStoryActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        volver();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonCancelaCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelaCambiosActionPerformed
        setPanelAniadeStory(false);
        setPanelModificaStory(false);
        setBotonesPrincipales(true);
        limpiaFormulario();
    }//GEN-LAST:event_botonCancelaCambiosActionPerformed

    private void comboMiembroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMiembroBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMiembroBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAniadeStory;
    private javax.swing.JButton botonCancelaCambios;
    private javax.swing.JButton botonConfirmaAniadirModificarStory;
    private javax.swing.JButton botonModificaStory;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoContenido;
    private javax.swing.JTextField campoHorasEstimadas;
    private javax.swing.JTextField campoHorasFinales;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JComboBox<String> comboMiembroA;
    private javax.swing.JComboBox<String> comboMiembroB;
    private javax.swing.JPanel contenedorColumna;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JLabel etiquetaNombreProyecto;
    private javax.swing.JLabel etiqueta_Contenido;
    private javax.swing.JLabel etiqueta_HorasFinales;
    private javax.swing.JLabel etiqueta_MiembroA;
    private javax.swing.JLabel etiqueta_MiembroB;
    private javax.swing.JLabel etiqueta_Titulo;
    private javax.swing.JLabel etiqueta_horasEstimadas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaStories;
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
        VENTANA_PROYECTOS.setVisible(true);
    }

    private void rellenaTabla() {
        HashSet<Story> listaStories = p.getListaStories();
        String filaTabla[] = new String[6];
        for (Story s : listaStories) {
            String horasFinales = s.getHorasFinales() + "";
            if (horasFinales.equals("0")) {
                horasFinales = "Tarea en curso";
            }
            MiembroEquipo mEA = s.getMiembroA();
            String nombreMiembroA;
            if (mEA == null) {
                nombreMiembroA = "Sin asignar";
            } else {
                nombreMiembroA = mEA.getIdMiembro();
            }
            MiembroEquipo mEB = s.getMiembroB();
            String nombreMiembroB;
            if (mEB == null) {
                nombreMiembroB = "Sin asignar";
            } else {
                nombreMiembroB = mEB.getIdMiembro();
            }
            filaTabla[0] = s.getTitulo();
            filaTabla[1] = s.getContenido();
            filaTabla[2] = s.getHorasEstimadas() + "";
            filaTabla[3] = horasFinales;
            filaTabla[4] = nombreMiembroA;
            filaTabla[5] = nombreMiembroB;
            modeloTablaStories.addRow(filaTabla);
        }
    }

    private void limpiaTabla() {
        modeloTablaStories.setRowCount(0);
    }

    private void setPanelModificaStory(boolean b) {
        etiqueta_Titulo.setEnabled(b);
        campoTitulo.setEnabled(b);
        etiqueta_Contenido.setEnabled(b);
        campoContenido.setEnabled(b);
        etiqueta_horasEstimadas.setEnabled(b);
        campoHorasEstimadas.setEnabled(b);
        etiqueta_HorasFinales.setEnabled(b);
        campoHorasFinales.setEnabled(b);
        etiqueta_MiembroA.setEnabled(b);
        comboMiembroA.setEnabled(b);
        etiqueta_MiembroB.setEnabled(b);
        comboMiembroB.setEnabled(b);
        botonConfirmaAniadirModificarStory.setVisible(b);
        botonCancelaCambios.setVisible(b);
        botonConfirmaAniadirModificarStory.setText("Modifica Story");
    }

    private void setPanelAniadeStory(boolean b) {
        etiqueta_Titulo.setEnabled(b);
        campoTitulo.setEnabled(b);
        etiqueta_Contenido.setEnabled(b);
        campoContenido.setEnabled(b);
        etiqueta_horasEstimadas.setEnabled(b);
        campoHorasEstimadas.setEnabled(b);

        etiqueta_HorasFinales.setVisible(b);
        campoHorasFinales.setVisible(b);
        etiqueta_MiembroA.setEnabled(b);
        comboMiembroA.setEnabled(b);
        etiqueta_MiembroB.setEnabled(b);
        comboMiembroB.setEnabled(b);

        botonConfirmaAniadirModificarStory.setVisible(b);
        botonCancelaCambios.setVisible(b);
        botonConfirmaAniadirModificarStory.setText("A??ade Story");
    }

    private void setBotonesPrincipales(boolean b) {
        botonAniadeStory.setEnabled(b);
        botonModificaStory.setEnabled(b);
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        if (modoAniadir == false) {
            Story s = seleccionaStory();
            if (s != null) {
                campoTitulo.setText(s.getTitulo());
                campoContenido.setText(s.getContenido());
                campoHorasEstimadas.setText(s.getHorasEstimadas() + "");
                campoHorasFinales.setText(s.getHorasFinales() + "");
                comboMiembroA.setSelectedItem(s.getMiembroA());
                comboMiembroB.setSelectedItem(s.getMiembroB());
            } else {
                System.out.println("Story es null");
            }

        }
    }

    private void rellenaCombos() {
        HashSet<MiembroEquipo> listadoMiembros = GestoraEquipo.getLista();
        for (MiembroEquipo m : listadoMiembros) {
            modeloComboA.addElement(m);
            modeloComboB.addElement(m);
        }
    }

    private Story seleccionaStory() {
        try {
            int fila = tablaStories.getSelectedRow();
            System.out.println("Fila: " + fila);
            String titulo = (String) tablaStories.getValueAt(fila, 0);
            System.out.println("Titulo = " + titulo);
            return p.buscaStory(titulo);
        } catch (MyException ex) {
            Consola.muestraMensaje(ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            Consola.muestraMensaje("Selecciona una Story ababol!");
        }
        return null;
    }

    private void limpiaFormulario() {
        campoContenido.setText("");
        campoHorasEstimadas.setText("");
        campoHorasFinales.setText("");
        campoTitulo.setText("");
        comboMiembroA.setSelectedIndex(0);
        comboMiembroB.setSelectedIndex(0);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.vista.Prestamo;

import ec.edu.ups.vista.Biblioteca.*;
import ec.edu.ups.controlador.BibliotecaControlador;
import ec.edu.ups.controlador.PrestamoControlador;
import ec.edu.ups.modelo.Biblioteca;
import ec.edu.ups.modelo.Prestamo;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author fernan
 */
public class VentanaEditarPrestamo extends javax.swing.JInternalFrame {

    private PrestamoControlador prestamoControlador;
    private ResourceBundle mensajes;
    private String tituloOriginal;

    /**
     * Creates new form VentanaCrearBiblioteca
     */
    public VentanaEditarPrestamo(PrestamoControlador prestamoControlador) {
        initComponents();
        this.prestamoControlador = prestamoControlador;
        mensajes = ResourceBundle.getBundle("mensajes.mensajes", Locale.getDefault());
        tituloOriginal = "Editar Prestamo"; 
        setTitle(tituloOriginal); 
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
        jlCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        MenuLibro = new javax.swing.JLabel();
        MenuUsuario = new javax.swing.JLabel();
        FechaP = new javax.swing.JLabel();
        txtLibro = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtFechaPrestamo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        Autor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        Año = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        Disponible = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        Correo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtDisponible = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        Codigo = new javax.swing.JLabel();
        Identificacion = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editar Prestamo");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setToolTipText("");

        jlCodigo.setText("Ingrese el codigo del Prestamo a Editar");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        MenuLibro.setText("Libro");

        MenuUsuario.setText("Usuario");

        FechaP.setText("Fecha de prestamo");

        txtLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibroActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Titulo.setText("Titulo");

        txtTitulo.setEditable(false);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        Autor.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Autor.setText("Autor");

        txtAutor.setEditable(false);

        Año.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Año.setText("Año");

        txtAño.setEditable(false);

        Disponible.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Disponible.setText("Disponible");

        Nombre.setText("Nombre");

        txtNombre.setEditable(false);

        Apellido.setText("Apellido");

        txtApellido.setEditable(false);

        Correo.setText("Correo");

        txtCorreo.setEditable(false);

        txtDisponible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "No Disponible" }));
        txtDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisponibleActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        Codigo.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Codigo.setText("Codigo");

        Identificacion.setText("Identificacion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MenuLibro)
                        .addGap(34, 34, 34)
                        .addComponent(Codigo)
                        .addGap(32, 32, 32)
                        .addComponent(txtLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(MenuUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Nombre)
                                .addGap(470, 470, 470))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Apellido)
                                            .addComponent(Correo))
                                        .addGap(34, 34, 34))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnBuscar)
                                            .addComponent(Identificacion))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(FechaP)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(Disponible)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlCodigo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Titulo)
                                .addGap(71, 71, 71)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Autor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Año)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MenuLibro)
                    .addComponent(txtLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Codigo)
                    .addComponent(Identificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Autor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Año)
                    .addComponent(Correo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Disponible)
                            .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnCancelar))))
                .addGap(287, 287, 287))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        int codigo = Integer.parseInt(txtCodigo.getText());
        Prestamo prestamo = prestamoControlador.read(codigo);
        if (prestamo == null) {
            JOptionPane.showMessageDialog(this, "No se ha encontrado el prestamo");
        } else {
            txtLibro.setText(String.valueOf(prestamo.getLibro().getId()));
            txtLibro.setEditable(true);
            txtTitulo.setText(prestamo.getLibro().getTitulo());
            txtAutor.setText(prestamo.getLibro().getAutor());
            txtAño.setText(String.valueOf(prestamo.getLibro().getAño()));
            if (prestamo.getLibro().isDisponible() == true) {
                txtDisponible.setSelectedItem("Disponible");
            } else {
                txtDisponible.setSelectedItem("No  Disponible");
            }
            txtTitulo.setEditable(false);
            txtAutor.setEditable(false);
            txtAño.setEditable(false);
            txtDisponible.setEditable(false);

            txtUsuario.setText(prestamo.getUsuario().getIdentificacion());
            txtUsuario.setEditable(true);
            txtNombre.setText(prestamo.getUsuario().getNombre());
            txtApellido.setText(prestamo.getUsuario().getApellido());
            txtCorreo.setText(prestamo.getUsuario().getCorreo());
            txtNombre.setEditable(false);
            txtApellido.setEditable(false);
            txtCorreo.setEditable(false);
            txtFechaPrestamo.setText(prestamo.getFechaPrestamo());
            txtFechaPrestamo.setEditable(true);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed

    }//GEN-LAST:event_txtTituloActionPerformed

    public void cambiarIdioma(Locale locale) {
        mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        setTitle(mensajes.getString("EditarPrestamo"));
        Nombre.setText(mensajes.getString("Nombre"));
        Identificacion.setText(mensajes.getString("Identificacion"));
        Apellido.setText(mensajes.getString("Apellido"));
        Correo.setText(mensajes.getString("Correo"));
        btnCancelar.setText(mensajes.getString("btnCancelar"));
        Titulo.setText(mensajes.getString("Titulo"));
        Autor.setText(mensajes.getString("Autor"));
        Año.setText(mensajes.getString("Año"));
        Disponible.setText(mensajes.getString("Disponible"));
        btnGuardar.setText(mensajes.getString("btnGuardar"));
        btnBuscar.setText(mensajes.getString("btnBuscar"));
        Codigo.setText(mensajes.getString("Codigo"));
        MenuUsuario.setText(mensajes.getString("MenuUsuario"));
        MenuLibro.setText(mensajes.getString("MenuLibro"));
        FechaP.setText(mensajes.getString("FechaP"));
        jlCodigo.setText(mensajes.getString("jlCodigo"));
    }


    private void txtDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisponibleActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        Prestamo prestamo = prestamoControlador.read(codigo);
        if (prestamo == null) {
            JOptionPane.showMessageDialog(this, "No se ha encontrado el prestamo ");
        } else {
            txtLibro.setText(String.valueOf(prestamo.getLibro().getId()));
            txtTitulo.setText(prestamo.getLibro().getTitulo());
            txtAutor.setText(prestamo.getLibro().getAutor());
            txtAño.setText(String.valueOf(prestamo.getLibro().getAño()));
            if (prestamo.getLibro().isDisponible() == true) {
                txtDisponible.setSelectedItem("Disponible");
            } else {
                txtDisponible.setSelectedItem("No  Disponible");
            }
            txtUsuario.setText(prestamo.getUsuario().getIdentificacion());
            txtNombre.setText(prestamo.getUsuario().getNombre());
            txtApellido.setText(prestamo.getUsuario().getApellido());
            txtCorreo.setText(prestamo.getUsuario().getCorreo());
            txtFechaPrestamo.setText(prestamo.getFechaPrestamo());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLibroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void limpiarDatos() {
        txtCodigo.setEditable(true);
        txtLibro.setEditable(false);
        txtUsuario.setEditable(false);
        txtFechaPrestamo.setEditable(false);

        txtCodigo.setText("");
        txtLibro.setText("");
        txtUsuario.setText("");
        txtFechaPrestamo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Autor;
    private javax.swing.JLabel Año;
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Disponible;
    private javax.swing.JLabel FechaP;
    private javax.swing.JLabel Identificacion;
    private javax.swing.JLabel MenuLibro;
    private javax.swing.JLabel MenuUsuario;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JComboBox<String> txtDisponible;
    private javax.swing.JTextField txtFechaPrestamo;
    private javax.swing.JTextField txtLibro;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import conexion.Database;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import util.ConexionMysql;

/**
 *
 * @author Astrid Caicedo
 */
public class Productos extends javax.swing.JFrame {
    private InicioSesion inicio;
    private double total;
    private double valor;
    /**
     * Creates new form Productos
     */
    public Productos(InicioSesion i) {
        initComponents();
        cargarProductos();
        this.inicio = i;
        total = 0;
        valor = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cmdValida = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaRegistroP = new javax.swing.JTextArea();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cmdRegistroP = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCantidadRegistro = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        cmdConsultaP = new javax.swing.JButton();
        cmbProductos = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCantComprar = new javax.swing.JTextField();
        cmdAgregar = new javax.swing.JButton();
        cmbNomProdVenta = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtCantDisponible = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtProductosSeleccionados = new javax.swing.JTextArea();
        txtNomPVenta = new javax.swing.JTextField();
        cmdCargaInfo = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cmbPagar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cmbClienteVenta = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cmdValidar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        cmdValida.setBackground(new java.awt.Color(102, 102, 0));
        cmdValida.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        cmdValida.setText("VALIDAR");
        cmdValida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdValidaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jLabel3.setText("Precio:");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jLabel4.setText("Descripcion:");

        txtAreaRegistroP.setColumns(20);
        txtAreaRegistroP.setRows(5);
        txtAreaRegistroP.setEnabled(false);
        jScrollPane1.setViewportView(txtAreaRegistroP);

        txtPrecio.setEnabled(false);

        cmdRegistroP.setBackground(new java.awt.Color(102, 102, 0));
        cmdRegistroP.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        cmdRegistroP.setText("REGISTRO");
        cmdRegistroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegistroPActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jLabel7.setText("CANTIDAD:");

        txtCantidadRegistro.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCantidadRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGap(52, 52, 52)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66)
                                    .addComponent(cmdValida))
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdRegistroP)
                .addGap(213, 213, 213))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdValida)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(cmdRegistroP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane7.addTab("REGISTRO", jPanel1);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jLabel5.setText("Codigo:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        cmdConsultaP.setBackground(new java.awt.Color(0, 153, 153));
        cmdConsultaP.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        cmdConsultaP.setText("CONSULTAR");
        cmdConsultaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConsultaPActionPerformed(evt);
            }
        });

        cmbProductos.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        cmbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECIONE -", " " }));
        cmbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(cmdConsultaP)
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmdConsultaP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane7.addTab("CONSULTA", jPanel2);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jLabel6.setText("id Producto:");

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jLabel8.setText("Cantidad a Comprar:");

        cmdAgregar.setBackground(new java.awt.Color(10, 143, 143));
        cmdAgregar.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        cmdAgregar.setText("AGREGAR");
        cmdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarActionPerformed(evt);
            }
        });

        cmbNomProdVenta.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        cmbNomProdVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECIONE -", " " }));
        cmbNomProdVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbNomProdVentaMouseClicked(evt);
            }
        });
        cmbNomProdVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNomProdVentaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jLabel11.setText("CANT. disponible:");

        txtCantDisponible.setEditable(false);

        txtProductosSeleccionados.setColumns(20);
        txtProductosSeleccionados.setRows(5);
        jScrollPane4.setViewportView(txtProductosSeleccionados);

        txtNomPVenta.setEditable(false);

        cmdCargaInfo.setBackground(new java.awt.Color(10, 143, 143));
        cmdCargaInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmdCargaInfo.setText("CARGAR INFO");
        cmdCargaInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCargaInfoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jLabel12.setText("NOMBRE: ");

        cmbPagar.setBackground(new java.awt.Color(10, 143, 143));
        cmbPagar.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        cmbPagar.setText("PAGAR");
        cmbPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPagarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 16)); // NOI18N
        jLabel13.setText("id Cliente:");

        cmbClienteVenta.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        cmbClienteVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- SELECIONE -", " " }));
        cmbClienteVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbClienteVentaMouseClicked(evt);
            }
        });
        cmbClienteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClienteVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel12))
                                            .addGap(33, 33, 33)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCantDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(cmbNomProdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(88, 88, 88)
                                                    .addComponent(cmdCargaInfo))
                                                .addComponent(txtNomPVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel13))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCantComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addComponent(cmbClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(51, 51, 51)
                                                    .addComponent(cmdAgregar))))))
                                .addGap(12, 12, 12))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(cmbPagar)
                        .addGap(242, 242, 242))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNomProdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdCargaInfo)
                    .addComponent(jLabel6))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomPVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtCantComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cmdAgregar))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(cmbPagar)
                .addContainerGap())
        );

        jTabbedPane7.addTab("VENTA", jPanel3);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo 1.jpg"))); // NOI18N

        cmdValidar.setBackground(new java.awt.Color(10, 143, 143));
        cmdValidar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmdValidar.setText("VOLVER");
        cmdValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdValidarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdValidar)
                .addGap(277, 277, 277))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cmdValidar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdConsultaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConsultaPActionPerformed
        // TODO add your handling code here:
        this.txtDescripcion.setText("");
        String codigo = this.cmbProductos.getSelectedItem().toString();
        ResultSet rs = Database.getTabla("select idProducto,nombreProducto,precio,descripcion from productos where idProducto =" + codigo);
        try {
            ConexionMysql.conectar();
            
            try {
                while (rs.next()) {
                    // añade los resultado a al modelo de tabla
                    this.txtDescripcion.setText("Producto: " + rs.getString("idProducto") + 
                            "\nNombre Producto: " + rs.getString("nombreProducto") + 
                            "\nPrecio del Producto: $" + rs.getString("precio") + 
                            "\nDescripción del Producto: " + rs.getString("descripcion") + "\n");
                }
                // asigna el modelo a la tabla

            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_cmdConsultaPActionPerformed

    private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarActionPerformed
        // TODO add your handling code here:
        String nombre = this.cmbNomProdVenta.getSelectedItem().toString();
        String cant = this.txtCantComprar.getText();
        String disponible = this.txtCantDisponible.getText();
        
        if (Integer.parseInt(cant) <= Integer.parseInt(disponible)) {
            this.txtProductosSeleccionados.setText("Producto: " + nombre + "   --   Cantidad: "+ cant);
            Database.getTabla("update productos set cantidad="+(Integer.parseInt(disponible)-Integer.parseInt(cant))+ "where nombreProducto="+nombre);
            total = this.total + this.valor;
        } else {
            JOptionPane.showMessageDialog(null, "Esa cantidad no esta disponible !");
            return;
        }
    }//GEN-LAST:event_cmdAgregarActionPerformed

    private void cmdValidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdValidaActionPerformed
        // TODO add your handling code here:
        String nombre = this.txtNombre.getText();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No digitó código !");
            return;

        }

////        ConexionMysql.conectar();
////        if (ConexionMysql.hayConexion()) {
////            System.out.println("Si hay Conexion con MySQL\n");
////        }
        ResultSet rs = Database.getTabla("SELECT * from productos WHERE nombreProducto='" + nombre + "'");

        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla

                JOptionPane.showMessageDialog(null, "Producto ya existe !");
                return;
            }
            // asigna el modelo a la tabla
            verBotones();
        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_cmdValidaActionPerformed

    private void verBotones() {
        this.txtPrecio.setEnabled(true);
        this.txtAreaRegistroP.setEnabled(true);
        this.txtAreaRegistroP.setEditable(true);
        this.cmdRegistroP.setEnabled(true);
        this.txtCantidadRegistro.setEnabled(true);
    }

    private void cmdRegistroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegistroPActionPerformed
        // TODO add your handling code here:
        String nombre = this.txtNombre.getText();
        String precio = this.txtPrecio.getText();
        String descripcion = this.txtAreaRegistroP.getText();
        String cantidad = this.txtCantidadRegistro.getText();

        if (nombre.isEmpty() || precio.isEmpty() || descripcion.isEmpty() || cantidad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Datos requeridos !");
            return;
        }

        Database.getTabla("insert into productos(nombreProducto,precio,descripcion,cantidad) VALUES (" + nombre + "," + Integer.parseInt(precio) + "," + descripcion + ","+Integer.parseInt(cantidad)+")");
        JOptionPane.showMessageDialog(null, "Producto registrado !");
        
    }//GEN-LAST:event_cmdRegistroPActionPerformed

    private void cmbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProductosActionPerformed

    private void cmbNomProdVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNomProdVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNomProdVentaActionPerformed

    private void cmdValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdValidarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_cmdValidarActionPerformed

    private void cmbNomProdVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbNomProdVentaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbNomProdVentaMouseClicked

    private void cmbPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPagarActionPerformed
        // TODO add your handling code here:
        String idProducto = this.cmbNomProdVenta.getSelectedItem().toString();
        String idCliente = this.cmbClienteVenta.getSelectedItem().toString();
        String cant = this.txtCantComprar.getText();
        
        Database.getTabla("insert into ventas(idCliente,idProducto,cantProductos,total) values("+idCliente+","+idProducto+","+Integer.parseInt(cant)+","+this.total+")");
        JOptionPane.showMessageDialog(null, "El total a pagar por sus productos es: $"+ this.total);
        this.txtProductosSeleccionados.setText("");
        this.valor = 0; this.total = 0;
    }//GEN-LAST:event_cmbPagarActionPerformed

    private void cmdCargaInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCargaInfoActionPerformed
        // TODO add your handling code here:
        String id = this.cmbNomProdVenta.getSelectedItem().toString();
        cargarCantidad(id);
    }//GEN-LAST:event_cmdCargaInfoActionPerformed

    private void cmbClienteVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbClienteVentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClienteVentaMouseClicked

    private void cmbClienteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClienteVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClienteVentaActionPerformed

    private void cargarCantidad(String ID) {
        
        ResultSet rs2 = Database.getTabla("select * from productos where idProducto="+ID);
        try {
            while(rs2.next()) {
                this.txtNomPVenta.setText(rs2.getString("nombreProducto"));
                this.txtCantDisponible.setText(rs2.getString("cantidad"));
                this.valor = Integer.parseInt(rs2.getString("precio"));
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    
    private void cargarProductos() {
        this.cmbNomProdVenta.removeAllItems();
        this.cmbProductos.removeAllItems();
        this.cmbClienteVenta.removeAllItems();
        ResultSet rs = Database.getTabla("select idProducto,nombreProducto from productos");
        ResultSet rs2 = Database.getTabla("select * from clientes");
        try {
            while (rs.next()) {
                this.cmbProductos.addItem(rs.getString("idProducto"));
                this.cmbNomProdVenta.addItem(rs.getString("idProducto"));
            }
            
            while (rs2.next()) {
                this.cmbClienteVenta.addItem(rs2.getString("cedula"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbClienteVenta;
    private javax.swing.JComboBox<String> cmbNomProdVenta;
    private javax.swing.JButton cmbPagar;
    private javax.swing.JComboBox<String> cmbProductos;
    private javax.swing.JButton cmdAgregar;
    private javax.swing.JButton cmdCargaInfo;
    private javax.swing.JButton cmdConsultaP;
    private javax.swing.JButton cmdRegistroP;
    private javax.swing.JButton cmdValida;
    private javax.swing.JButton cmdValidar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTextArea txtAreaRegistroP;
    private javax.swing.JTextField txtCantComprar;
    private javax.swing.JTextField txtCantDisponible;
    private javax.swing.JTextField txtCantidadRegistro;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNomPVenta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextArea txtProductosSeleccionados;
    // End of variables declaration//GEN-END:variables
}
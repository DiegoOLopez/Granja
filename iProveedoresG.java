
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author cer
 */
public class iProveedoresG extends javax.swing.JFrame {

    /**
     * Creates new form iProveedoresG
     */
    public iProveedoresG() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        nombreEmpresa = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        giro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        fechaRegistro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        RFC = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        productoComprado = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        pesoProducto = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        precioProducto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        paisL = new javax.swing.JTextField();
        estadoL = new javax.swing.JTextField();
        municipioL = new javax.swing.JTextField();
        localidadL = new javax.swing.JTextField();
        calleL = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel17.setText("Registro Provedores ");

        jLabel18.setText("Nombre de la Empresa:");

        nombreEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEmpresaActionPerformed(evt);
            }
        });
        nombreEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreEmpresaKeyTyped(evt);
            }
        });

        jLabel19.setText("Giro:");

        giro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                giroKeyTyped(evt);
            }
        });

        jLabel20.setText("Fecha de Registro(YYYY-MM-DD):");

        fechaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaRegistroActionPerformed(evt);
            }
        });

        jLabel21.setText("RFC:");

        RFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RFCActionPerformed(evt);
            }
        });
        RFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RFCKeyTyped(evt);
            }
        });

        jLabel22.setText("Producto Comprado:");

        productoComprado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoCompradoActionPerformed(evt);
            }
        });
        productoComprado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productoCompradoKeyPressed(evt);
            }
        });

        jLabel23.setText("Peso de Producto:");

        pesoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesoProductoKeyTyped(evt);
            }
        });

        jLabel24.setText("Precio del Producto:");

        precioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioProductoActionPerformed(evt);
            }
        });
        precioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioProductoKeyTyped(evt);
            }
        });

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Domicilio");

        jLabel2.setText("Pais");

        jLabel3.setText("Estado");

        jLabel4.setText("Municipio");

        jLabel5.setText("Localidad");

        jLabel6.setText("Calle");

        paisL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paisLKeyTyped(evt);
            }
        });

        estadoL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                estadoLKeyTyped(evt);
            }
        });

        municipioL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                municipioLKeyTyped(evt);
            }
        });

        localidadL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localidadLActionPerformed(evt);
            }
        });
        localidadL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                localidadLKeyTyped(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton3.setText(" <---");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton3)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel17))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24))
                                        .addGap(73, 73, 73)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pesoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                            .addComponent(productoComprado, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                            .addComponent(precioProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                            .addComponent(paisL)
                                            .addComponent(estadoL)
                                            .addComponent(municipioL)
                                            .addComponent(localidadL)
                                            .addComponent(calleL)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                            .addComponent(giro)
                                            .addComponent(fechaRegistro)
                                            .addComponent(RFC)))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel1)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(nombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(giro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(fechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(RFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(paisL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(estadoL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(municipioL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(localidadL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(calleL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel22))
                            .addComponent(productoComprado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(pesoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaRegistroActionPerformed

    private void RFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RFCActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_RFCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         proveedoresGranja data = new proveedoresGranja();
        data.setNombreEmpresa(nombreEmpresa.getText());
        data.setRFC(RFC.getText());
        data.setGiro(giro.getText());
        data.setFechaRegistro(Date.valueOf(fechaRegistro.getText()));
        data.setPais(paisL.getText());
        data.setEstado(estadoL.getText());
        data.setMunicipio(municipioL.getText());
        data.setLocalidad(localidadL.getText());
        data.setCalle(calleL.getText());
        data.setProductoComprado(productoComprado.getText());
        data.setPesoProducto(pesoProducto.getText());
        data.setPrecioProducto(Integer.parseInt(precioProducto.getText()));
      
        try
        {
            BufferedWriter bwData = new BufferedWriter(new FileWriter("ProvedoresGranja.txt"));
            System.out.println("Registro de datos exitoso");
            bwData.write
                    (
                            "Datos de Provedores "
                            +"\nNombre de Empresa: " + data.getNombreEmpresa()
                            + "\nRFC: " + data.getRFC()
                            + "\nGiro: " + data.getGiro()
                            + "\nFecha de Registro: " + data.getFechaRegistro()
                            + "\nPais: " + data.getPais()
                            + "\nEstado: " + data.getEstado()   
                            + "\nMunicipio: " + data.getMunicipio() 
                            + "\nLocalidad: " + data.getLocalidad()  
                            + "\nCalle: " + data.getCalle() 
                            + "\nProducto Comprado: " + data.getProductoComprado()
                            + "\nPeso Producto: " + data.getPesoProducto()
                            + "\nPrecio de Producto: " + data.getPrecioProducto()
                    );
            bwData.close();

            nombreEmpresa.setText("");
            RFC.setText("");
            giro.setText("");
            fechaRegistro.setText("");
            paisL.setText("");
            estadoL.setText("");
            municipioL.setText("");
            localidadL.setText("");
            calleL.setText("");
            productoComprado.setText("");
            pesoProducto.setText("");
            precioProducto.setText("");
        } catch (IOException ioe)
        {
            System.out.println("Registro de datos fallido");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void localidadLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localidadLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localidadLActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFGestionA a = new  JFGestionA();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Menu a = new  Menu();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nombreEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEmpresaActionPerformed

    private void nombreEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreEmpresaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_nombreEmpresaKeyTyped

    private void giroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giroKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_giroKeyTyped

    private void paisLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paisLKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_paisLKeyTyped

    private void estadoLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estadoLKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_estadoLKeyTyped

    private void municipioLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_municipioLKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_municipioLKeyTyped

    private void localidadLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_localidadLKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_localidadLKeyTyped

    private void productoCompradoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productoCompradoKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_productoCompradoKeyPressed

    private void pesoProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoProductoKeyTyped
        // TODO add your handling code here:
        char c= evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_pesoProductoKeyTyped

    private void precioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioProductoActionPerformed

    private void precioProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioProductoKeyTyped
        // TODO add your handling code here:
        char c= evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_precioProductoKeyTyped

    private void productoCompradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoCompradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoCompradoActionPerformed

    private void RFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RFCKeyTyped
        // TODO add your handling code here:
        RFC.setEditable(false);
        RFC.setEnabled(false);
    }//GEN-LAST:event_RFCKeyTyped

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
            java.util.logging.Logger.getLogger(iProveedoresG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iProveedoresG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iProveedoresG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iProveedoresG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iProveedoresG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RFC;
    private javax.swing.JTextField calleL;
    private javax.swing.JTextField estadoL;
    private javax.swing.JTextField fechaRegistro;
    private javax.swing.JTextField giro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField localidadL;
    private javax.swing.JTextField municipioL;
    private javax.swing.JTextField nombreEmpresa;
    private javax.swing.JTextField paisL;
    private javax.swing.JTextField pesoProducto;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JTextField productoComprado;
    // End of variables declaration//GEN-END:variables
}
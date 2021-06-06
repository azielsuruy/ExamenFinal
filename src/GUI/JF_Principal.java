/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ConectaBD.Conexion;
import java.sql.*;

import java.sql.PreparedStatement;

import GUI.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JF_Principal extends javax.swing.JFrame {

    /**
     * Creates new form JF_Principal
     */
    public JF_Principal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        cargartabla();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbldatos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtfechaadquisicion = new javax.swing.JTextField();
        txtfechavencimiento = new javax.swing.JTextField();
        txtprecioventa = new javax.swing.JTextField();
        txtpreciocompra = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbldatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Nombre", "Descripcion", "FechaAdquisicion", "Fecha Vencimiento", "PrecioVenta", "PrecioCompra"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldatos);
        if (tbldatos.getColumnModel().getColumnCount() > 0) {
            tbldatos.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setText("Codigo ");

        jLabel2.setText("Nombre");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Fecha Adquisición");

        jLabel5.setText("Fecha Vencimiento");

        jLabel6.setText("Precio Venta");

        jLabel7.setText("Precio Compra");

        btnGuardar.setText("Guardar ");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar ");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar ");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmodificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnlimpiar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfechaadquisicion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtdescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfechavencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(txtprecioventa)
                            .addComponent(txtpreciocompra))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfechaadquisicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfechavencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar)
                    .addComponent(btnlimpiar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(178, 178, 178))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        //Creación de varibles para almacenar los datos ingresados en los JTextField
        //Lo que ingresa el usuario.
        
        
        int codigo= Integer.parseInt(txtcodigo.getText());
        String nombre=txtnombre.getText();
        String descripcion= txtdescripcion.getText();
        String fechaadquisicion=txtfechaadquisicion.getText();
        String fechavencimiento=txtfechavencimiento.getText();
        int precioventa= Integer.parseInt(txtprecioventa.getText());
        int preciocompra=Integer.parseInt(txtpreciocompra.getText());
        
       // Crear una instancia de la clase Conexion para poder utilizar el metodo que realiza la conexion
        Conexion miconexion = null;
        
        try{
            
             Connection con=miconexion.dameConexion();
            
            //Se envia toda la cosulta
            PreparedStatement ps=con.prepareStatement("INSERT INTO productos(codigo, nombre, descripcion, fecha_adquisicion, fecha_vencimiento, precio_venta, precio_compra, activo)VALUES(?,?,?,?,?,?,?,?)");
            
            ps.setInt(1,codigo);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setString(4, fechaadquisicion);
            ps.setString(5, fechavencimiento);
            ps.setInt(6, precioventa);
            ps.setInt(7, preciocompra);
            ps.setInt(8, 1);
            
            //Instrucción que ejecuta la consulta y manda a guardar los valores
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Registro Guardado");
            limpiar();
            cargartabla();
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,e.toString());
            
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tbldatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldatosMouseClicked
        
        //NOs carga los valores hacia nuestro JTextFiel
          Conexion miconexion = null;
        
        try{
            
            //Creamos una variable que detecte la fila o cual se esta seleccionado
            int fila=tbldatos.getSelectedRow();
            
            int id= Integer.parseInt(tbldatos.getValueAt(fila,0).toString());
            
             Connection con=miconexion.dameConexion();
             
             PreparedStatement ps;
             ResultSet rs;

            ps= con.prepareStatement("SELECT codigo,nombre,descripcion,fecha_adquisicion,fecha_vencimiento,precio_venta,precio_compra,activo FROM productos WHERE id=?");
            
            ps.setInt(1, id);
            
            rs=ps.executeQuery();
            
            
            while(rs.next()){
                
                txtid.setText(String.valueOf(1));
                txtcodigo.setText(rs.getString("codigo"));
                txtnombre.setText(rs.getString("nombre"));
                txtdescripcion.setText(rs.getString("descripcion"));
                txtfechaadquisicion.setText(rs.getString("fecha_adquisicion"));
                txtfechavencimiento.setText(rs.getString("fecha_vencimiento"));
                txtprecioventa.setText(rs.getString("precio_venta"));
                txtpreciocompra.setText(rs.getString("precio_compra"));
                
                
            }
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e.toString() );
        }
        
        
    }//GEN-LAST:event_tbldatosMouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
      
        int id=Integer.parseInt(txtid.getText());
        int codigo= Integer.parseInt(txtcodigo.getText());
        String nombre=txtnombre.getText();
        String descripcion= txtdescripcion.getText();
        String fechaadquisicion=txtfechaadquisicion.getText();
        String fechavencimiento=txtfechavencimiento.getText();
        int precioventa= Integer.parseInt(txtprecioventa.getText());
        int preciocompra=Integer.parseInt(txtpreciocompra.getText());
        
       // Crear una instancia de la clase Conexion para poder utilizar el metodo que realiza la conexion
        Conexion miconexion = null;
        
        try{
            
             Connection con=miconexion.dameConexion();
            
            //Se envia toda la cosulta
            PreparedStatement ps=con.prepareStatement("UDATE productos SET codigo=?, nombre=?, descripcion=?, fecha_adquisicion=?, fecha_vencimiento=?, precio_venta=?, precio_compra=? WHERE id=?)");
            
            ps.setInt(1,codigo);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setString(4, fechaadquisicion);
            ps.setString(5, fechavencimiento);
            ps.setInt(6, precioventa);
            ps.setInt(7, preciocompra);
            ps.setInt(8, id);
            
            //Instrucción que ejecuta la consulta y manda a guardar los valores
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Registro Modificado ");
            limpiar();
            cargartabla();
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,e.toString());
            
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
     
        
          int id=Integer.parseInt(txtid.getText());
       
        
       // Crear una instancia de la clase Conexion para poder utilizar el metodo que realiza la conexion
        Conexion miconexion = null;
        
        try{
            
             Connection con=miconexion.dameConexion();
            
            //Se envia toda la cosulta
            PreparedStatement ps=con.prepareStatement("UPDATE productos  SET  activo= 0 WHERE id=?)");
            
            
            ps.setInt(1, id);
            
            //Instrucción que ejecuta la consulta y manda a guardar los valores
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Registro Eliminado ");
            limpiar();
            cargartabla();
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,e.toString());
            
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    
    public void limpiar(){
        
        txtid.setText("");
        txtnombre.setText("");
        txtdescripcion.setText("");
        txtfechaadquisicion.setText("");
        txtfechavencimiento.setText("");
        txtprecioventa.setText("");
        txtpreciocompra.setText("");
        
    }
    
    
    public void cargartabla(){
        
        //Para generar y cargar la tabla 
        //Se manda a llamar a los paquetes y tambien se hace un castin de la variable tbldatos. 
        
        DefaultTableModel modelotabla=(DefaultTableModel) tbldatos.getModel();
        
        //Siepre que se ejecute las filas 
        modelotabla.setRowCount(0);
       
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        
        int [] anchos ={150,9000,9500,9500,9500,9500,9500,9500};
        
        for(int  f=0; f < tbldatos.getColumnCount(); f++){
        
        tbldatos.getColumnModel().getColumn(f).setPreferredWidth(anchos[f]);
    }
        Conexion miconexion = null;

        try{
            
            Connection con=miconexion.dameConexion();

            ps= con.prepareStatement("SELECT id,codigo,nombre,descripcion,fecha_adquisicion,fecha_vencimiento,precio_venta,precio_compra,activo FROM productos WHERE activo=1");
            
            
            rs=ps.executeQuery();
            rsmd =rs.getMetaData(); //Para que nos muestre los datos de la consulta
            columnas=rsmd.getColumnCount();
            
            //El while se usa para extraer los datos y los podamos ver
            while(rs.next()){
                //Objetov sirva como contenedor y los almacene en la tabla
                Object[] fila= new Object[columnas];
                
                for(int f=0; f<columnas; f++){
                    
                    //Obtendremos los datos de la consulta
                    fila[f]=rs.getObject(f+1);
                }
                
               // Agrega los datos del arrys a la tabla;
                modelotabla.addRow(fila);
                
            }
            
            
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldatos;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtfechaadquisicion;
    private javax.swing.JTextField txtfechavencimiento;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpreciocompra;
    private javax.swing.JTextField txtprecioventa;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;
import java.sql.Connection;
import java.util.logging.Level;
import com.mysql.jdbc.Driver;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
 import java.sql.ResultSetMetaData;
 import java.util.Vector;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import static javax.swing.UIManager.getString;
import javax.swing.JOptionPane;



/**
 *
 * @author admin
 */
public class galaxy extends javax.swing.JFrame {

    /**
     * Creates new form galaxy
     */
    public galaxy() {
        initComponents();
        table_update();
           
    }
Connection conn;
PreparedStatement pst;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtgalid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtgalname = new javax.swing.JTextField();
        txtnos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtgalsize = new javax.swing.JTextField();
        txtnop = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtgalshape = new javax.swing.JTextField();
        txtgalcon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtblack = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("galaxy"));

        txtgalid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgalidActionPerformed(evt);
            }
        });

        jLabel1.setText("Galaxy ID");

        jLabel2.setText("Galaxy Name");

        jLabel3.setText("Galaxy Size");

        jLabel4.setText("Galaxy Shape");

        jLabel5.setText("Number of Stars");

        jLabel6.setText("Number of Planets");

        txtgalshape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgalshapeActionPerformed(evt);
            }
        });

        jLabel7.setText("Galaxy Consellation");

        jLabel8.setText("Black Hole");

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgalsize, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtgalname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnop, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtblack, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtgalcon, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtgalshape, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtgalid, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgalid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtgalname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtgalsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtgalshape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtgalcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtblack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 10, 350, 480);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Galaxy ID", "Galaxy Name", "Galaxy Size", "Galaxy shape", "No. of Stars", "No.of Planets", "Galaxy Consellation", "Black Hole"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(370, 20, 730, 200);

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Click here to view Galaxy Information");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(510, 600, 300, 25);

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("Click here to view Galaxy Images");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(840, 600, 260, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\galaxy_stars_universe_light_planet_63624_1920x1080.jpg")); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(-290, 0, 1840, 930);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(730, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        String galid=txtgalid.getText();
        String galname=txtgalname.getText();
        String galsize=txtgalsize.getText();
        String galshape=txtgalshape.getText();
        String nos=txtnos.getText();
        String nop=txtnop.getText();
        String galcon=txtgalcon.getText();
        String black=txtblack.getText(); 
        if(galid.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Galaxy id field is empty");
        }
        else if(galname.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Galaxy Name field is empty");
        }
        else
            if(galsize.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Galaxy Size field is empty");
            }
         else
            if(galshape.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Galaxy Shape field is empty");
            }
         else
            if(nos.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Number of stars field is empty");
            }
         else
            if(nop.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Number of planets field is empty");
            }
            else 
            if(galcon.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Galaxy Consellation field is empty");
            }
         else
             if(black.isEmpty())
            
            {
                JOptionPane.showMessageDialog(this,"BlackHole field is empty");
            }
             else 
             
                 
        
        try {
            Class.forName( "com.mysql.jdbc.Driver");
              conn=DriverManager.getConnection("jdbc:mysql://localhost/vaishali","root","");
              pst=conn.prepareStatement("insert into galaxy(Gal_ID,Gal_name,Gal_size,Gal_shape,No_of_stars,No_of_planets,G_consellation,Blackhole)values(?,?,?,?,?,?,?,?)");
              pst.setString(1,galid);
               pst.setString(2,galname);
               pst.setString(3,galsize);
                pst.setString(4,galshape);
                pst.setString(5,nos);
                pst.setString(6,nop);
                pst.setString(7,galcon);
                pst.setString(8,black);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Galaxy added....");
               table_update();    //***udate
               txtgalid.setText("");
               txtgalname.setText("");
               txtgalsize.setText("");
               txtgalshape.setText("");
               txtnos.setText("");
               txtnop.setText("");
               txtgalcon.setText("");
               txtblack.setText("");
                                     
               
                          
                              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(galaxy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(galaxy.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Main m = new Main();
        this.hide();
        m.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{
     String galid=txtgalid.getText();
        String galname=txtgalname.getText();
        String galsize=txtgalsize.getText();
        String galshape=txtgalshape.getText();
        String nos=txtnos.getText();
        String nop=txtnop.getText();
        String galcon=txtgalcon.getText();
        String black=txtblack.getText(); 
          Class.forName( "com.mysql.jdbc.Driver");
              conn=DriverManager.getConnection("jdbc:mysql://localhost/vaishali","root","");
              pst=conn.prepareStatement("update galaxy set Gal_name=?,Gal_size=?,Gal_shape=?,No_of_stars=?,No_of_planets=?,G_consellation=?,Blackhole=? where Gal_ID=?");
           pst.setString(8,galid);
               pst.setString(1,galname);
               pst.setString(2,galsize);
                pst.setString(3,galshape);
                pst.setString(4,nos);
                pst.setString(5,nop);
                pst.setString(6,galcon);
                pst.setString(7,black);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Galaxy updated....");
                 table_update();
                jButton1.setEnabled(true);
                 //***udate
               txtgalid.setText("");
               txtgalname.setText("");
               txtgalsize.setText("");
               txtgalshape.setText("");
               txtnos.setText("");
               txtnop.setText("");
               txtgalcon.setText("");
               txtblack.setText("");
              
               
                                     
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(galaxy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(galaxy.class.getName()).log(Level.SEVERE, null, ex);
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try{
     String galid=txtgalid.getText();
        
          Class.forName( "com.mysql.jdbc.Driver");
              conn=DriverManager.getConnection("jdbc:mysql://localhost/vaishali","root","");
              pst=conn.prepareStatement("Delete from galaxy where Gal_id=?");
           pst.setString(1,galid);
              
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Galaxy Deleted....");
                 table_update();
                jButton1.setEnabled(true);
                 //***udate
               txtgalid.setText("");
               txtgalname.setText("");
               txtgalsize.setText("");
               txtgalshape.setText("");
               txtnos.setText("");
               txtnop.setText("");
               txtgalcon.setText("");
               txtblack.setText("");
              
               
                                     
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(galaxy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(galaxy.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtgalshapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgalshapeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgalshapeActionPerformed

    private void txtgalidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgalidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgalidActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
int selectIndex=jTable1.getSelectedRow();
       txtgalid.setText(d1.getValueAt(selectIndex,0).toString());
        txtgalname.setText(d1.getValueAt(selectIndex,1).toString());
         txtgalsize.setText(d1.getValueAt(selectIndex,2).toString());
          txtgalshape.setText(d1.getValueAt(selectIndex,3).toString());
           txtnos.setText(d1.getValueAt(selectIndex,4).toString());
            txtnop.setText(d1.getValueAt(selectIndex,5).toString());
             txtgalcon.setText(d1.getValueAt(selectIndex,6).toString()); 
             txtblack.setText(d1.getValueAt(selectIndex,7).toString());
             jButton1.setEnabled(false);
             
// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
galinfo gi=new galinfo();
        gi.setVisible(true);      }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
galimage g=new galimage();
        g.setVisible(true);     }//GEN-LAST:event_jButton6ActionPerformed
    
    /**
     * @param args the command line arguments
     */
     public void table_update()
    {
        int c;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/vaishali","root","");
            pst = conn.prepareStatement("select * from galaxy");
            ResultSet rs= pst.executeQuery();
            
            ResultSetMetaData rd = rs.getMetaData();
            c=rd.getColumnCount();
            DefaultTableModel df= (DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(rs.next())
            {
               Vector v2 = new Vector();
                
                for(int i=1; i<=c; i++)
                {
                    v2.add(rs.getString("Gal_id"));
                     v2.add(rs.getString("Gal_name"));
                      v2.add(rs.getString("Gal_size"));
                       v2.add(rs.getString("Gal_shape"));
                        v2.add(rs.getString("No_of_stars"));
                         v2.add(rs.getString("No_of_planets"));
                          v2.add(rs.getString("G_consellation"));
                           v2.add(rs.getString("Blackhole"));
                }
                df.addRow(v2);
                
                
            }
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(galaxy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(galaxy.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        
        }

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
                new galaxy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtblack;
    private javax.swing.JTextField txtgalcon;
    private javax.swing.JTextField txtgalid;
    private javax.swing.JTextField txtgalname;
    private javax.swing.JTextField txtgalshape;
    private javax.swing.JTextField txtgalsize;
    private javax.swing.JTextField txtnop;
    private javax.swing.JTextField txtnos;
    // End of variables declaration//GEN-END:variables

}
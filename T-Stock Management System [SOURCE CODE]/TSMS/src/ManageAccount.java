import javax.swing.*;
import java.util.*;
import java.sql.*;

/**
 *
 * @author TONY
 */

public class ManageAccount extends javax.swing.JFrame {
    Connection conn= null;
    PreparedStatement pstmt= null;
    ResultSet rst= null;
    
    /**
     * Creates new form ManageAccount
     */
    
    public ManageAccount() {
        initComponents();
        ImageIcon logo = new ImageIcon(getClass().getResource("/logo.png"));
        setIconImage(logo.getImage());
        setTitle("T-Stock Management System | Account Center");
        
    }
    
    private void clearItemFields() {
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jPasswordField1.setText("");
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usertrace = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage account:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel2)
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("*Employee Code :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Full name :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("Email :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("Password :");

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Fill in your employee code (you can't change it), then fill the rest");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setText("username :");

        jLabel12.setText("of the fields with the changes you want to make and leave ");

        jLabel13.setText("the fields you don't want to change empty.");

        usertrace.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usertrace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usertrace.setText("User");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("To delete your account or other advanced changes contact your company's IT admin.");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usertrace, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel11))
                            .addGap(52, 52, 52)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                .addComponent(jTextField3)
                                .addComponent(jTextField4)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordField2)))
                        .addComponent(jLabel3)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usertrace)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Update Button:
        String code= String.valueOf(jPasswordField1.getPassword());
        String name= jTextField2.getText();
        String email= jTextField3.getText();
        String username= jTextField4.getText();
        String password= String.valueOf(jPasswordField2.getPassword());
        String tracker= usertrace.getText();
              
        int notFound= 1;
        
        if(!(code.isEmpty())){       
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tsms_projectdb","root","");
            System.out.println("Connection established successfully!"); 
            
            String selectSQL= "SELECT * FROM employees_credentials  WHERE CODE=? AND USERNAME=?";
            pstmt= conn.prepareStatement(selectSQL);
            pstmt.setString(1, code);
            pstmt.setString(2, tracker);
            rst= pstmt.executeQuery();
            if(rst.next()){
            
                if(name.isEmpty() && email.isEmpty() && username.isEmpty() && password.isEmpty()){
                    JOptionPane.showMessageDialog(this, "No changes detected! Make changes and try again.","Message",JOptionPane.ERROR_MESSAGE);
                }
                else if(name.isEmpty() && email.isEmpty() && username.isEmpty() && !(password.isEmpty())){             
                    String updateSQL= "UPDATE employees_credentials SET PASSWORD=? WHERE CODE=? AND USERNAME=?";   
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, password);
                    pstmt.setString(2, code);
                    pstmt.setString(3, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Password update successful!\nLogout and re-login to load changes");           
                    clearItemFields();
                }
                else if(name.isEmpty() && email.isEmpty() && !(username.isEmpty()) && password.isEmpty()) {              
                    String updateSQL= "UPDATE employees_credentials SET USERNAME=? WHERE CODE=? AND USERNAME=?";
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, username);
                    pstmt.setString(2, code);
                    pstmt.setString(3, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Username update successful\nLogout and re-login to load changes!");           
                    clearItemFields();
                }
                else if(name.isEmpty() && !(email.isEmpty()) && username.isEmpty() && password.isEmpty()) {               
                    String updateSQL= "UPDATE employees_credentials SET EMAIL=? WHERE CODE=? AND USERNAME=?";
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, email);
                    pstmt.setString(2, code);
                    pstmt.setString(3, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Email update successful!\nLogout and re-login to load changes");           
                    clearItemFields();
                }
                else if(!(name.isEmpty()) && email.isEmpty() && username.isEmpty() && password.isEmpty()){            
                    String updateSQL= "UPDATE employees_credentials SET FULL_NAME=? WHERE CODE=? AND USERNAME=?"; 
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, name);
                    pstmt.setString(2, code);
                    pstmt.setString(3, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Name update successful!\nLogout and re-login to load changes");           
                    clearItemFields();
                }
                else if(name.isEmpty() && email.isEmpty() && !(username.isEmpty()) && !(password.isEmpty())) {
                    String updateSQL= "UPDATE employees_credentials SET USERNAME=?, PASSWORD=? WHERE CODE=? AND USERNAME=?";
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, username);
                    pstmt.setString(2, password);
                    pstmt.setString(3, code);
                    pstmt.setString(4, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Username and password update successful!\nLogout and re-login to load changes");           
                    clearItemFields();
                }
                else if(name.isEmpty() && !(email.isEmpty()) && username.isEmpty() && !(password.isEmpty())) {            
                    String updateSQL= "UPDATE employees_credentials SET EMAIL=?, PASSWORD=? WHERE CODE=? AND USERNAME=?";
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, email);
                    pstmt.setString(2, password);
                    pstmt.setString(3, code);
                    pstmt.setString(4, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Email and password update successful!\nLogout and re-login to load changes");           
                    clearItemFields();
                }
                else if(!(name.isEmpty()) && email.isEmpty() && username.isEmpty() && !(password.isEmpty())){                
                    String updateSQL= "UPDATE employees_credentials SET FULL_NAME=?, PASSWORD=? WHERE CODE=? AND USERNAME=?";
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, name);
                    pstmt.setString(2, password);
                    pstmt.setString(3, code);
                    pstmt.setString(4, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Name and password update successful!\nLogout and re-login to load changes");           
                    clearItemFields();
                }
                else if(name.isEmpty() && !(email.isEmpty()) && !(username.isEmpty()) && password.isEmpty()){            
                    String updateSQL= "UPDATE employees_credentials SET EMAIL=?, USERNAME=? WHERE CODE=? AND USERNAME=?"; 
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, email);
                    pstmt.setString(2, username);
                    pstmt.setString(3, code);
                    pstmt.setString(4, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Email and username update successful!\nLogout and re-login to load changes");           
                    clearItemFields();
                }
                else if(!(name.isEmpty()) && email.isEmpty() && !(username.isEmpty()) && password.isEmpty()) {
                    String updateSQL= "UPDATE employees_credentials SET FULL_NAME=?, USERNAME=? WHERE CODE=? AND USERNAME=?";
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, name);
                    pstmt.setString(2, username);
                    pstmt.setString(3, code);
                    pstmt.setString(4, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Name and username update successful!\nLogout and re-login to load changes");           
                    clearItemFields();
                }
                else if(!(name.isEmpty()) && !(email.isEmpty()) && username.isEmpty() && password.isEmpty()){            
                    String updateSQL= "UPDATE employees_credentials SET  FULL_NAME=?, EMAIL=? WHERE CODE=? AND USERNAME=?"; 
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, name);
                    pstmt.setString(2, email);
                    pstmt.setString(3, code);
                    pstmt.setString(4, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Name and email update successful!\nLogout and re-login to load changes");           
                    clearItemFields();
                }
                else if(name.isEmpty() && !(email.isEmpty()) && !(username.isEmpty()) && !(password.isEmpty())) {
                    String updateSQL= "UPDATE employees_credentials SET EMAIL=?, USERNAME=?, PASSWORD=? WHERE CODE=? AND USERNAME=?";
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, email);
                    pstmt.setString(2, username);
                    pstmt.setString(3, password);
                    pstmt.setString(4, code);
                    pstmt.setString(5, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Email, username and password update successful!\nLogout and re-login to load changes");           
                    clearItemFields();
                }
                else if(!(name.isEmpty()) && !(email.isEmpty()) && !(username.isEmpty()) && password.isEmpty()) {
                    String updateSQL= "UPDATE employees_credentials SET FULL_NAME=?, EMAIL=?, USERNAME=? WHERE CODE=? AND USERNAME=?";
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, name);
                    pstmt.setString(2, email);
                    pstmt.setString(3, username);
                    pstmt.setString(4, code);
                    pstmt.setString(5, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Name, email and username update successful!\nLogout and re-login to load changes");           
                    clearItemFields();
                }
                else if(!(name.isEmpty()) && !(email.isEmpty()) && username.isEmpty() && !(password.isEmpty())) {
                    String updateSQL= "UPDATE employees_credentials SET FULL_NAME=?, EMAIL=?, PASSWORD=? WHERE CODE=? AND USERNAME=?";
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, name);
                    pstmt.setString(2, email);
                    pstmt.setString(3, password);
                    pstmt.setString(4, code);
                    pstmt.setString(5, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Name, email and password update successful!\nLogout and re-login to load changes");           
                    clearItemFields();
                }
                else if(!(name.isEmpty()) && email.isEmpty() && !(username.isEmpty()) && !(password.isEmpty())) {
                    String updateSQL= "UPDATE employees_credentials SET FULL_NAME=?, USERNAME=?, PASSWORD=? WHERE CODE=? AND USERNAME=?";
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, name);
                    pstmt.setString(2, username);
                    pstmt.setString(3, password);
                    pstmt.setString(4, code);
                    pstmt.setString(5, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Name, username and password update successful!\nLogout and re-login to load changes");           
                    clearItemFields();
                }
                else if(!(name.isEmpty()) && !(email.isEmpty()) && !(username.isEmpty()) && !(password.isEmpty())) {
                    String updateSQL= "UPDATE employees_credentials SET FULL_NAME=?, EMAIL=?, USERNAME=?, PASSWORD=? WHERE CODE=? AND USERNAME=?";
                    pstmt= conn.prepareStatement(updateSQL);
                    pstmt.setString(1, name);
                    pstmt.setString(2, email);
                    pstmt.setString(3, username);
                    pstmt.setString(4, password);
                    pstmt.setString(5, code);
                    pstmt.setString(6, tracker);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Name, email, username and password update successful!\nLogout and re-login to load changes");         
                    clearItemFields();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Something went wrong!\nCheck your input and try again.","Message",JOptionPane.ERROR_MESSAGE);
                }
                
                notFound= 0;
            } 
            
            if (notFound ==1){
                JOptionPane.showMessageDialog(this,"No employee code match\nPlease enter your assigned Employee Code correctly!","Message",JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(Exception e){
            System.out.println("Update failed! "+e);
            JOptionPane.showMessageDialog(this,"Update failed!\n"+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }finally {
            if (rst != null) {
             try {
                rst.close();
                System.out.println("ResultSet closed successfully!"); 
             }catch (SQLException e) { /* Exception Ignored */}
            }
            if (pstmt != null) {
             try {
                pstmt.close();
                System.out.println("Statement closed successfully!"); 
             }catch (SQLException e) { /* Exception Ignored */}
            }
            if (conn != null) {
             try {
                conn.close();
                System.out.println("Connection closed successfully!"); 
             }catch (SQLException e) { /* Exception Ignored */}
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(this,"Employee Code required!\nPlease enter your assigned Employee Code in order to make changes!","Message",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public javax.swing.JLabel usertrace;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.JOptionPane;
import model.Library;;
import file.LibraryFile;
import model.RegisteredUser;

public class LoginFrame extends javax.swing.JFrame {

    public Library library;
    public LibraryFile file;
    
    public LoginFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFusername = new javax.swing.JTextField();
        TFpassword = new javax.swing.JTextField();
        BTguest = new javax.swing.JButton();
        BTlogin = new javax.swing.JButton();
        RBuser = new javax.swing.JRadioButton();
        RBlib = new javax.swing.JRadioButton();
        BTregister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        BTguest.setText("Join as Guest");
        BTguest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTguestActionPerformed(evt);
            }
        });

        BTlogin.setText("Login");
        BTlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTloginActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBuser);
        RBuser.setText("User");

        buttonGroup1.add(RBlib);
        RBlib.setText("LIbrarian");
        RBlib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBlibActionPerformed(evt);
            }
        });

        BTregister.setText("Register");
        BTregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTregisterActionPerformed(evt);
            }
        });

        jLabel3.setText("New client?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTregister)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(BTlogin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BTguest))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TFusername)
                                .addComponent(TFpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RBuser)
                                .addComponent(RBlib)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBuser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBlib))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTlogin)
                    .addComponent(BTguest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BTregister))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTloginActionPerformed
        if(RBuser.isSelected()){
            if(file.loginUser(library, TFusername.getText(), TFpassword.getText())== true){
                UserForm userForm =new UserForm ();
                this.dispose();
                userForm.setVisible(true);
                userForm.library = library;
                userForm.file=file;
                userForm.file.LoadBooks(library);
                userForm.LBL_username.setText(library.logged.getUsername());
                userForm.LBLnum_books.setText(Integer.toString(library.books.size()));
                
            }else{ 
                JOptionPane.showMessageDialog(null,"Login Failed", "Error", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
            }
        }else{
            if(file.loginLibrarian(library, TFusername.getText(), TFpassword.getText())== true){
                LibrarianForm librarianForm =new LibrarianForm ();
                this.dispose();
                librarianForm.setVisible(true);
                librarianForm.library = library;
                librarianForm.file=file;
                
            }else{ 
                JOptionPane.showMessageDialog(null,"Login Failed", "Error", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
            }
        }
    }//GEN-LAST:event_BTloginActionPerformed

    private void RBlibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBlibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBlibActionPerformed

    private void BTregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTregisterActionPerformed
        RegistrationForm registrationForm =new RegistrationForm ();
                this.dispose();
                registrationForm.setVisible(true);
                registrationForm.library = this.library;
                registrationForm.file = this.file;
    }//GEN-LAST:event_BTregisterActionPerformed

    private void BTguestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTguestActionPerformed
        GuestForm guestForm =new GuestForm ();
                this.dispose();
                guestForm.setVisible(true);
                guestForm.library = library;
                guestForm.file=file;
                file.LoadBooks(library);
                guestForm.showBookList();
    }//GEN-LAST:event_BTguestActionPerformed

    public void clearFields(){
        TFusername.setText("");
        TFpassword.setText("");
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTguest;
    private javax.swing.JButton BTlogin;
    private javax.swing.JButton BTregister;
    private javax.swing.JRadioButton RBlib;
    private javax.swing.JRadioButton RBuser;
    private javax.swing.JTextField TFpassword;
    private javax.swing.JTextField TFusername;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

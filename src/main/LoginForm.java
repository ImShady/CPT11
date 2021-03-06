/**
 * Main Form controlling Logins
 * Author: Shady Ibrahim
 */

package main;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.UIManager;

public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form MenuForm
     */
    
    String name;
    
    static ArrayList<String> user = new ArrayList<>();
    static ArrayList<String> pass = new ArrayList<>();
    
    public LoginForm()
    {       
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e)
        {
            System.out.println("Look and feel");
        }
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

        lblMainTitle = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnSIgnUp = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblTaken = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblMainTitle.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        lblMainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainTitle.setText("ShadyApps");
        lblMainTitle.setToolTipText("");

        lblPassword.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblPassword.setText("Password:");

        lblUsername.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblUsername.setText("Username:");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSIgnUp.setText("Sign Up");
        btnSIgnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSIgnUpActionPerformed(evt);
            }
        });

        txtUsername.setToolTipText("");

        lblTaken.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblTaken.setText("   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMainTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTaken)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword)
                            .addComponent(lblUsername))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnSIgnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUsername)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTaken)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsername)
                                .addGap(25, 25, 25)
                                .addComponent(lblPassword))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnSIgnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        lblMainTitle.getAccessibleContext().setAccessibleName("lblMainTitle");
        lblPassword.getAccessibleContext().setAccessibleName("lblPassword");
        lblUsername.getAccessibleContext().setAccessibleName("lblUsername");
        btnLogin.getAccessibleContext().setAccessibleName("btnLogin");
        btnLogin.getAccessibleContext().setAccessibleDescription("");
        btnSIgnUp.getAccessibleContext().setAccessibleName("btnSignUp");
        txtUsername.getAccessibleContext().setAccessibleName("");
        txtPassword.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        user.removeAll(user);
        pass.removeAll(pass);
        
        String username = txtUsername.getText(), password = txtPassword.getText();
        File usernames = new File ("usernames.txt"); File passwords = new File ("passwords.txt");     
        
        try
        {
            Scanner userCheck = new Scanner (usernames); Scanner passCheck = new Scanner (passwords);
            while(userCheck.hasNext())
            {
                String thisUser = userCheck.next(); String thisPass = passCheck.next();
                user.add(thisUser);
                pass.add(thisPass);
            }
            
            for(int i = 0; i < user.size(); i++)
            {
                if(username.equalsIgnoreCase(user.get(i)))
                {
                    if(methods.encrypt(password).equals(pass.get(i)))
                    {
                        System.out.println("Login successful.");
                        new MenuForm().setVisible(true); this.dispose();
                        break;
                    }                    
                    else
                    {                        
                        lblTaken.setForeground(Color.red); lblTaken.setText("Incorrect username or password."); 
                        break;
                    }
                }
                else if(i + 1 == user.size())
                {
                    lblTaken.setForeground(Color.red); lblTaken.setText("Incorrect username or password.");
                }
            }
            
        }catch(Exception e)
        {
            System.out.println("Error occured: ");
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSIgnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSIgnUpActionPerformed
        
        new SignUpForm().setVisible(true);
        
    }//GEN-LAST:event_btnSIgnUpActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSIgnUp;
    private javax.swing.JLabel lblMainTitle;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTaken;
    private javax.swing.JLabel lblUsername;
    public static javax.swing.JPasswordField txtPassword;
    public static javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    public static String getUser()
    {
        return txtUsername.getText();
    }
    
    public static String getPassword()
    {
        return txtPassword.getText();
    }
    
    public static ArrayList<String> getUsers()
    {
        return user;
    }
    
    public static ArrayList<String> getPasses()
    {
        return pass;
    }   
}
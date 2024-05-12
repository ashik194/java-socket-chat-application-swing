/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import java.awt.Color;
import model.Model_User_Account;

/**
 *
 * @author ORANGEBD
 */
public class ChatTitle extends javax.swing.JPanel {

    /**
     * Creates new form ChatBody
     */
    
    public Model_User_Account getUser() {
        return user;
    }

    private Model_User_Account user;
    
    public ChatTitle() {
        initComponents();
    }
    
    public void setUserName(Model_User_Account user) {
        this.user = user;
        System.out.println(user);
        lbName.setText(user.getUserName());
        if (user.isStatus()) {
            statusActive();
        } else {
            setStatusText("Offline");
        }
    }

    public void updateUser(Model_User_Account user) {
        if (this.user == user) {
            lbName.setText(user.getUserName());
            if (user.isStatus()) {
                statusActive();
            } else {
                setStatusText("Offline");
            }
        }
    }
    
//    public void setUserName(String username){
//        lbName.setText(username);
//    }
    
    public void statusActive(){
        lbStatus.setText("Active Now");
        lbStatus.setForeground(new java.awt.Color(40, 147, 59));
    }
    
    public void setStatusText(String text){
        lbStatus.setText(text);
        lbStatus.setForeground(new Color(160, 160, 160));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lbName = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        jLayeredPane1.setLayout(new java.awt.GridLayout(0, 1));

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbName.setForeground(new java.awt.Color(102, 102, 102));
        lbName.setText("Name");
        jLayeredPane1.add(lbName);

        lbStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(61, 153, 61));
        lbStatus.setText("Active Now ");
        jLayeredPane1.add(lbStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbStatus;
    // End of variables declaration//GEN-END:variables
}

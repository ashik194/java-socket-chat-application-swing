/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import app.MessageType;
import emoji.Emogi;
import java.awt.Adjustable;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import model.Model_Receive_Message;
import model.Model_Send_Message;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author ORANGEBD
 */
public class ChatBody extends javax.swing.JPanel {

    /**
     * Creates new form ChatBody
     */
    public ChatBody() {
        initComponents();
        init();
//        addItemRight("Send a text message to a group of contacts. Include photos, personalize your texts, and track who clicked your links.");
//        addItemRight("hello\nHi");
//        addItemLeft("Simpletext started as a passion project because I couldn’t find what I was looking for. Most apps were trying to do too much and ended up bloated with features I don’t need. So I built Simpletext based on a simple premise — what if there’s an app that refuses to do more, choosing instead to do just one thing, and do it well? For Simpletext, that one thing is writing.","Kamal");
//        addDate("12/05/2024");
//        String img[] = {"LVQTJq9E^-%NbFNFt7of^-%NM_In"};
//        addItemLeft("hello\nerererew\newewe","Kamal",img);
//        addItemRight("hello\nerererew\newewe");
//        addItemLeft("hello\nerererew\newewe","Kamal", new ImageIcon(getClass().getResource("/icons/testing/cat.png")), new ImageIcon(getClass().getResource("/icons/testing/dog.jpg")));
//        addDate("Today");
//        addItemRight("hello\nerererew\newewe",new ImageIcon(getClass().getResource("/icons/testing/dog.jpg")), new ImageIcon(getClass().getResource("/icons/testing/dog.jpg")));
//        addItemFile("","Kamal","Test.pdf","1 MB");
//        addItemFileRight("Testing","Test.pdf","1 MB");
//        addItemLeft("Hi, How are you?","Kamal");
    }
    
    private void init(){
        body.setLayout(new MigLayout("fillx", "", "5[]5"));
        sp.setVerticalScrollBar(new JScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }
    
//    public void addItemLeft(String text, String user, Icon ...image){
//        Chat_left item = new Chat_left();
//        item.setText(text);
//        item.setImage(image);
//        item.setUserProfile(user);
//        body.add(item, "wrap, w 100::80%"); 
//        body.repaint();
//        body.revalidate();
//    }


    public void addItemLeft(Model_Receive_Message data){
//        Chat_left item = new Chat_left();
//        item.setText(data.getText());
//        body.add(item, "wrap, w 100::80%");
        if (data.getMessageType() == MessageType.TEXT) {
            Chat_left item = new Chat_left();
            item.setText(data.getText());
            item.setTime();
            body.add(item, "wrap, w 100::80%");
        } else if (data.getMessageType() == MessageType.EMOJI) {
            Chat_left item = new Chat_left();
            item.setEmoji(Emogi.getInstance().getImoji(Integer.valueOf(data.getText())).getIcon());
            item.setTime();
            body.add(item, "wrap, w 100::80%");
        }else if (data.getMessageType() == MessageType.IMAGE) {
            Chat_left item = new Chat_left();
            item.setText("");
            item.setImage(data.getDataImage());
            item.setTime();
            body.add(item, "wrap, w 100::80%");
        }
        repaint();
        revalidate();
    }    
    public void addItemLeft(String text, String user, String[] image){
        Chat_left_with_profile item = new Chat_left_with_profile();
        item.setText(text);
        item.setImage(image);
        item.setUserProfile(user);
        body.add(item, "wrap, w 100::80%"); 
        body.repaint();
        body.revalidate();
    }
    
    public void addItemFile(String text, String user, String fileName, String fileSize){
        Chat_left_with_profile item = new Chat_left_with_profile();
        item.setText(text);
        item.setFile(fileName, fileSize);
        item.setTime();
        item.setUserProfile(user);
        body.add(item, "wrap, w 100::80%"); 
        body.repaint();
        body.revalidate();
    }
    
    
    public void addItemRight(Model_Send_Message data){
//        Chat_right item = new Chat_right();
//        item.setText(data.getText());
//        body.add(item, "wrap, al right, w 100::80%");
//        item.setImage(image);
        if (data.getMessageType() == MessageType.TEXT) {
            Chat_right item = new Chat_right();
            item.setText(data.getText());
            item.setTime();
            body.add(item, "wrap, al right, w 100::80%");
        } else if (data.getMessageType() == MessageType.EMOJI) {
            Chat_right item = new Chat_right();
            item.setEmoji(Emogi.getInstance().getImoji(Integer.valueOf(data.getText())).getIcon());
            item.setTime();
            body.add(item, "wrap, al right, w 100::80%");
        }else if (data.getMessageType() == MessageType.IMAGE) {
            Chat_right item = new Chat_right();
            item.setText("");
            item.setImage(data.getFile());
            item.setTime();
            body.add(item, "wrap, al right, w 100::80%");

        }
        repaint();
        revalidate();
        scrollToBottom();
    }
    
    public void addItemFileRight(String text, String fileName, String fileSize){
        Chat_right item = new Chat_right();
        item.setText(text);
        item.setFile(fileName, fileSize);
        item.setTime();
        body.add(item, "wrap, al right, w 100::80%"); 
        body.repaint();
        body.revalidate();
    }
    
    
    public void addDate(String date){
        ChatDate item = new ChatDate();
        item.setMSGDate(date);
        body.add(item, "wrap, al center");
        body.repaint();
        body.revalidate();
    }

    public void clearChat() {
        body.removeAll();
        repaint();
        revalidate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();

        sp.setBackground(new java.awt.Color(255, 255, 255));
        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new javax.swing.BoxLayout(body, javax.swing.BoxLayout.Y_AXIS));
        sp.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void scrollToBottom() {
        JScrollBar verticalBar = sp.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}

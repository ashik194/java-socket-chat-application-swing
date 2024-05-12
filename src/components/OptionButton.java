/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author ORANGEBD
 */
public class OptionButton extends JButton{
    public OptionButton(){
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    @Override
    public void setSelected(boolean bln){
        super.setSelected(bln);
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics grpcs)
    {
        super.paintComponent(grpcs);
        if(isSelected()){
            grpcs.setColor(new Color(110, 213, 255));
            grpcs.fillRect(0, getHeight() - 5, getWidth(), getHeight());
        }
    }
    
}

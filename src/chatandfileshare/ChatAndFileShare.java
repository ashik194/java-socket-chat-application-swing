/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatandfileshare;

import java.io.File;

/**
 *
 * @author ORANGEBD
 */
public class ChatAndFileShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("C:\\Users\\ORANGEBD\\Documents\\NetBeansProjects\\ChatAndFileShare\\src\\icons\\icon.png");
        if(f.exists() && !f.isDirectory()) { 
            System.out.println("Working...!!!!");
        }else{
            System.out.println("Not Found...@@!!!");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import swing.blur.BlurHash;

/**
 *
 * @author ORANGEBD
 */
public class Test {

    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\ORANGEBD\\Downloads\\Al-baraka-Logo.jpg"));
            String blurhashStr = BlurHash.encode(image);
            System.out.println(blurhashStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
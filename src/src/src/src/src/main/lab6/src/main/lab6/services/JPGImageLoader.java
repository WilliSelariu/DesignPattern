

package main.lab6.services;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JPGImageLoader {
    public JPGImageLoader(String path) {
        try {
            BufferedImage picture = ImageIO.read(new File(path));
            JLabel pLable=new JLabel(new ImageIcon(picture));
            JPanel jPanel=new JPanel();
            jPanel.add(pLable);
            JFrame jFrame=new JFrame();
            jFrame.setSize(new Dimension(picture.getWidth(), picture.getHeight()));
            jFrame.add(jPanel);
            jFrame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
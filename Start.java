package Qs;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Image.*;
import javax.xml.soap.Text;
import java.awt.*;

public class Start {
	public static void main(String[] args){
		   javax.swing.SwingUtilities.invokeLater(new Runnable() {
          public void run() {
        	   ButtonFrame1 frame1= new ButtonFrame1();
        	    //JFrame f = new JFrame();
        	   // ButtonPanel1 b=new ButtonPanel1();
        	   // f.setSize(1368, 740);
        	   // add(frame);
        		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		frame1.setVisible(true);
          }}
	);
		   }}

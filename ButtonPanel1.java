package Qs;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class ButtonPanel1 extends JPanel{
	public static ButtonPanelExmple panel_example;
	public ButtonPanel1(){
		//setLayout(new BorderLayout());
		setLayout(null);	
		JButton instructButton = new JButton("ИНСТРУКЦИЯ");
		JButton exampleButton = new JButton("ПРИМЕР");
		JButton nextButton = new JButton("ТРЕНАЖЕР");
		//instructButton.setSize(250, 100);
		//instructButton.setMaximumSize(instructButton.getPreferredSize());
		add(instructButton).setBounds(400, 400, 500, 50);;
		add(exampleButton).setBounds(400, 470, 500, 50);
		add(nextButton).setBounds(400, 540, 500, 50);
		//JLabel centerLabel = new JLabel("Center");
        //centerLabel.setVerticalAlignment(JLabel.CENTER);
        //centerLabel.setHorizontalAlignment(JLabel.CENTER);
        Font BigFontTR = new Font("TimesRoman", Font.BOLD, 50);
         setFont(BigFontTR );
        //centerLabel.setFont(BigFontTR);
        //add(centerLabel);
	
	instructButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ButtonFrame1.createGUI(); 
	    }
	});
	
	exampleButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//JTable table=ButtonPanelExmple.table;
			//Integer[][] data=ButtonPanelExmple.data;
			//int[] mas = ButtonPanelExmple.mas;
			//Integer[] headers = ButtonPanelExmple.headers;
		    panel_example = new ButtonPanelExmple();
			ButtonFrame1.addNewPanel(panel_example);
			//ButtonPanelExmple.QuickS(table,data,mas,headers,0,8);
	    }
	});
	
	nextButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ButtonPanel2 panel2 = new ButtonPanel2();
			ButtonFrame1.addNewPanel(panel2);
			ButtonFrame1.addInstr(panel2);
	    }
	});
	
	}
	
	protected void paintComponent(Graphics g){
       super.paintComponent(g);
       setLayout(new BorderLayout());
           Image im = new ImageIcon("Pictures/pc.jpg").getImage();
           g.drawImage(im, 0, 0, null); 
           Font BigFontTR = new Font("TimesRoman", Font.BOLD, 50);
           g.setFont(BigFontTR );
           
           g.drawString("Приветсвуем Вас в приложении \n", 380, 300);
           g.drawString("Тренажер Быстрой Сортировки", 380, 360);
    }
}

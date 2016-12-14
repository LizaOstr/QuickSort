package Qs;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ButtonPanel2 extends JPanel {
	public ButtonPanel2(){
		setLayout(null);	
		JButton nextButton = new JButton("ДАЛЕЕ");
		add(nextButton).setBounds(400, 470, 500, 50);
		
	
	nextButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ButtonPanel3 panel3 = new ButtonPanel3();
			ButtonFrame1.addNewPanel(panel3);
			ButtonFrame1.addInstr(panel3);
	    }
	});
	
	}
	
	protected void paintComponent(Graphics g){
	       super.paintComponent(g);
	      // setLayout(new BorderLayout());
	           Image im = new ImageIcon("Pictures/pc.jpg").getImage();
	           g.drawImage(im, 0, 0, null); 
	           Font BigFontTR = new Font("TimesRoman", Font.BOLD, 20);
	           g.setFont(BigFontTR );
	           
	           g.drawString("На протяжении всего процесса вы всегда сможете посмотреть \n", 380, 125);
	           g.drawString("интструкцию, нажав на эту кнопку ", 380, 155);
	}
}

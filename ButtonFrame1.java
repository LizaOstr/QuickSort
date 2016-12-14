package Qs;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class ButtonFrame1 extends JFrame{
		public ButtonFrame1(){
			JFrame.setDefaultLookAndFeelDecorated(true);
			setTitle("“–≈Õ¿∆≈– ¡€—“–Œ… —Œ–“»–Œ¬ »");
			setSize(1368, 740);
			
			ButtonPanel1 panel = new ButtonPanel1();
			add(panel);
			
			//panel.setFont(new Font("Arial", Font.BOLD, 24));
		}
		
		public static void addNewPanel(JPanel panel) {  //—Œ«ƒ¿Õ»≈ ÕŒ¬Œ√Œ Œ Õ¿
			JFrame frame = new JFrame("“–≈Õ¿∆≈– ¡€—“–Œ… —Œ–“»–Œ¬ »");
			//JPanel panel2 = new JPanel();
			frame.add(panel);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(panel);
	          frame.setPreferredSize(new Dimension(1368, 740));
	          frame.pack();
	          frame.setLocationRelativeTo(null);
	          frame.setVisible(true);
		}
		
		public static void addInstr(JPanel frame){
			JButton instructButton = new JButton("»Õ—“–” ÷»ﬂ");
			frame.add(instructButton).setBounds(1180, 30, 150, 30);;
			
		
		instructButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonFrame1.createGUI(); 
		    }
		});
		}
		
		public static void createGUI() {  //—Œ«ƒ¿Õ»≈ »Õ“—–” ÷»»
	          JFrame frame = new JFrame("—Ô‡‚Í‡");
	         // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	          JPanel mainPanel = new JPanel();
	          mainPanel.setLayout(new BorderLayout());

	          JTextArea textArea = new JTextArea(10, 20);
	          textArea.setText(TEXT);
	          textArea.setCaretPosition(0);

	          final JScrollPane scrollPane = new JScrollPane(textArea);
	          mainPanel.add(scrollPane, BorderLayout.CENTER);

	          JPanel panel = new JPanel();
	          panel.setLayout(new FlowLayout());

	          final JCheckBox checkBox1 = new JCheckBox("Show vertical scrollbar");
	          checkBox1.setSelected(true);
	          checkBox1.addActionListener(new ActionListener() {
	               public void actionPerformed(ActionEvent e) {
	                    if (checkBox1.isSelected()) {
	                         scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	                    } else {
	                         scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
	                    }
	               }
	          });
	          panel.add(checkBox1);

	          final JCheckBox checkBox2 = new JCheckBox("Show horizontal scrollbar");
	          checkBox2.setSelected(true);
	          checkBox2.addActionListener(new ActionListener() {
	               public void actionPerformed(ActionEvent e) {
	                    if (checkBox2.isSelected()) {
	                         scrollPane
	                                   .setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	                    } else {
	                         scrollPane
	                                   .setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	                    }
	               }
	          });
	          panel.add(checkBox2);

	          mainPanel.add(panel, BorderLayout.SOUTH);

	          frame.getContentPane().add(mainPanel);
	          frame.setPreferredSize(new Dimension(550, 740));
	          frame.pack();
	          frame.setLocationRelativeTo(null);
	          frame.setVisible(true);
	     }
		private static final String TEXT = "You can get a blog started in less time than \n"
	               + " it takes you to read this sentence. All you need is an email \n"
	               + " address. Youíll get your own WordPress.com address \n"
	               + " (like you.wordpress.com), a selection of great free \n"
	               + " and customizable designs for your blog (we call them themes), \n"
	               + " 3 gigabytes of file storage (thatís about 2,500 pictures!) \n"
	               + " and all the other great features listed here. \n"
	               + " You can blog as much as you want for free, \n"
	               + " your blog can be public to the world or private \n"
	               + " for just your friends, and our premium features \n"
	               + "are completely optional.";
	}


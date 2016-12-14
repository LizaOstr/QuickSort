package Qs;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;


public class ButtonPanelExmple extends JPanel {
	public static JTable table;
	public static Integer[] headers;
	public static Integer[][] data;
	public static Integer[][] data1;
	public static int [] mas;
	public static int [] mas1;
	public static Qs cp;
	public static String t="";
	public static JTextArea txt;
	
	public ButtonPanelExmple(){
		setLayout(null);
		Random rand = new Random();
		
	    txt = new JTextArea();
	    JScrollPane jscrlp = new JScrollPane(txt);	
	    Font font = new Font("Verdana", Font.PLAIN, 11);
	    txt.setEditable(false);
	    txt.setFont(font);
	    //txt.setForeground(Color.YELLOW);
		txt.setText(t+"\n");     
		add(jscrlp).setBounds(380,140,600,410);
		
		Font font1 = new Font("Verdana", Font.PLAIN, 24);
		JLabel label1 = new JLabel("¬’ŒƒÕŒ… Ã¿——»¬");
		JLabel label2 = new JLabel("Œ“—Œ–“»–Œ¬¿ÕÕ€…");
		JLabel label3 = new JLabel("Ã¿——»¬");
		label1.setFont(font1);
		label2.setFont(font1);
		label3.setFont(font1);
		add(label1).setBounds(20,55,400,50);
		add(label2).setBounds(10,575,400,50);
		add(label3).setBounds(70,605,400,50);
		label2.setVisible(false);
		label3.setVisible(false);
		
		JButton BackButton = new JButton("Õ‡Á‡‰");
		add(BackButton).setBounds(1120,600,150,40);
		BackButton.setVisible(false);
		BackButton.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("“–≈Õ¿∆≈– ¡€—“–Œ… —Œ–“»–Œ¬ »");
				ButtonPanel1 panel = new ButtonPanel1();
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(panel);
		          frame.setPreferredSize(new Dimension(1368, 740));
		          frame.pack();
		          frame.setLocationRelativeTo(null);
		          frame.setVisible(true);
			}});
		
	/*	txt.append(t+"5 \n");
		for (int h=0;h<4;h++){
			String a = Integer.toString(h);
			t=t+a;
			txt.append(t+a+"\n");
		}*/
		/*int q = rand.nextInt(21) - 10;
		Object[][] data0 = {{q}};
		q = rand.nextInt(21) - 10;
	       Object[][] data1 = {{q}};
	       q = rand.nextInt(21) - 10;
	       Object[][] data2 = {{q}};
	       q = rand.nextInt(21) - 10;
	       Object[][] data3 = {{q}};
	       q = rand.nextInt(21) - 10;
	       Object[][] data4 = {{q}};
	       q = rand.nextInt(21) - 10;
	       Object[][] data5 = {{q}};
	       q = rand.nextInt(21) - 10;
	       Object[][] data6 = {{q}};
	       q = rand.nextInt(21) - 10;
	       Object[][] data7 = {{q}};
	       q = rand.nextInt(21) - 10;
	       Object[][] data8 = {{q}};
	       q = rand.nextInt(21) - 10;
	       Object[][] data9 = {{q}};
	       
	       Object[] headers0 = {"0"};
	       Object[] headers1 = {"1"};
	       Object[] headers2 = {"2"};
	       Object[] headers3 = {"3"};
	       Object[] headers4 = {"4"};
	       Object[] headers5 = {"5"};
	       Object[] headers6 = {"6"};
	       Object[] headers7 = {"7"};
	       Object[] headers8 = {"8"};
	       Object[] headers9 = {"9"};
	       
 	 
 	 JTable table0 = new JTable(data0,headers0 );
 	 addTabel1(table0,340);
 	 JTable table1 = new JTable(data1,headers1 );
 	addTabel1(table1,420);
 	 JTable table2 = new JTable(data2,headers2 );
 	addTabel1(table2,500);
 	 JTable table3 = new JTable(data3,headers3 );
 	addTabel1(table3,580);
 	 JTable table4 = new JTable(data4,headers4 );
 	addTabel1(table4,660);
 	 JTable table5 = new JTable(data5,headers5 );
 	addTabel1(table5,740);
 	 JTable table6 = new JTable(data6,headers6 );
 	addTabel1(table6,820);
 	 JTable table7 = new JTable(data7,headers7 );
 	addTabel1(table7,900);
 	JTable table8 = new JTable(data8,headers8 );
 	addTabel1(table8,980);
 	 
 Integer R = 0;
 Integer L = 8;
 Integer Q = (L+R)/ 2;
 Integer.toString (Q); 
 table0.setBackground(Color.GREEN);
 table8.setBackground(Color.GREEN);
 table4.setBackground(Color.YELLOW);*/
	    headers = new Integer[10];
	    data = new Integer[1][10];
	    data1 = new Integer[1][10];
		int k=0;
 for (int i = 0; i<=9; i++){
	headers[i]=i; 
	 k = rand.nextInt(21) - 10;
	data[0][i]=k;
	data1[0][i]=k;
 }
 mas = new int [10];
 mas1 = new int[10];
 for (int z=0;z<=9;z++){
	 mas[z]=data[0][z];
 }
 table = new JTable(data,headers );
 table.setColumnSelectionAllowed(true);
 table.setRowSelectionAllowed(false); 
 table.setColumnSelectionInterval(0, 0);
 table.setSelectionBackground(Color.GREEN );
 table.setColumnSelectionInterval(8, 8);
 table.setSelectionBackground(Color.GREEN );
	 addTabel1(table,data,380,40);
	 JButton Prim = new JButton("œËÏÂÌËÚ¸ ");
		add(Prim).setBounds(1120,75,150,40);
		Prim.addActionListener(new ActionListener() {   /////////////////////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
			public void actionPerformed(ActionEvent e) {
				txt.setText(null);
				QuickS(data1,mas,headers,0,9);
				label2.setVisible(true);
				label3.setVisible(true);
				BackButton.setVisible(true);
			}});
			
	//QuickS(table,data,mas,headers,0,8);
	// cp = new Qs();
	// new Thread(cp).start();
}
	public void QuickS(Integer[][] data,int[] mas, Integer[] headers, Integer L,Integer R){
		
		t="";
		 int i = L ;//i
		 int j = R;//j
		 Integer Q = (L+R)/ 2;
		 Integer tmp=0;
		 int n=100;
		// txt.select(15, 5);
		// txt.setSelectedTextColor(Color.red);
		 //txt.repaint();
		 		    while (i <= j){
		    while (mas[i] < mas[Q]) {
		    	txt.append("—‰Ë„‡ÂÏ ‚Ô‡‚Ó \n"); 
		    	i++;
//////////////////////////////////////////////////////////////////////////	    	
		    	for (int g=L;g<=R;g++){
					 String a = Integer.toString(mas[g]);
					 t=t+" | "+a;  
				 }
		    	
		    	txt.setForeground(Color.YELLOW);
		    	
				 txt.append(t+" |");
				 txt.append("\n");
				 for (int g=0;g<=i+1;g++){
					txt.append("   "); 
				 }
				 txt.append("L");
				 
				 for (int g=i;g<=j+1;g++){
					 txt.append("     ");  
				 }
				 txt.append("R");
				 txt.append("\n");
				 //txt.append("  L             R");
				 //txt.append("\n");
				 txt.append(" ");
				 txt.append("\n");
				 txt.setForeground(Color.BLACK);
				 t="";
//////////////////////////////////////////////////////////////////////////			 
		    	}		    
		    while (mas[Q] < mas[j]) {
		    	txt.append("—‰Ë„‡ÂÏ ‚ÎÂ‚Ó \n");
		    	j--;
//////////////////////////////////////////////////////////////////////////
		    	for (int g=L;g<=R;g++){
					 String a = Integer.toString(mas[g]);
					 t=t+" | "+a;  
				 }
				 txt.append(t+" |");
				 txt.append("\n");
				 txt.append(" ");
				 txt.append("\n");
				 t="";
//////////////////////////////////////////////////////////////////////////
		    	}
		    if ((i <= j)) {
		    	txt.append("œÓÏÂÌˇÎË \n");
		      tmp=mas[i];
		      mas[i]=mas[j];
		     mas[j]=tmp;
		     i++;
		      j--;  
//////////////////////////////////////////////////////////////////////////
for (int g=L;g<=R;g++){
String a = Integer.toString(mas[g]);
t=t+" | "+a;  
}
txt.append(t+" |");
txt.append("\n");
txt.append(" ");
txt.append("\n");
t="";
//////////////////////////////////////////////////////////////////////////
		    }		      
		    } 
		  if (L < j) {   
			  txt.append("–‡ÒÒÏ‡ÚË‚‡ÂÏ ÎÂ‚Û˛ ˜‡ÒÚ¸ \n");
//////////////////////////////////////////////////////////////////////////
for (int g=L;g<=j;g++){
String a = Integer.toString(mas[g]);
t=t+" | "+a;  
}
txt.append(t+" |");
txt.append("\n");
txt.append(" ");
txt.append("\n");
t="";
//////////////////////////////////////////////////////////////////////////`12
		  QuickS(data,mas,headers,L,j);
		  }
		  if (i < R) {
			  txt.append("–‡ÒÒÏ‡ÚË‚‡ÂÏ Ô‡‚Û˛ ˜‡ÒÚ¸ \n");
//////////////////////////////////////////////////////////////////////////
for (int g=i;g<=R;g++){
String a = Integer.toString(mas[g]);
t=t+" | "+a;  
}
txt.append(t+" |");
txt.append("\n");
txt.append(" ");
txt.append("\n");
t="";
//////////////////////////////////////////////////////////////////////////
		  QuickS(data,mas,headers,i,R);

		  }
		 // n=n+100;
		 // data1 = new Integer[1][10];
	    	for (int z=0; z<=9;z++){
	  			  data1[0][z]=mas[z];
	  		  }
	    	JTable table1 = new JTable(data1,headers );
		  addTabel1(table1,data1,380,580);
		 // table1.repaint();
	}
	
	public void addTabel1(JTable table,Integer[][] data,Integer x, Integer y) {
		 table.setRowHeight(55);
		// table.repaint();
   	 JScrollPane jscrlp = new JScrollPane(table);
   	 add(jscrlp).setBounds(x,y,600,80);;
   	 jscrlp.setVisible(true);
	}

	protected void paintComponent(Graphics g){
	       super.paintComponent(g);
	      // setLayout(new BorderLayout());
	           Image im = new ImageIcon("Pictures/pc.jpg").getImage();
	           g.drawImage(im, 0, 0, null); 
	           Image im1 = new ImageIcon("Pictures/0107-2-bottichino-pink2.jpg").getImage();
	           g.drawImage(im1, 0, 0, null); 
	           }
}

class Qs implements Runnable{
	JTable table=ButtonPanelExmple.table;
	Integer[][] data=ButtonPanelExmple.data;
	int[] mas = ButtonPanelExmple.mas;
	Integer[] headers = ButtonPanelExmple.headers;
		boolean flag=false;
		private final Object lock = new Object();
		
			 public void NotifyCP() {
		 if (!flag) return;

		        flag = false; 
	        synchronized(lock){
	            lock.notifyAll();
	        }
	       
	    }
		
	
	public void run(){
	//ButtonPanelExmple.QuickS(table,data,mas,headers,0,8);
            try {
            	if (flag) { lock.wait(); }
            
            } catch (InterruptedException ex) {

            }
        }
		 
	}
		 // System.out.println(pi);

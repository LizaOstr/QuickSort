package Qs;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

public class ButtonPanel3 extends JPanel{
	String tex = "Упсс! Попробуйте еще раз!";
	String tex1 = "Отлично!!! Теперь приступим к сортировке";
	String tex2 = "1) Выберете, как вы хотите заполнить массив: ";
	String tex3 = "2) Введите количество элементов: ";
	String tex4 = "3) Введите ";
	String tex5 =" элементов (через пробел):";
	String tex6 = "Введите данные для рассматриваемой части массива: ";
	String tex7 = "Введите позиции указателей: ";
	public static JLabel mis;
	public static JLabel mis1;
	static int n=0;
	int x;
	public static int [] mas;
	public static Integer[] headers1;
	public static Integer[][] data1;
	public static JTextArea txt;
	public static String t="!";
	public static Qs1 cp;
	public static Integer L;
	public static Integer R;
	public static Integer Q;
	public static Integer S;
	public static Integer E;
	public static JButton ButtonOK;
	public static JButton ButtonNEXT;
	public static JTextField chboxLeft;
	public static JTextField chboxRight;
	public static JTextField chboxLeft1;
	public static JTextField chboxRight1;
	public static JTextField chboxMiddle1;
	public static JTextField txtErrors;
	public static int sum;

	public ButtonPanel3(){
		setLayout(null);
		
		Random rand = new Random();
		JLabel labelFirst = new JLabel(tex2); //1
		Font BigFontTR = new Font("TimesRoman", Font.BOLD, 14);
		Font NotBigFontTR = new Font("TimesRoman", Font.PLAIN, 16);
		Font NotBigFontTR1 = new Font("TimesRoman", Font.PLAIN, 14);
		labelFirst.setFont(BigFontTR );
		add(labelFirst).setBounds(20,10,400,50);
		labelFirst.setVisible(true);
		
		JCheckBox chboxHands = new JCheckBox("Вручную");
		JCheckBox chboxRandom = new JCheckBox("Рандомно");
		chboxHands.setContentAreaFilled(false);
		chboxRandom.setContentAreaFilled(false);
		add(chboxHands).setBounds(20,50,100,20);
		add(chboxRandom).setBounds(20,80,100,20);
		JButton PrimZapolnenie = new JButton("Применить");
		add(PrimZapolnenie).setBounds(20,110,120,30);
		
		JLabel label3 = new JLabel(tex3);          //2
		label3.setFont(BigFontTR );
		add(label3).setBounds(20,140,270,30);
		label3.setVisible(false);
		JTextField Tex3 = new JTextField(100);
		Tex3.setFont(NotBigFontTR );
		add(Tex3).setBounds(20,180,100,23);
		Tex3.setVisible(false);
		JButton PrimKol = new JButton("Применить");
		add(PrimKol).setBounds(20,210,120,30);
		PrimKol.setVisible(false);
		
		JButton PrimKol1 = new JButton("Применить");
		add(PrimKol1).setBounds(20,210,120,30);
		PrimKol1.setVisible(false);
		
		JTextField Tex4 = new JTextField(100); //4
		Tex4.setFont(NotBigFontTR1 );
		add(Tex4).setBounds(20,280,350,23);
		Tex4.setVisible(false);
		JButton PrimMas = new JButton("Применить");
		add(PrimMas).setBounds(20,310,120,30);
		PrimMas.setVisible(false);
		
		
		JTextField Tex = new JTextField(100);
		JButton Prim = new JButton("Применить ");
		add(Prim).setBounds(820,160,150,40);
		add(Tex).setBounds(500,150,300,60);
		Prim.setVisible(false);
		Tex.setVisible(false);
		//Tex.setVisible(true);
		
		JLabel label = new JLabel(tex);
		add(label).setBounds(20,340,200,30);
		label.setVisible(false);//g.drawString("Отлично!!! Теперь приступим к сортировке ", 300, 400);
		
		JLabel label1 = new JLabel(tex1);
		label1.setFont(BigFontTR);
		add(label1).setBounds(20,340,400,30);
		label1.setVisible(false);
		
		JLabel label11 = new JLabel(tex1);
		label11.setFont(BigFontTR);
		add(label11).setBounds(20,240,400,30);
		label11.setVisible(false);

		JLabel label4 = new JLabel(tex6);          //5
		label4.setFont(BigFontTR );
		add(label4).setBounds(10,370,410,30);
		label4.setVisible(false);
		
		JLabel label12 = new JLabel(tex7);          //5
		label12.setFont(BigFontTR );
		add(label12).setBounds(10,520,470,30);
		label12.setVisible(false);
		
		JLabel label6 = new JLabel("Левый элемент");
		label6.setFont(BigFontTR);
		add(label6).setBounds(20,400,400,30);
		label6.setVisible(false);
		JLabel label7 = new JLabel("Правый элемент");
		label7.setFont(BigFontTR);
		add(label7).setBounds(20,430,400,30);
		label7.setVisible(false);
		JLabel label8 = new JLabel("Опорный элемент");
		label8.setFont(BigFontTR);
		add(label8).setBounds(20,460,400,30);
		label8.setVisible(false);
		JLabel label9 = new JLabel("Левый  указатель");
		label9.setFont(BigFontTR);
		add(label9).setBounds(20,550,400,30);
		label9.setVisible(false);
		JLabel label10 = new JLabel("Правый указатель");
		label10.setFont(BigFontTR);
		add(label10).setBounds(20,580,400,30);
		label10.setVisible(false);
		chboxLeft1 = new JTextField();
		chboxRight1 = new JTextField();
		chboxMiddle1 = new JTextField();
		add(chboxLeft1).setBounds(150,400,80,30);
		add(chboxRight1).setBounds(150,430,80,30);
		add(chboxMiddle1).setBounds(150,460,80,30);
		chboxLeft1.setVisible(false);
		chboxRight1.setVisible(false);
		chboxMiddle1.setVisible(false);
		chboxLeft = new JTextField();
		chboxRight = new JTextField();
		add(chboxLeft).setBounds(150,550,80,30);
		add(chboxRight).setBounds(150,580,80,30);
		chboxLeft.setVisible(false);
		chboxRight.setVisible(false);
	    ButtonOK = new JButton("OK");
		add(ButtonOK).setBounds(150,620,80,30);
		ButtonOK.setVisible(false);
		ButtonNEXT = new JButton("NEXT");
		add(ButtonNEXT).setBounds(250,620,80,30);
		ButtonNEXT.setVisible(false);
		JLabel label13 = new JLabel("ПОЛЕ ОШИБОК");
		label13.setForeground(Color.RED);
		add(label13).setBounds(20,640,400,30);
		label13.setVisible(false);
		txtErrors = new JTextField();
		txtErrors.setForeground(Color.RED);
		add(txtErrors).setBounds(20,670,340,30);
		txtErrors.setVisible(false);
		//mis= new JLabel("Вы ввели не все данные");
 	    //add(mis).setBounds(20,550,200,30);
 	    //mis.setVisible(false);
 	    //mis1= new JLabel("Проверьте!!!Возможен выход за пределы!");
	    //add(mis1).setBounds(20,550,200,30);
	    //mis1.setVisible(false);
	    
	    
		
		 txt = new JTextArea();
		    JScrollPane jscrlp = new JScrollPane(txt);	
		    Font font = new Font("Verdana", Font.PLAIN, 11);
		    txt.setEditable(false);
		    txt.setFont(font);
		    //txt.setForeground(Color.YELLOW);
			txt.setText(t+"\n");     
			add(jscrlp).setBounds(480,140,600,410);
			txt.setVisible(false);

		
		chboxHands.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {
		       if (chboxRandom.isSelected()==true){
		    	   chboxRandom.setSelected(false);  
		       }
		    }
	   });
		chboxRandom.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent e) {
				if (chboxHands.isSelected()==true){
			    	   chboxHands.setSelected(false);  
			       }  
		    }
	   });
		PrimZapolnenie.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent e) {
				if (chboxHands.isSelected()==true){
					label3.setVisible(true);
					Tex3.setVisible(true);
					PrimKol.setVisible(true);	
				}
				if (chboxRandom.isSelected()==true){
					label3.setVisible(true);
					Tex3.setVisible(true);
					PrimKol1.setVisible(true);	 
			       }
		    }
	   });
		PrimKol.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent e) {
				   String size = Tex3.getText();
			       int sizemas=Integer.parseInt(size);
			       n=sizemas;
			       JLabel label4 = new JLabel(tex4+n+tex5);          //3
					label4.setFont(BigFontTR );
					add(label4).setBounds(20,240,300,30);
			        label4.setVisible(true);
			        Tex4.setVisible(true);
			        PrimMas.setVisible(true);
		    }
	   });
		PrimKol1.addActionListener(new ActionListener() {   //Random
			public void actionPerformed(ActionEvent e) {
				x=240;
				   mas = new int[n];
				   String size = Tex3.getText();//3R
			       int sizemas=Integer.parseInt(size);
			       n=sizemas;
			       headers1 = new Integer[n];
				    data1 = new Integer[1][n];
					int k=0;
			 for (int i = 0; i<=n-1; i++){
				headers1[i]=i; 
				 k = rand.nextInt(21) - 10;
				data1[0][i]=k;
			 }
			 mas = new int [n];
			 for (int z=0;z<=n-1;z++){
				 mas[z]=data1[0][z];
			 }
			 JTable table = new JTable(data1,headers1 );
			 table.setRowHeight(50);
			   JScrollPane jscrlp = new JScrollPane(table);	
			 //  add(jscrlp).setBounds(600-(n^2),20,60*n,80);
			   	 add(jscrlp).setBounds(520,20,570,80);
			label11.setVisible(true);
		  	chboxLeft.setVisible(true);
			chboxRight.setVisible(true);
			chboxLeft1.setVisible(true);
			chboxRight1.setVisible(true);
			chboxMiddle1.setVisible(true);
			txt.setVisible(true);
			txtErrors.setVisible(true);
			label6.setVisible(true);
			label7.setVisible(true);
			label8.setVisible(true);
			label9.setVisible(true);
			label10.setVisible(true);
			label12.setVisible(true);
			label13.setVisible(true);
			ButtonOK.setVisible(true);
			ButtonNEXT.setVisible(true);
			label4.setVisible(true);
			cp = new Qs1();
			 new Thread(cp).start(); 
		    }
	   });
		PrimMas.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent e) {
				x=340;
				 mas = new int[n];
				   String chisla = Tex4.getText();
			       String s=chisla;
			       String[] words = s.split(" ");
			       headers1 = new Integer[n];
				   data1 = new Integer[1][n];
				   int k=0;
				   if (words.length!=n){
		    		   label.setVisible(true); 
		    	   }
		    	   else{
		    		 label.setVisible(false); 
		    		 label1.setVisible(true);
				   for (int i = 0; i<=n-1; i++){
				  	headers1[i]=i; 
				  	mas[i]=Integer.parseInt( words[i]);
				  	data1[0][i]=mas[i];
				   }
				   for (int z=0;z<=n-1;z++){
				  	 mas[z]=data1[0][z];
				   }
				   JTable table = new JTable(data1,headers1);
				   table.setRowHeight(50);
				   JScrollPane jscrlp = new JScrollPane(table);				   	 
				   	 add(jscrlp).setBounds(500,20,570,80);
				   	label4.setVisible(true);
				   	chboxLeft.setVisible(true);
					chboxRight.setVisible(true);
					chboxLeft1.setVisible(true);
					chboxRight1.setVisible(true);
					chboxMiddle1.setVisible(true);
					txt.setVisible(true);
					txtErrors.setVisible(true);
					label6.setVisible(true);
					label7.setVisible(true);
					label8.setVisible(true);
					label9.setVisible(true);
					label10.setVisible(true);
					label12.setVisible(true);
					label13.setVisible(true);
					ButtonOK.setVisible(true);
					ButtonNEXT.setVisible(true);
					cp = new Qs1();
					new Thread(cp).start(); 
			}}
		});
		
		ButtonNEXT.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent e) {
				/*synchronized(cp){
		            cp.notifyAll();
		        }*/
				//Qs1.NotifyCP();
				 sum=sum+1;
				 String left = Integer.toString(L);
			     String right = Integer.toString(R);
			     String middle = Integer.toString(Q);
			     String left1 = Integer.toString(S);
			     String right1 = Integer.toString(E);
				
			     chboxLeft.setText(left);
			     chboxRight.setText(right);
			     chboxLeft1.setText(left1);
			     chboxRight1.setText(right1);
			     chboxMiddle1.setText(middle);
			     
			     synchronized(cp){
			            cp.notifyAll();
			        }
	   }});
		
		/*ButtonOK.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent e) {
				synchronized(cp){
		            cp.notifyAll();
		        }
				//Qs1.NotifyCP();
				String left = chboxLeft.getText();
			     String right = chboxRight.getText();
			     String middle = chboxMiddle.getText();
				if (left.equals("") | right.equals("") | middle.equals("")){
			    	   mis.setVisible(true);
			       }  
				else {
					mis.setVisible(false);
					int m;
					int l;
					int r;
					l=Integer.parseInt(left);
				    r=Integer.parseInt(right);
				    m=Integer.parseInt(middle);
				    if((l<0)|(l>n-1)|(r<0)|(r>n-1)|(m<0)|(m>n-1)){
				    	mis1.setVisible(true);
				    }
				    else {
				    	mis1.setVisible(false);
				    	//cp.NotifyCP();
				    	if ((l=L)&&(r=R)&&(m=Q)){
				    	flag=;
				    }
				}
		    }
	   }});*/
		ButtonOK.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent e) {
				/*synchronized(cp){
		            cp.notifyAll();
		        }*/
				//Qs1.NotifyCP();
				String left = chboxLeft1.getText();
			     String right = chboxRight1.getText();
			     String middle = chboxMiddle1.getText();
			     String left1 = chboxLeft.getText();
			     String right1 = chboxRight.getText();
				if (left.equals("") | right.equals("") | middle.equals("")|left1.equals("") | right1.equals("")){
					txtErrors.setText("Заполнены не все поля");
			       }  
				else {
					//mis.setVisible(false);
					int m;
					int l;
					int r;
					int l1;
					int r1;
					l=Integer.parseInt(left);
				    r=Integer.parseInt(right);
				    m=Integer.parseInt(middle);
				    l1=Integer.parseInt(left1);
				    r1=Integer.parseInt(right1);
				    if((l<0)|(l>n-1)|(r<0)|(r>n-1)|(m<0)|(m>n-1)|(l1<0)|(l1>n-1)|(r1<0)|(r1>n-1)){
				    	//mis1.setVisible(true);
				    	txtErrors.setText("Возможен выход за пределы");
				    }
				    else {
				    	//mis1.setVisible(false);
				    	//cp.NotifyCP();
				    	if ((l==S)&&(r==E)&&(m==Q)&&(l1==L)&&(r1==R)){
				    		txtErrors.setText("");
				    		synchronized(cp){
					            cp.notifyAll();
					        }
				    		
				    		//chboxLeft.setText("2!!!!!!!!!!");
				    }
				    	else{
				    		//chboxLeft.setText("!!!!!!!!!!");
				    		if(l!=S){
				    			txtErrors.setText("Проверьте левый предел рассматриваемой области");
				    		}
				    		if(r!=E){
				    			txtErrors.setText("Проверьте правый предел рассматриваемой области");
				    		}
				    		if(m!=Q){
				    			txtErrors.setText("Проверьте опорный рассматриваемой области");
				    		}
				    	}
				}
		    }
	   }});
		
	}
	
	
public static void QuickS(Integer[][] data,int[] mas, Integer[] headers,Integer L,Integer R){
		
		t="";
		 S=L;
		 E=R;
		 int i = L ;//i
		 int j = R;//j
		 Integer Q = (L+R)/ 2;
		 Integer tmp=0;
		 ButtonPanel3.L=i;
		 ButtonPanel3.R=j;
		 ButtonPanel3.Q=Q;
		 int n=100;
		// txt.select(0, 1);
		// txt.setSelectedTextColor(Color.red);
		 //txt.repaint();
		 		    while (i <= j){
		    while (mas[i] < mas[Q]) {
		    	i++;
//////////////////////////////////////////////////////////////////////////	//right
		    	//cp.flag=false;
		    	ButtonPanel3.L=i;
				 ButtonPanel3.R=j;
		    	synchronized(cp){
		    		try {
						cp.wait();
						//cp.sleep(1000);
					} catch (InterruptedException e) {
						
					} }
		    	chboxLeft1.setEditable(false);
		    	chboxRight1.setEditable(false);
		    	chboxMiddle1.setEditable(false);
		    	txt.append("Сдвинули вправо \n"); 
		    	for (int g=L;g<=R;g++){
					 String a = Integer.toString(mas[g]);
					 t=t+" | "+a;  
				 }		    	
		    	//txt.setForeground(Color.YELLOW);
				 txt.append(t+" |");
				 txt.append("\n");
				 txt.setForeground(Color.BLACK);
				 t="";
//////////////////////////////////////////////////////////////////////////	//left		 
		    	}		    
		    while (mas[Q] < mas[j]) {		    	
		    	j--;
//////////////////////////////////////////////////////////////////////////
		        //cp.flag=true;
		    	ButtonPanel3.L=i;
				 ButtonPanel3.R=j;
		    	synchronized(cp){
		    		try {
						cp.wait();
						//cp.sleep(1000);
					} catch (InterruptedException e) {
						
					} }
		    	chboxLeft1.setEditable(false);
		    	chboxRight1.setEditable(false);
		    	chboxMiddle1.setEditable(false);
		    	txt.append("Сдвинули влево \n");
		    	for (int g=L;g<=R;g++){
					 String a = Integer.toString(mas[g]);
					 t=t+" | "+a;   
				 }
				 txt.append(t+" |");
				 txt.append("\n");
				 t="";
////////////////////////////////////////////////////////////////////////// //change
		    	}
		    if ((i <= j)) {
		    	txt.append("Поменяли \n");
		      tmp=mas[i];
		      mas[i]=mas[j];
		     mas[j]=tmp;
		     i++;
		      j--;  
//////////////////////////////////////////////////////////////////////////  
		     // cp.flag=true;
for (int g=L;g<=R;g++){
String a = Integer.toString(mas[g]);
t=t+" | "+a;  
}
txt.append(t+" |");
txt.append("\n");
t="";
////////////////////////////////////////////////////////////////////////// //leftside
		    }		      
		    } 
		  if (L < j) {   
			  
//////////////////////////////////////////////////////////////////////////
			  
			  chboxLeft1.setEditable(true);
		    	chboxRight1.setEditable(true);
		    	chboxMiddle1.setEditable(true);
		    	chboxLeft1.setText("");
		    	chboxRight1.setText("");
		    	chboxMiddle1.setText("");
		    	
		    	synchronized(cp){
		    		try {
						cp.wait();
						//cp.sleep(1000);
					} catch (InterruptedException e) {
						
					} }
		    	
		    	txt.append("Рассматриваем левую часть \n");
for (int g=L;g<=j;g++){
String a = Integer.toString(mas[g]);
t=t+" | "+a; 
}
txt.append(t+" |");
txt.append("\n");
t="";
//////////////////////////////////////////////////////////////////////////`12 //rightside

		  QuickS(data,mas,headers,L,j);
		  }
		  if (i < R) {
//////////////////////////////////////////////////////////////////////////
			  chboxLeft1.setEditable(true);
		    	chboxRight1.setEditable(true);
		    	chboxMiddle1.setEditable(true);
		    	chboxLeft1.setText("");
		    	chboxRight1.setText("");
		    	chboxMiddle1.setText("");
		    	
		    	synchronized(cp){
		    		try {
						cp.wait();
						//cp.sleep(1000);
					} catch (InterruptedException e) {
						
					} }
		    	
		    	txt.append("Рассматриваем правую часть \n");
for (int g=i;g<=R;g++){
String a = Integer.toString(mas[g]);
t=t+" | "+a;   
}
txt.append(t+" |");
txt.append("\n");
t="";
//////////////////////////////////////////////////////////////////////////

		  QuickS(data,mas,headers,i,R);
		  }
		 // n=n+100;
		 // data1 = new Integer[1][10];
	    	/*for (int z=0; z<=n-1;z++){
	  			  data1[0][z]=mas[z];
	  		  }
	    	JTable table1 = new JTable(data1,headers );*/
		 //addTabel2(table1,data1,380,580);
		 // table1.repaint();
}


	
	public static void addTabel2(JTable table,Integer[][] data,Integer x, Integer y) {
		table.setRowHeight(50);
   /*	 JScrollPane jscrlp = new JScrollPane(table);
   	jscrlp.add(table);
   	jscrlp.setBounds(x,y,80,80);;
   	 jscrlp.setVisible(true);*/
	}
	
	protected void paintComponent(Graphics g){
	       super.paintComponent(g);
	      // setLayout(new BorderLayout());
	           Image im = new ImageIcon("Pictures/pc.jpg").getImage();
	           g.drawImage(im, 0, 0, null); 
	           Image im1 = new ImageIcon("Pictures/0107-2-bottichino-pink.jpg").getImage();
	           g.drawImage(im1, 0, 0, null); 
	           Font BigFontTR = new Font("TimesRoman", Font.BOLD, 20);
	           g.setFont(BigFontTR );
	        //   g.drawString("Заполните пожалуйста массив ", 550, 80);
	           
	           
	           Font BigFontTR1 = new Font("TimesRoman", Font.BOLD, 17);
	           g.setFont(BigFontTR1 );
	         //  g.drawString("Введите 10 чисел через пробел(последним должен быть пробел)", 450, 100);
	        
	}

}

class Qs1 extends Thread{
	static boolean flag=true;
	double pi=0.0;
	Integer[][] data1=ButtonPanel3.data1;
	int[] mas = ButtonPanel3.mas;
	Integer[] headers1 = ButtonPanel3.headers1;
	int n=ButtonPanel3.n;
	Integer sum =ButtonPanel3.sum;
	JTextArea txt =ButtonPanel3.txt;
	private final static Object lock = new Object();
	
	 public void NotifyCP() {
		 if (!flag) return;

		        flag = true; 
	        synchronized(lock){
	            lock.notifyAll();
	        }
	       
	    }

 public void NotifyAll() {
		// TODO Auto-generated method stub
		
	}

public void run(){
		ButtonPanel3.QuickS(data1,mas,headers1,0,n-1);
		if((n<=20)&&(sum>=5)){
			txt.append("УРА! ВЫ ОТСОРТИРОВАЛИ МАССИВ! \n"); 
			  }
			  else{
				  txt.append("УРА! ВЫ ОТСОРТИРОВАЛИ МАССИВ! \n");
				  txt.append("Но вы часто пользовались подсказками,так что попробуйте еще раз!"+sum+" "+n);				   
			  }	
	 // System.out.println(pi);
 }
}


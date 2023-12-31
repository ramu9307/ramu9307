//program to demonstrate Label, TextField, TextArea, Choice, List

import java.awt.*;
import java.awt.event.*;
class UserRegAwt extends Frame 
{
	Label l1,l2,l3,l4,l5;
	TextField tf1,tf2;
	TextArea ta1;
	Choice ch1;
	List li1;
	
	UserRegAwt()
	{
		this.setLayout(null);
		
		l1 = new Label("Name");
		l1.setBounds(30,30,80,20);
		this.add(l1);
		
		tf1 = new TextField("Enter Name Here",20);
		tf1.setBounds(150,30,80,20);
		this.add(tf1);
		
		l2 = new Label("Password");
		l2.setBounds(30,80,80,20);
		this.add(l2);
		
		tf2 = new TextField("Enter Password Here",20);
		tf2.setBounds(150,80,80,20);
		this.add(tf2);
		
		l3 = new Label("Address");
		l3.setBounds(30,120,80,20);
		this.add(l3);
		
		ta1 = new TextArea("",50,50,TextArea.SCROLLBARS_NONE);
		ta1.setBounds(150,120,80,80);
		this.add(ta1);
		
		l4 = new Label("Country");
		l4.setBounds(30,240,80,20);
		this.add(l4);
		
		ch1 = new Choice();
		ch1.add("India");
		ch1.add("US");
		ch1.add("UK");
		ch1.add("AUS");
		
		ch1.setBounds(150,240,80,80);
		this.add(ch1);
		
		l5 = new Label("Interests");
		l5.setBounds(30,290,80,20);
		this.add(l5);
		
		li1 = new List(3,true);
		li1.add("Reading Books");
		li1.add("Watching TV");
		li1.add("Games");
		li1.add("Sports");
		li1.add("Internet Surfing");
		
		li1.setBounds(150,290,80,100);
		this.add(li1);
		}
		public static void main(String ar[])
		{
			UserRegAwt f = new UserRegAwt();
			f.setSize(500,400);
			f.setVisible(true);
			
			}
			
}			
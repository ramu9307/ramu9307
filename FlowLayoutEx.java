//program to demonstrate flowlayout
import java.awt.*;
class FlowLayoutEx extends Frame
{
	   public static void main(String ar[])
	   {  
	         FlowLayoutEx f = new FlowLayoutEx();
			 f.setSize(300,400);
			 f.setVisible(true);
			 f.setBackground(Color.blue);
			  
			 //setting Layout
			 FlowLayout fl = new FlowLayout(FlowLayout.CENTER,10,20);
			 
			 //setting layout to the frame
			 f.setLayout(fl);
			 
			 //create a button 
			 Button b1 = new Button("Red");
			 
			 //add this button to the frame
			 f.add(b1);
			 
			 Button b2 = new Button("Blue");
			 f.add(b2);
			 
			 Button b3 = new Button("Green");
			 f.add(b3);
			 
			 Button b4 = new Button("Violet");
			 f.add(b4);
			 
			 Button b5 = new Button(" Indigo");
			 f.add(b5);
			 
			 
			 
	   }
			 
}			 
				
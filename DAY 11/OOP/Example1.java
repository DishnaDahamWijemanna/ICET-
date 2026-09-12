import javax.swing.*;
import java.awt.*;
class Example1{
		public static void main(String args[]){
			JFrame f1 =new JFrame();
			f1.setSize(300,300);
			f1.setTitle("cal");
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//3
			f1.setLocationRelativeTo(null);
			//f1.setLayout(new BorderLayout());//by default it coming
			f1.setLayout(new FlowLayout());
			JButton btnExit=new JButton();
			btnExit.setText("North");
			btnExit.setFont(new Font("",1,25));
			
			
		
			JButton btnEnter=new JButton();
			btnEnter.setText("South");
			btnEnter.setFont(new Font("",1,25));
			
			JButton btnCancel = new JButton();
			btnCancel.setText("Center");
			btnCancel.setFont(new Font("",1,25));
			
			
			JButton btnShift = new JButton();
			btnShift.setText("West");
			btnShift.setFont(new Font("",1,25));
			
			JButton btnSpace = new JButton();
			btnSpace.setText("East");
			btnSpace.setFont(new Font("",1,25));
			
			
			f1.add("North",btnExit);
			f1.add("South",btnEnter);
			f1.add("Center",btnCancel);
			f1.add("West",btnShift);
			f1.add("East",btnSpace);
			
			
			f1.setVisible(true);
			//f1.pack();



		}
}

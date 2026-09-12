import javax.swing.*;
import java.awt.*;
class Calculator extends JFrame{
		private JButton [] buttonArray;
		private JTextField txtDisplay;
		Calculator(){
	
		setSize(300,300);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//3
		setLocationRelativeTo(null);
		
		JPanel p1=new JPanel(new GridLayout(4,4,5,5));
		
		
		buttonArray=new JButton[16];
		String [] buttonText = {"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};
		
		for(int i=0;i<16;i++){
				buttonArray[i]=new JButton(buttonText[i]);
				buttonArray[i].setFont(new Font("",1,20));
				p1.add(buttonArray[i]);
		}
		
		JTextField t1 =new JTextField();
		t1.setFont(new Font("",1,25));
		t1.setHorizontalAlignment(JTextField.RIGHT);

		add("Center",p1);
		add("North",t1);
	}


}
class Example5{
		public static void main(String args[]){
			Calculator cal = new Calculator();
			cal.setVisible(true);
		}
}


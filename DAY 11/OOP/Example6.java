import java.util.*; 
import javax.swing.*; 
import java.awt.*; 
class AddStudentForm extends JFrame{
	AddStudentForm(){
		setSize(400,300);
		setTitle("Add Student Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JLabel l1 = new JLabel("Add Student Form");
		l1.setFont(new Font("",1,25));
		l1.setHorizontalAlignment(JLabel.CENTER);
		add("North",l1);
		
		JPanel p1=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton btnAdd=new JButton("Add Student");
		btnAdd.setFont(new Font("",1,20));	
		p1.add(btnAdd);
		JButton btnCancel=new JButton("Cancel");
		btnCancel.setFont(new Font("",1,20));	
		p1.add(btnCancel);
		add("South",p1);
		
		
		JPanel labelPanel=new JPanel(new GridLayout(4,1,5,5));
		JLabel lblId=new JLabel("Student Id");
		lblId.setFont(new Font("",1,20));
		labelPanel.add(lblId);
		
		JLabel lblName=new JLabel("Name");
		lblName.setFont(new Font("",1,20));
		labelPanel.add(lblName);
		
		JLabel lblPrfMarks=new JLabel("PRF Marks");
		lblPrfMarks.setFont(new Font("",1,20));
		labelPanel.add(lblPrfMarks);
		
		JLabel lblDbmsMarks=new JLabel("DBMS Marks");
		lblDbmsMarks.setFont(new Font("",1,20));
		labelPanel.add(lblDbmsMarks);
		add("West", labelPanel);

		JPanel textPanel=new JPanel(new GridLayout(4,1));
		JTextField txtId=new JTextField(4);
		txtId.setFont(new Font("",1,20));
		textPanel.add(txtId);
		JTextField txtName=new JTextField(8);
		txtName.setFont(new Font("",1,20));
		textPanel.add(txtName);
		JTextField txtPrfMarks=new JTextField(3);
		txtPrfMarks.setFont(new Font("",1,20));
		textPanel.add(txtPrfMarks);
		JTextField txtDbmsMarks=new JTextField(3);
		txtDbmsMarks.setFont(new Font("",1,20));
		textPanel.add(txtDbmsMarks);
		add("Center",textPanel);

		


	}
		
		
}
class Example6{
		public static void main(String args[]){
			
			new AddStudentForm().setVisible(true);

		}
}

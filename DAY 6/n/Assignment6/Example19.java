import java.util.*;
class Example19{
		public static void getSub(){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the Student name : ");
				String studentName = sc.nextLine();
				
				Random r =new Random();
				
				String [] g1 = {"Business & Accounting","Geography",
								"Citizenship Education","Entrepreneurship studies",
								"2nd language Sinhala","2nd Language Tamil","Foreign Languages(Arabic)",
								"Foreign Languages(Hindi)","Foreign Languages(French)","Foreign Languages(Japan)"};
				String [] g2 = {"Art","Tamil Literature","English Literature","Sinhala Literature","Music","Dancing"};
				
				String [] g3 = {"Information & technology","Agriculture","Home Economics",
								"Health Science","Art & Craft","Media"};	
								
				String gro1 = g1[r.nextInt(g1.length)];
				String gro2 = g2[r.nextInt(g2.length)];
				String gro3 = g3[r.nextInt(g3.length)];	
				
				System.out.println("Student Name: " + studentName);
				System.out.println("Group 01 Subject: " + gro1);
				System.out.println("Group 02 Subject: " + gro2);
				System.out.println("Group 03 Subject: " + gro3);		
							
		}
		public static void main(String args[]){
				getSub();
		}
}

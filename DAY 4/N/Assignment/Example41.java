import java.util.*;
class Example41{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the number of copies that you want : ");
				int nCopy = input.nextInt();
				
				double perCopy =0;
				double tot =0;
				if(0<=nCopy && nCopy<100){
						perCopy = 30;
						tot = perCopy*nCopy;
				}else if(100<=nCopy && nCopy<500){
						perCopy = 28;
						tot = perCopy*nCopy;
				}else if(500<=nCopy && nCopy<800){
						perCopy = 27;
						tot = perCopy*nCopy;
				}else if(800<=nCopy && nCopy<1000){
						perCopy = 26;
						tot = perCopy*nCopy;
				}else if(1000<=nCopy){
						perCopy = 25;
						tot = perCopy*nCopy;
			    }else{
						System.out.print("Invalid number of copies");
				}
				
				System.out.println("price per copy "+perCopy);
				System.out.println("Total price : "+tot);
				
		}
}

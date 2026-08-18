import java.util.*;
class Example32{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the number of classes held : ");
				int hClasses = input.nextInt();
				
				System.out.print("Enter the number of attend classes : ");
				int aClasses = input.nextInt();
				
				double aPer = ((double)aClasses/hClasses)*100;
				if(aPer>=70){
						System.out.print("eligibility for the PRF exam");
				}else{
						System.out.print("Do you have a Medical enter 'Y' or 'N' : ");
						char  med = input.next().charAt(0);
						
						if(med=='Y' || med=='y'){
								System.out.print("you can sit for the PRF exam");
						}else if(med=='N' || med=='n'){
								System.out.print("you can't sit for the PRF exam");
						}
				}
		}
}

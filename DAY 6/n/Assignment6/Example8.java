import java.util.*;
class Example8{
		public static void getWord(){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the first word : ");
				char f = input.next().toUpperCase().charAt(0);
				
				System.out.print("Enter the Second word : ");
				char s = input.next().toUpperCase().charAt(0);
				
				if(f==s){
						System.out.print(true);
				}else{
						System.out.print(false);
				}
		}
		public static void main(String args[]){
				getWord();
		}
	}

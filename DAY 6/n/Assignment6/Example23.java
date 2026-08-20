import java.util.*;
class Example23{
		public static int vCount(String str){
				int vcou = 0;
				for(int i = 0;i<str.length();i++){
					char c = str.toUpperCase().charAt(i);
					if(c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U'){
						vcou++;
					}
				}
				return vcou;
		}
		public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter String values : ");
				String str = sc.nextLine();
				
				int vcou = vCount(str);
				System.out.print("The vowel count of that Strings : "+vcou);
				
		}
}

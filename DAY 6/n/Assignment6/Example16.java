import java.util.*;
class Example16{
		public static void findP(){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enater a number : ");
			int num = sc.nextInt();
			if(num<=0){
				
			}else{
				int tot = 0;
				for(int i = 1;i<num;i++){
					if(num%i==0){
						tot+=i;
					}
				}
				if(tot==num){
						System.out.print(num+" is a perfect number ");
				}else{
						System.out.print(num+" is not a perfect number ");
				}
			
			}
			
				
		}
		public static void main(String args[]){
				findP();
		}
}

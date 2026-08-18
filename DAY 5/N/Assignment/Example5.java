import java.util.*;
class Example5{
		public static void main(String args[]){
				Random random = new Random();
				
				for(int i= 0;i<10;i++){
						int randomNum = random.nextInt(101);
						System.out.println(randomNum);
				}
		}
}

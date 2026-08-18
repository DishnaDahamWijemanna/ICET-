import java.util.*;
class Example6{
		public static void main(String args[]){
				Random r = new Random();
				for(int i = 1;i<=50;i++){
						int rNum = r.nextInt(101);
						if(rNum%2==1){
							System.out.println(rNum);
						}
				}
		}
}

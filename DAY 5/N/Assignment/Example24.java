import java.util.*;
class Example24{
		public static void main(String args[]){
				Random ran = new Random();
				int head = 0;
				int tail = 0;
				for(int i = 0;i<10;i++){
					boolean tOF = ran.nextBoolean();
					if(tOF){
						System.out.println("HEAD");	
						tail++;
					}else{
						System.out.println("TAIL");	
						head++;
					}
				}
				
			   System.out.print("Statistics: "+head+" Heads and "+tail+" Tails");	
		}
	
}

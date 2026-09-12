import java.util.*;
class Example5{
		public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the no of student : ");
				int n = sc.nextInt();
				
				System.out.print("Enter the no of subject : ");
				int s = sc.nextInt();
				
				int [][] ar= new int[n][s];
				Random r = new Random();
				for(int i=0; i<n; i++){	
					for(int j=0; j<s; j++){
						ar[i][j]=r.nextInt(101); 
					}
				}
				for(int i = 0;i<s;i++){
						
					System.out.printf("sub%-3d\t",(i+1));
					
				}
				int [] avg = int[n];
				
				System.out.println("avg");
				for(int i=0;i<n;i++){
					int tot =0;
						for(int j=0;j<s;j++){
							tot+=ar[i][j];
							
								
						}
						avg[i]=tot/s;
				}
				System.out.println();
				for(int i =0;i<n;i++){
					for(int j=0;j<s;j++){
						System.out.printf("%-6d\t",ar[i][j]);
					}
					System.out.println();
				}
				
				
		}
}

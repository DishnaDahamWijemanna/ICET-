import java.util.*;
class Example3{
		public static void main(String args[]){
			int[] fX ={2362,2311,1917,1912,1887,1854,1717,1717,1779,1705,1806,1896};
			System.out.printf("Month\t\tUSD Million\n");
			System.out.printf("January      %14s\n",fX[0]);
			System.out.printf("February     %14s\n",fX[1]);
			System.out.printf("March        %14s\n",fX[2]);
			System.out.printf("April        %14s\n",fX[3]);
			System.out.printf("May          %14s\n",fX[4]);
			System.out.printf("June         %14s\n",fX[5]);
			System.out.printf("July         %14s\n",fX[6]);
			System.out.printf("August       %14s\n",fX[7]);
			System.out.printf("September    %14s\n",fX[8]);
			System.out.printf("October      %14s\n",fX[9]);
			System.out.printf("November     %14s\n",fX[10]);
			System.out.printf("December     %14s\n",fX[11]);
			System.out.println();
			
			
			fX [3]=1812;
			fX [6]=1817;
			
			System.out.println("April-"+fX[3]);
			System.out.println("July-"+fX[6]);
		}
}

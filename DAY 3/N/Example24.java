import java.util.*;
class Example24{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.println("Input mm: ");//123456789
				int mm= input.nextInt();
				//find k,m,cm,mm
				int km,m,cm;
				km=mm/1000000;
				mm=mm%1000000;
				m=mm/1000;
				mm=mm%1000;
				cm=mm/10;
				mm=mm%10;
				System.out.println(km+"km, "+m+"m, "+cm+"cm, "+mm+"mm"); //123Km,456m,78cm,9mm

				
		}
}

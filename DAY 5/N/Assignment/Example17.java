import java.util.*;
class Example17 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n5k = 0, n2k = 0, n1k = 0, n500 = 0, n200 = 0, n100 = 0;
        int n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, c1 = 0;
        System.out.print("Input number of Employees: ");
        int numEmp = input.nextInt();
        for (int i = 1; i <= numEmp; i++) {
            System.out.print("Input salary " + i + " : ");
            int salary = input.nextInt();
            n5k  += salary / 5000; 
            salary %= 5000;
            n2k  += salary / 2000; 
            salary %= 2000;
            n1k  += salary / 1000; 
            salary %= 1000;
            n500 += salary / 500;  
            salary %= 500;
            n200 += salary / 200;  
            salary %= 200;
            n100 += salary / 100;  
            salary %= 100;
            n50  += salary / 50;   
            salary %= 50;
            n20  += salary / 20;   
            salary %= 20;
            n10  += salary / 10;   
            salary %= 10;
            n5   += salary / 5;    
            salary %= 5;
            n2   += salary / 2;    
            salary %= 2;
            c1   += salary / 1;    
            salary %= 1;
			System.out.println("R5000 notes  :\t" + n5k);
			System.out.println("R2000 notes  :\t" + n2k);
			System.out.println("R1000 notes  :\t" + n1k);
			System.out.println("R500 notes   :\t" + n500);
			System.out.println("R200 notes   :\t" + n200);
			System.out.println("R100 notes   :\t" + n100);
			System.out.println("R50 notes    :\t" + n50);
			System.out.println("R20 notes    :\t" + n20);
			System.out.println("R10 coins    :\t" + n10);
			System.out.println("R5 coins     :\t" + n5);
			System.out.println("R2 coins     :\t" + n2);
			System.out.println("R1 Coins     :\t" + c1);
			System.out.println();
		}
		
		
    }
}

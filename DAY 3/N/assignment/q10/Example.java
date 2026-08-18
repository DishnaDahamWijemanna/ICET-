class Example{
		public static void main(String args[]){
				int a=10,b=20;
				int x;
				
				x= a + b;//a-->10 + 20 = 30
				System.out.println(x);
				x= a +-b;//b-->10 + -20= -10
				System.out.println(x);
				x= ++a +b;//c--> 11 + 20 = 31
				System.out.println(x);
				x= a+ b++;//d--> 11 + 20 = 31
				System.out.println(x);
				x= ++a + b++;//e--> 12 + 21 = 33
				System.out.println(x);
				x= a++ + b++;//f--> 12 + 22 = 34
				System.out.println(x);
				x= ++a + ++b;//g--> 14 + 24 = 38
				System.out.println(x);
				x= a++ + ++b;//h--> 14 + 25 = 39
				System.out.println(x);		
		}
}

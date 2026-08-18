class Example11{
		public static void main(String args[]){
				boolean b=true;
				System.out.println(b);//A
				System.out.println(b=true);//B
				System.out.println(b==true);//C
				System.out.println(b!=true);//D
				System.out.println(b=true==true);//E
				System.out.println((b=true)==false);//F
				System.out.println(b=(true!=false));//G		
		}
}

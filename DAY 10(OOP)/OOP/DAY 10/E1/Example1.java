class Example1{
		public static void main(String args[]){
		int[] ar;
		ar=new int[3];
		ar[0]=100;
		System.out.println(ar[0]); //prints 100
		
		Student s1;
		s1=new Student();
		s1.stId="S0001";
		s1.stName="Niroth";
		s1.prfMarks=45;
		s1.dbmsMarks=65;
		
		System.out.println("Student ID   : "+s1.stId);
		System.out.println("Student Name : "+s1.stName);
		System.out.println("PRF marks    : "+s1.prfMarks);
		System.out.println("DBMS marks   : "+s1.dbmsMarks);
	}
}

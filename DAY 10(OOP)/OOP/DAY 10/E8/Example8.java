class MyClass{
	int value;
	
	public void printKeywordThis(){
		System.out.println(this);
	}
}
class Example8{	
	public static void main(String args[]){
		MyClass c1=new MyClass();
		MyClass c2=new MyClass();
		
		System.out.println("c1 : "+c1);
		c1.printKeywordThis();
		System.out.println();
		
		System.out.println("c2 : "+c2);
		c2.printKeywordThis();
	}	
}


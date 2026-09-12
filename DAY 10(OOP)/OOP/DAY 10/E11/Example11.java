class Box{
	int length;
	int width;
	int height;
	Box(){
		//default values
	}
	Box(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public void printBox(){
		System.out.println(length+", "+width+", "+height);
	}
	public void copyValuesFrom(Box box){
			this.length=box.length;
			this.width=box.width;
			this.height=box.height;

	}
}
class Example11{	
	public static void main(String args[]){
		Box b1=new Box(12,5,3);
		b1.printBox(); //12, 5, 3
		
		Box b2=new Box(); //default constructor
		b2.printBox(); //0, 0, 0
		
		b2.copyValuesFrom(b1);
		b2.printBox(); //12, 5, 3
	}	
}

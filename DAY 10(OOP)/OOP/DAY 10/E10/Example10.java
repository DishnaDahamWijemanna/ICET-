class Box{
	int length;
	int width;
	int height;
	Box(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public void printBox(){
		System.out.println(length+", "+width+", "+height);
	}
}
class BoxController{
	public static void incrementLength(Box b1){
		b1.length+=10;
		b1.width+=10;
		b1.height+=10;
	}
}
class Example10{	
	public static void main(String args[]){
		Box b1=new Box(12,5,3);
		b1.printBox(); //12, 5, 3
//BoxController.incrementLength(b1.length, b1.width, b1.height);
//b1.printBox(); //12, 5, 3
		BoxController.incrementLength(b1);
		b1.printBox();
	}	
}


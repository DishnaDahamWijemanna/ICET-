class Box{
	int length;
	int width;
	int height;
	
	public Box(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public Box(int length){
		this.length=length;
		this.width=length;
		this.height=length;
	}
	public Box(){
		this.length=1;
		this.width=1;
		this.height=1;
	}

	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box : "+volume);		
	}
}
class Example9{	
	public static void main(String args[]){
		Box b1=new Box(12,5,3);
		b1.printVolume(); //180

		Box b2=new Box(10);
		b2.printVolume(); //1000

		Box b3=new Box();
		b3.printVolume(); //1
	}	
}


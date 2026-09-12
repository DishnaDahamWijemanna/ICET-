class Box{
	private int length;
	private int width;
	private int height;

	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box : "+volume);		
	}
	public void setSize(int l, int w, int h){
		length=l;
		width=w;
		height=h;
	}
	public void setLength(int length){
			this.length = length;
	}
	public void setWidth(int width){
			this.width= width;
	}
	public void setHeight(int height){
			this.height = height;
	}
	
	public int getLength(){
		return length;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
}
class Example6{	
	public static void main(String args[]){
		Box b1=new Box();
		b1.setSize(12,5,3);
		b1.printVolume();
		
		b1.setLength(120);//b1.length=120
		b1.setWidth(50);//b1.width=50;
		b1.setHeight(30);//b1.height=30;
		System.out.println("Length : "+b1.getLength());
		System.out.println("Width  : "+b1.getWidth());
		System.out.println("Height : "+b1.getHeight());
	}	
}


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
class Example13{	
	public static void main(String args[]){
		Box[] br=new Box[5];

		br[0]=new Box(1,2,3);
		br[1]=new Box(3,4,5);
		br[2]=new Box(5,6,7);
		br[3]=new Box(7,8,9);
		br[4]=new Box(9,10,11);
		
		for(int i=0; i<br.length; i++){
			Box box=br[i];
			box.printBox();
		}
	}	
}



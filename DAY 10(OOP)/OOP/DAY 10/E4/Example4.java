class Box{
		int length;
		int width;
		int height;
		//methods declarations
		public void printVolume(){
			int volume = length * width * height;
			System.out.println("Box Volume = "+ volume);
		}
		public void printArea(){
			int area = 2*(length * width)+2*(length * height)+2*(width * height);
			System.out.println("Box Area = "+ area);
		}
}

class Example4{
		public static void main(String args[]){
				Box b1 =new Box();
				b1.length=12;
				b1.width=5;
				b1.height=3;
				
				b1.printVolume(); //method calling by class
				b1.printArea();
		}
}

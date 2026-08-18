class Example19{
	public static void main(String args[]){
		int i=0;
		for(int i=0;i<10;i++){}   //illega
		
//-------------------------------------------------		
		
		for(int i=0;i<10;i++){}  //lega
		for(int i=0;i<10;i++){}
		
//-------------------------------------------------------		
		for(int i=0;i<10;i++){    //illega
		int i=3;
		}
		
//------------------------------------------------------		
		{int i=0;}
		for(int i=0;i<10;i++){}   //lega
		
	}
}
